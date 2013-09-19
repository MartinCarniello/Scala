package escuela

import scala.collection.mutable.HashMap

class GrupoDeInvestigacion(grupoDeInvestigacion: List[Integrante],val actividades: List[Actividad]) {

	def actividadesNoAprobadas: Map[String, Int] = { 
		actividades.filterNot(_.aprobada).map(act => (act.nombre, act.financiamiento)).toMap
	}
	
	def articulosPublicados: List[Resultado] = { 
	  actividades.map( act => act match {
	        			case p : Proyecto => p.resultados
	        			case _ => List() }).foldLeft(List(): List[Resultado])(_ ++ _).filter(_.resultado.matches("articulo"))
	}
	
}