package escuela

object Main {

  def main(args: Array[String]) {
		
	  var cursadaAprobada: Cursada = new Cursada("Matematica", true, 6)
	  var cursadaAprobada2: Cursada = new Cursada("Quimica", true, 10)
	  var cursadaAprobada3: Cursada = new Cursada("Literatura", true, 5)	  
	  var cursadaAbandonada: Cursada = new Cursada("Gestion", false,  0)
	  var cursadaAbandonada2: Cursada = new Cursada("Informatica", false,  0)
	  var cursadaDesaprobada: Cursada = new Cursada("Filosofia", true, 3)
	  var cursadaDesaprobada2: Cursada = new Cursada("Carpinteria", true, 2)
	  
	  var cursadas1: List[Cursada] = List(cursadaAprobada, cursadaAprobada2, 
			  							cursadaAbandonada, cursadaDesaprobada2)
			  							
			  					// Promedio sin aplazos = (6 + 10) / 2 = 8
			  					// Promedio con aplazos = (6 + 10 + 2) / 3 = 6
			  				    // Cantidad de Cursadas aprobadas = 2
			  				    // Cantidad de abandonadas = 1
			  					// Porcentaje de cursos aprobados sobre cursos iniciados = (2 * 100) / 4 = 50
			  							
	  var cursadas2: List[Cursada] = List(cursadaAprobada3, cursadaDesaprobada, cursadaDesaprobada2, cursadaAbandonada2)
	  
	  							// Promedio sin aplazos = 5 / 1 = 5
			  					// Promedio con aplazos = (5, 3, 2) / 3 = 3,33
			  				    // Cantidad de Cursadas aprobadas = 1
			  				    // Cantidad de abandonadas = 1
			  					// Porcentaje de cursos aprobados sobre cursos iniciados = (1 * 100) / 4 = 25
	  
	  var alumno: Alumno = new Alumno("Jose", 20, cursadas1)
	  var alumno2: Alumno = new Alumno("Luis", 1, cursadas2)
		
	  var res1: Resultado = new Resultado("articulo", 100)
	  var res2: Resultado = new Resultado("res2", 200)
	  var exp1: Experimento = new Experimento(300, 301, 302, "exp1")
	  var exp2: Experimento = new Experimento(400, 401, 402, "exp1")
	  var proyecto: Proyecto = new Proyecto(true, "proyecto", 1000, List(res1, res2), List(exp1, exp2))
	  
	  var charla: Charla = new Charla(true, "charla", 500, 10, 500, 501, 502)
	  
	  var sesion1: Sesion = new Sesion(600, 601, 602)
	  var sesion2: Sesion = new Sesion(700, 701, 702)
	  var seminario: Seminario = new Seminario(true, "seminario", 800, List(sesion1, sesion2))
	  
	  var grupo: GrupoDeInvestigacion = new GrupoDeInvestigacion(List(alumno, alumno2), List(proyecto, charla, seminario))
	  	
	  var alumnos: List[Alumno] = List(alumno, alumno2)
	  	
	  var carrera: Carrera = new Carrera(alumnos)
	  
	  //println(grupo.actividadesNoAprobadas)
	  //println(grupo.articulosPublicados)
	  println(alumno.getAgenda)
	  println(alumno2.getAgenda)
	  //println(carrera.promediosSinAplazos)
	  //println(carrera.promediosConAplazos)
	  //println(carrera.cantidadDeCursadasAprobadas)
	  //println(carrera.cantidadDeCursadasAbandonadas)
	  //println(carrera.porcentajeDeCursadasAprobadas)
	  //println(carrera.tablaDeNotas)
	  //println(carrera.notaMasAlta(2))
  }

}