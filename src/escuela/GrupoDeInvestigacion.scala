package escuela

import scala.collection.mutable.HashMap

class GrupoDeInvestigacion(grupoDeInvestigacion: List[Integrante], actividades: List[Actividad]) {

	def actividadesNoAprobadas: HashMap[String, Int] = { 
	
	  val hash = new HashMap[String, Int]()
	  
	  for(a <- actividades.filter(_.aprobada)) {
		  hash += (a.nombre -> a.financiamiento)
	  }
	  
	  return hash 
	  
	}
	
	def articulosPublicados: List[Resultado] = { actividades.map( _ match { case p: Proyecto => p.resultado } ) }
}