package escuela

case class Escuela(alumnos: List[Alumno], carreras: List[Carrera], docentes: List[Docente])

case class Carrera(materias: List[Materia]) extends ServicioNotas{
	def cursadas: List[Cursada] = { materias.flatMap(_.cursadas) }
}

case class Materia(cursos: List[Curso]) extends ServicioNotas {
	def cursadas: List[Cursada] = { cursos.flatMap(_.cursadas) }
}

case class Curso(alumnos: List[Alumno], requerimientos: List[String], id: Int) extends ServicioNotas with ConsultaAula{
	def cursadas: List[Cursada] = { alumnos.flatMap(_.cursadas).filter(_.idCurso == id) }
	def capacidad : Int = { cursadas.length }
	def cantidadDeIntegrantes: Int = { alumnos.size }  
}

case class Cursada(nombre: String, terminada: Boolean, nota: Int, alumno: Alumno, anio: Int, idCurso: Int) {
	def aprobo: Boolean = nota match {
	  	case x if x > 3 => true
	  	case _ => false
	}
}

case class Aula(capacidad: Int, recursos: List[String]){
  
}