package escuela

import scala.collection.mutable.HashMap

class GrupoDeInvestigacion(grupoDeInvestigacion: List[Integrante],val actividades: List[Actividad]) {

	def actividadesNoAprobadas: Map[String, Int] = { 
	  actividades.filterNot(_.aprobada).map(act => (act.nombre, act.financiamiento)).toMap
	}
	
	def articulosPublicados: List[Resultado] = { 
	  actividades.filter( _ match { case p: Proyecto => true case _ => false } ).map(
	  _.asInstanceOf[Proyecto].resultados.filter(_.resultado.matches("articulo"))).foldLeft(List(): List[Resultado])(_ ++ _)
	}
	
}