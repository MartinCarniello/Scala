package escuela

class Alumno(nombre: String, legajo: Int, cursadas: List[Cursada]) {

	def notasSinAplazo: List[Int] = { cursadas.filter(_.getNota > 3).map(_.getNota) }
	
	def notasConAplazo: List[Int] = { cursadas.map(_.getNota) }
	
	def promedioNotasSinAplazo: Int = { notasSinAplazo.foldLeft(0)(_ + _) / notasSinAplazo.length }
	
	def promedioNotasConAplazo: Int = { notasConAplazo.foldLeft(0)(_ + _) / notasSinAplazo.length }
	
	def cantidadDeCursadasAprobadas: Int = { 
								cursadas.filter(_.aprobo).length
	  						}
	
	def cantidadDeCursadasAbandonadas: Int = {
									cursadas.filterNot(_.getTerminada).length
								}
	
	def porcentajeDeCursadasAprobadas: Int = { (cursadas.filter(_.aprobo).length * 100) / cursadas.length }
}