package escuela

import scala.collection.mutable.HashMap
import scala.collection.mutable.Set

class Alumno(nombre: String, legajo: Int, 
		cursadas: List[Cursada]) extends Integrante(nombre, legajo, Set()){
  
	def notasSinAplazo: List[Int] = { cursadas.filter(_.getNota > 3).map(_.getNota) }
	
	def notasConAplazo: List[Int] = { cursadas.filter(_.getTerminada) map (_.getNota) }
	
	def promedioNotasSinAplazo: Float = { notasSinAplazo.sum / notasSinAplazo.length }
	
	def promedioNotasConAplazo: Float = { notasConAplazo.sum / notasConAplazo.length }
	
	def cantidadDeCursadasAprobadas: Int = { 
								cursadas.filter(_.aprobo).length
	  						}
	
	def cantidadDeCursadasAbandonadas: Int = {
									cursadas.filterNot(_.getTerminada).length
								}
	
	def porcentajeDeCursadasAprobadas: Int = { (cursadas.filter(_.aprobo).length * 100) / cursadas.length }
	
	def tablaDeNotas: Map[Int, Int] = { ((1 to 10).map(x => (x, cursadas.filter(_.getNota == x).length))).toMap	}
	
	def notaMasAlta(x: Int): Int = {
	  
	  var acu = 0
	  
	  for(i <- 10 to 1 by -1) {
	    cursadas.filter(_.getNota == i).length + acu match {
	      case size if size >= x => return i
	      case _ => acu += cursadas.filter(_.getNota == i).length
	    }
	  }
	  
	  return 0
	}
}