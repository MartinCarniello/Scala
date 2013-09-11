package escuela

import scala.collection.mutable.HashMap

class Carrera(alumnos: List[Alumno]) {
	
	def promediosSinAplazos: List[Int] = { alumnos.map(_.promedioNotasSinAplazo) }
	
	def promediosConAplazos: List[Int] = { alumnos.map(_.promedioNotasConAplazo) }
	
	def cantidadDeCursadasAprobadas: List[Int] = { alumnos.map(_.cantidadDeCursadasAprobadas) }
	
	def cantidadDeCursadasAbandonadas: List[Int] = { alumnos.map(_.cantidadDeCursadasAbandonadas) }
	
	def porcentajeDeCursadasAprobadas: List[Int] = { alumnos.map(_.porcentajeDeCursadasAprobadas) }
	
	def tablaDeNotas: List[HashMap[Int, Int]] = { alumnos.map(_.tablaDeNotas) }
	
	def notaMasAlta(x: Int): List[Int] = { alumnos.map(_.notaMasAlta(x)) }
}