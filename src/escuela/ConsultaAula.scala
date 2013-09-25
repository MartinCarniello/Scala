package escuela

trait ConsultaAula {
  
	def cantidadDeIntegrantes: Int
	
	def requerimientos: List[String]
  
	def meSirve(aula : Aula): Boolean = {
	  	cantidadDeIntegrantes <= aula.capacidad && !requerimientos.map(aula.recursos.contains(_)).contains(false)
  	}

}