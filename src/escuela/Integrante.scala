package escuela

import scala.collection.mutable.Set

abstract class Integrante(val nombre: String, legajo: Int, val gruposDeInvestigacion: Set[GrupoDeInvestigacion]) {
  
  def ingresarAGrupo(grupo: GrupoDeInvestigacion) = { this.gruposDeInvestigacion.add(grupo) }
  
  def getAgenda : List[Evento] = { this.gruposDeInvestigacion.map(_.actividades).foldLeft(
		  			List(): List[Actividad])(_ ++ _).map(_.getEventos).foldLeft(List(): List[Evento])(_ ++ _) }
  
}