package object escuela {

	def main(args: Array[String]) {
		
	  var alumno: Alumno = Alumno("Jose", 20)
	  var alumno2: Alumno = Alumno("Luis", 1)
	  
	  var cursadaAprobada: Cursada = Cursada("Matematica", true, 6, alumno, 2013)
	  var cursadaAprobada2: Cursada = Cursada("Quimica", true, 10, alumno, 2012)
	  var cursadaAprobada3: Cursada = Cursada("Literatura", true, 5, alumno2, 2010)	  
	  var cursadaAbandonada: Cursada = Cursada("Gestion", false,  0, alumno, 2013)
	  var cursadaAbandonada2: Cursada = Cursada("Informatica", false,  0, alumno2, 2012)
	  var cursadaDesaprobada: Cursada = Cursada("Filosofia", true, 3, alumno2, 2010)
	  var cursadaDesaprobada2: Cursada = Cursada("Carpinteria", true, 2, alumno, 2009)
	  
	  var cursadas1: List[Cursada] = List(cursadaAprobada, cursadaAprobada2, 
			  							cursadaAbandonada, cursadaDesaprobada2)
			  							
	  var curso1: Curso = Curso(cursadas1)
			  							
			  					// Promedio sin aplazos = (6 + 10) / 2 = 8
			  					// Promedio con aplazos = (6 + 10 + 2) / 3 = 6
			  				    // Cantidad de Cursadas aprobadas = 2
			  				    // Cantidad de abandonadas = 1
			  					// Porcentaje de cursos aprobados sobre cursos iniciados = (2 * 100) / 4 = 50
			  							
	  var cursadas2: List[Cursada] = List(cursadaAprobada3, cursadaDesaprobada, cursadaDesaprobada2, cursadaAbandonada2)
	  
	  var curso2: Curso = Curso(cursadas2)
	  
	  							// Promedio sin aplazos = 5 / 1 = 5
			  					// Promedio con aplazos = (5, 3, 2) / 3 = 3,33
			  				    // Cantidad de Cursadas aprobadas = 1
			  				    // Cantidad de abandonadas = 1
			  					// Porcentaje de cursos aprobados sobre cursos iniciados = (1 * 100) / 4 = 25
		
	  var res1: Resultado = Resultado("articulo", 100)
	  var res2: Resultado = Resultado("res2", 200)
	  var exp1: Experimento = Experimento(300, 301, 302, "exp1")
	  var exp2: Experimento = Experimento(400, 401, 402, "exp1")
	  var proyecto: Proyecto = Proyecto(true, "proyecto", 1000, List(res1, res2), List(exp1, exp2))
	  
	  var charla: Charla = Charla(true, "charla", 500, 10, 500, 501, 502)
	  
	  var sesion1: Sesion = Sesion(600, 601, 602)
	  var sesion2: Sesion = Sesion(700, 701, 702)
	  var seminario: Seminario = Seminario(true, "seminario", 800, List(sesion1, sesion2))
	  
	  var grupo: GrupoDeInvestigacion = new GrupoDeInvestigacion(List(alumno, alumno2), List(proyecto, charla, seminario))
	  
	  alumno.ingresarAGrupo(grupo)
	  	
	  var alumnos: List[Alumno] = List(alumno, alumno2)
	  	
	  var carrera: Carrera = new Carrera(alumnos)
	  
	  //println(grupo.actividadesNoAprobadas)
	  //println(grupo.articulosPublicados)
	  //println(alumno.getAgenda.map(_.fecha))
	  //println(carrera.promediosSinAplazos)
	  //println(carrera.promediosConAplazos)
	  //println(carrera.cantidadDeCursadasAprobadas)
	  //println(carrera.cantidadDeCursadasAbandonadas)
	  //println(carrera.porcentajeDeCursadasAprobadas)
	  //println(carrera.tablaDeNotas)
	  //println(carrera.notaMasAlta(2))
  }
}