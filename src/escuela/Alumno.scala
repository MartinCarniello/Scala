package escuela

import scala.collection.mutable.HashMap

class Alumno(nombre: String, legajo: Int, gruposDeInvestigacion: List[GrupoDeInvestigacion], 
		cursadas: List[Cursada]) extends Integrante(nombre, legajo, gruposDeInvestigacion){

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
	
	def tablaDeNotas: HashMap[Int, Int] = { 
	  
	  val hash = new HashMap[Int, Int]()
	  
	  for(x <- 1 to 10) {
	    hash += (x -> cursadas.filter(_.getNota == x).length)
	  }
	  
	  return hash
	  
	}
	
	def notaMasAlta(x: Int): Int = {
	  
	  var acu = 0
	  
	  for(i <- 10 to 1 by -1) {
	    
	    if((cursadas.filter(_.getNota == i).length + acu) >= x) {
	    	return i
	    }
	    else {
	      acu += cursadas.filter(_.getNota == i).length
	    }
	  }
	  
	  return 0
	}
}