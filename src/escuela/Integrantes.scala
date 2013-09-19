package escuela

import scala.collection.mutable.Set

abstract class Integrante {
  val nombre: String
  val legajo: Int
  def cursadas: List[Cursada]
  val gruposDeInvestigacion: Set[GrupoDeInvestigacion] = Set()
  
  def ingresarAGrupo(grupo: GrupoDeInvestigacion) = { gruposDeInvestigacion.add(grupo) }
  
  def getAgenda : List[Evento] = { gruposDeInvestigacion.map(_.actividades).foldLeft(
		  			List(): List[Actividad])(_ ++ _).flatMap(_.eventos)	  			
  }
}

case class Alumno(nombre: String, legajo: Int, cursadas: List[Cursada] = List[Cursada]()) extends Integrante with ServicioNotas
case class Docente(nombre: String, legajo: Int, cursadas: List[Cursada] = List[Cursada]()) extends Integrante with ServicioNotas