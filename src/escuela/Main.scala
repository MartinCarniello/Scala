package escuela

object Main {

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