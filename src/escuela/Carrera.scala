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

object Ejemplo {
	
	def main(args: Array[String]) {
		
	  	var cursada1: Cursada = new Cursada("c1", true, 8)
	  	var cursada2: Cursada = new Cursada("c2", true, 5)
	  	var cursada3: Cursada = new Cursada("c3", true, 3)
	  	var cursada4: Cursada = new Cursada("c4", true, 5)
	  
	  	var cursadas: List[Cursada] = List(cursada1, cursada2, cursada3, cursada4)
	  
		var alumno: Alumno = new Alumno("alumno", 20, cursadas)
	  	
	  	var alumnos: List[Alumno] = List(alumno)
	  	
	  	var carrera: Carrera = new Carrera(alumnos)
	  	
	  	println(carrera.notaMasAlta(5))
	}
}