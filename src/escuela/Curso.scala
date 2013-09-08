package escuela

class Cursada(nombre: String, terminada: Boolean, nota: Int) {
	
	def getNota = nota
	
	def getTerminada = terminada
	
	def aprobo: Boolean = this.getNota match {
	  	case x if x > 3 => true
	  	case _ => false
	}
	
}