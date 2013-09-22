package escuela

trait ServicioNotas {

	def cursadas: List[Cursada]
  
	def notasSinAplazo: List[Int] = { cursadas.filter(_.nota > 3).map(_.nota) }
	
	def notasConAplazo: List[Int] = { cursadas.filter(_.terminada).map(_.nota) }
	
	def promedioNotasSinAplazo: Float = { notasSinAplazo.sum / notasSinAplazo.length }
	
	def promedioNotasConAplazo: Float = { notasConAplazo.sum / notasConAplazo.length }
	
	def cantidadDeCursadasAprobadas: Int = { cursadas.filter(_.aprobo).length }
	
	def cantidadDeCursadasAbandonadas: Int = { cursadas.filterNot(_.terminada).length }
	
	def porcentajeDeCursadasAprobadas: Int = { (cursadas.filter(_.aprobo).length * 100) / cursadas.length }
	
	def tablaDeNotas: Map[Int, Int] = { ((1 to 10).map(x => (x, cursadas.filter(_.nota == x).length))).toMap }
	
	def notaMasAlta(x: Int): Int = {
	  var acu = 0
	  for(i <- 10 to 1 by -1) {
	    cursadas.filter(_.nota == i).length + acu match {
	      case size if size >= x => return i
	      case _ => acu += cursadas.filter(_.nota == i).length
	    }
	  }
	  return 0
	}
	
}

trait ServicioNotasPorAnio extends ServicioNotas {
  
	def corteAnual(anio: Int): Integrante
	
	def promedioNotasSinAplazo(anio: Int): Float = { corteAnual(anio).promedioNotasSinAplazo }
	
	def promedioNotasConAplazo(anio: Int): Float = { corteAnual(anio).promedioNotasConAplazo }
	
	def cantidadDeCursadasAprobadas(anio: Int): Int = { corteAnual(anio).cantidadDeCursadasAprobadas }
	
	def cantidadDeCursadasAbandonadas(anio: Int): Int = { corteAnual(anio).cantidadDeCursadasAbandonadas }
	
	def porcentajeDeCursadasAprobadas(anio: Int): Int = { corteAnual(anio).porcentajeDeCursadasAprobadas }
	
	def tablaDeNotas(anio: Int): Map[Int, Int] = { corteAnual(anio).tablaDeNotas }
	
	def notaMasAlta(anio: Int, x: Int): Int = { corteAnual(anio).notaMasAlta(x) }
}