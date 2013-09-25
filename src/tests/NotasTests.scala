package tests
import org.scalatest._
import escuela._
import org.scalatest.matchers.ShouldMatchers

class NotasTests extends FlatSpec with ShouldMatchers {
  
	def fixture =
	    new {
			//DOCENTES
			var docente1: Docente = Docente("Carlos", 9)
			var docente2: Docente = Docente("Hector", 10)
	  
			//ALUMNOS
			var alumno1: Alumno = Alumno("Jose", 1)
			var alumno2: Alumno = Alumno("Luis", 2)
			var alumno3: Alumno = Alumno("Pedro", 3)
			var alumno4: Alumno = Alumno("Jorge", 4)
			var alumno5: Alumno = Alumno("Matias", 5)
			var alumno6: Alumno = Alumno("Hernan", 6)
			var alumno7: Alumno = Alumno("Andres", 7)
			var alumno8: Alumno = Alumno("Gaston", 8)
			
			//CURSADAS
	      	var cursada1: Cursada = Cursada("OB3", true, 6.0, alumno1, 2013, 1)
	    	var cursada2: Cursada = Cursada("Seguridad", true, 10.0, alumno1, 2012, 3)
	    	var cursada3: Cursada = Cursada("OB3", true, 5.0, alumno2, 2013, 1)
	    	var cursada4: Cursada = Cursada("Seguridad", false,  0.0, alumno2, 2012, 3)
	    	var cursada5: Cursada = Cursada("OB3", false,  0.0, alumno3, 2011, 2)
			var cursada6: Cursada = Cursada("Seguridad", true, 8.0, alumno3, 2010, 4)
			var cursada7: Cursada = Cursada("OB3", true, 2.0, alumno4, 2011, 2)
			var cursada8: Cursada = Cursada("Seguridad", true, 4.0, alumno4, 2010, 4)
			var cursada9: Cursada = Cursada("OB3", true, 3.0, alumno5, 2013, 1)
			var cursada10: Cursada = Cursada("Seguridad", true, 7.0, alumno6, 2012, 3)
			var cursada11: Cursada = Cursada("OB3", true, 6.0, alumno7, 2011, 2)
			var cursada12: Cursada = Cursada("Seguridad", false, 0.0, alumno8, 2010, 4)
			
			//SETEAR CURSADAS A ALUMNOS
			alumno1.setCursadas(List(cursada1, cursada2))
			alumno2.setCursadas(List(cursada3, cursada4))
			alumno3.setCursadas(List(cursada5, cursada6))
			alumno4.setCursadas(List(cursada7, cursada8))
			alumno5.setCursadas(List(cursada9))
			alumno6.setCursadas(List(cursada10))
			alumno7.setCursadas(List(cursada11))
			alumno8.setCursadas(List(cursada12))
			
			//SETEAR CURSADAS A DOCENTES
			docente1.setCursadas(List(cursada1, cursada3, cursada5, cursada7, cursada9, cursada11))
			docente2.setCursadas(List(cursada2, cursada4, cursada6, cursada8, cursada10, cursada12))
			
			//CURSOS
			var curso1: Curso = Curso(List(alumno1, alumno2, alumno5), List("pizarron", "proyector"), 1)
			var curso2: Curso = Curso(List(alumno3, alumno4, alumno7), List("pizarron", "microfono"), 2)
			var curso3: Curso = Curso(List(alumno1, alumno2, alumno6), List("pizarron"), 3)
			var curso4: Curso = Curso(List(alumno3, alumno4, alumno8), List("pizarron", "proyector", "microfono"), 4)
			
			//MATERIAS
			var materia1: Materia = Materia(List(curso1, curso2))
			var materia2: Materia = Materia(List(curso3, curso4))
			
			var carrera = Carrera(List(materia1, materia2))
	    }	  

		
//	  var res1: Resultado = Resultado("articulo", 100)
//	  var res2: Resultado = Resultado("res2", 200)
//	  var exp1: Experimento = Experimento(300, 301, 302, "exp1")
//	  var exp2: Experimento = Experimento(400, 401, 402, "exp1")
//	  var proyecto: Proyecto = Proyecto(true, "proyecto", 1000, List(res1, res2), List(exp1, exp2))
//	  
//	  var charla: Charla = Charla(true, "charla", 500, 10, 500, 501, 502)
//	  
//	  var sesion1: Sesion = Sesion(600, 601, 602)
//	  var sesion2: Sesion = Sesion(700, 701, 702)
//	  var seminario: Seminario = Seminario(true, "seminario", 800, List(sesion1, sesion2))
//	  
//	  var grupo: GrupoDeInvestigacion = new GrupoDeInvestigacion(List(alumno, alumno2), List(proyecto, charla, seminario))
//	  
//	  alumno.ingresarAGrupo(grupo)
//	  	
//	  var alumnos: List[Alumno] = List(alumno, alumno2)
//	  	
//	  var carrera: Carrera = new Carrera(alumnos)
	
