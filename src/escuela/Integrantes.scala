package escuela

import scala.collection.mutable.Set
import scala.collection.mutable.Buffer

abstract class Integrante extends ServicioNotas {
  val nombre: String
  val legajo: Int
  def cursadas: List[Cursada]
  val gruposDeInvestigacion: Set[GrupoDeInvestigacion] = Set()
  
  def ingresarAGrupo(grupo: GrupoDeInvestigacion) = { gruposDeInvestigacion.add(grupo) }
  
  def getAgenda : List[Evento] = { 
    gruposDeInvestigacion.map(_.actividades).foldLeft(List(): List[Actividad])(_ ++ _).flatMap(_.eventos)	  			
  }
  
  def corteAnual(anio: Int): CorteAnual = {
	  CorteAnual(cursadas.filter(_.anio == anio))
  }
}

case class Alumno(nombre: String, legajo: Int, var cursadas: List[Cursada] = List[Cursada]()) extends Integrante {
	def setCursadas(cs: List[Cursada]) = { cursadas = cs }
}
case class Docente(nombre: String, legajo: Int, var cursadas: List[Cursada] = List[Cursada]()) extends Integrante {
	def setCursadas(cs: List[Cursada]) = { cursadas = cs }
}

case class CorteAnual(cursadas: List[Cursada]) extends ServicioNotas