	//PROMEDIOS SIN APLAZOS
	
	"promedioSinAplazos from alumno1" should "be 8" in {
		fixture.alumno1.promedioNotasSinAplazo should equal(8.0)
	}

	"promedioSinAplazos from curso1" should "be 5.5" in {
		fixture.curso1.promedioNotasSinAplazo should equal(5.5)
	}
	
	"promedioSinAplazos from materia1" should "be 5.666666666666667" in {
		fixture.materia1.promedioNotasSinAplazo should equal(5.666666666666667)
	}
	
	"promedioSinAplazos from carrera" should "be 6.571428571428571" in {
		fixture.carrera.promedioNotasSinAplazo should equal(6.571428571428571)
	}
	
	
	
	//PROMEDIOS CON APLAZOS
	
	"promedioConAplazos from alumno4" should "be 3.0" in {
		fixture.alumno4.promedioNotasConAplazo should equal(3.0)
	}

	"promedioConAplazos from curso2" should "be 4.0" in {
		fixture.curso2.promedioNotasConAplazo should equal(4.0)
	
	}
	
	"promedioConAplazos from materia2" should "be 7.25" in {
		fixture.materia2.promedioNotasConAplazo should equal(7.25)
	}
	
	"promedioConAplazos from carrera" should "be 5.666666666666667" in {
		fixture.carrera.promedioNotasConAplazo should equal(5.666666666666667)
	}
	
	//CANTIDAD CURSADAS APROBADAS
	
	"cantidadDeCursadasAprobadas from alumno2" should "be 1" in {
		fixture.alumno2.cantidadDeCursadasAprobadas should equal(1)
	}

	"cantidadDeCursadasAprobadas from curso1" should "be 2" in {
		fixture.curso1.cantidadDeCursadasAprobadas should equal(2)
	
	}
	
	"cantidadDeCursadasAprobadas from materia1" should "be 3" in {
		fixture.materia1.cantidadDeCursadasAprobadas should equal(3)
	}
	
	"cantidadDeCursadasAprobadas from carrera" should "be 7" in {
		fixture.carrera.cantidadDeCursadasAprobadas should equal(7)
	}
	
	
	//CANTIDAD DE CURSADAS ABANDONADAS
	
	"cantidadDeCursadasAbandonadas from alumno2" should "be 1" in {
		fixture.alumno2.cantidadDeCursadasAbandonadas should equal(1)
	}

	"cantidadDeCursadasAbandonadas from curso1" should "be 0" in {
		fixture.curso1.cantidadDeCursadasAbandonadas should equal(0)
	
	}
	
	"cantidadDeCursadasAbandonadas from materia1" should "be 1" in {
		fixture.materia1.cantidadDeCursadasAbandonadas should equal(1)
	}
	
	"cantidadDeCursadasAbandonadas from carrera" should "be 3" in {
		fixture.carrera.cantidadDeCursadasAbandonadas should equal(3)
	}
	
	//NOTA MAS ALTA
	
	"notaMasAlta(2) from alumno1" should "be 6" in {
		fixture.alumno1.notaMasAlta(2) should equal(6)
	}

	"notaMasAlta(3) from curso1" should "be 3" in {
		fixture.curso1.notaMasAlta(3) should equal(3)
	
	}
	
	"notaMasAlta(3) from materia2" should "be 7" in {
		fixture.materia2.notaMasAlta(3) should equal(7)
	}
	
	"notaMasAlta(0) from carrera" should "be 10" in {
		fixture.carrera.notaMasAlta(0) should equal(10)
	}
	
	//PORCENTAJE CURSADAS APROBADAS

	"porcentajeDeCursadasAprobadas from alumno4" should "be 50" in {
		fixture.alumno4.porcentajeDeCursadasAprobadas should equal(50)
	}

	"porcentajeDeCursadasAprobadas from curso2" should "be 33" in {
		fixture.curso2.porcentajeDeCursadasAprobadas should equal(33)
	}
	
	"porcentajeDeCursadasAprobadas from materia1" should "be 50" in {
		fixture.materia1.porcentajeDeCursadasAprobadas should equal(50)
	}
	
	"porcentajeDeCursadasAprobadas from carrera" should "be 58" in {
		fixture.carrera.porcentajeDeCursadasAprobadas should equal(58)
	}
	
	//CORTE ANUAL
	
	"corteAnual(2013).cursadas.size from alumno1" should "be 1" in {
		fixture.alumno1.corteAnual(2013).cursadas.size should equal(1)
		fixture.alumno1.corteAnual(2013).cursadas.head.nombre should equal("OB3")
	}
}