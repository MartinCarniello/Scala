package escuela

case class Escuela(alumnos: List[Alumno], carreras: List[Carrera], docentes: List[Docente])
case class Carrera(alumnos: List[Alumno]) extends ServicioNotas{
	def cursadas: List[Cursada] = { alumnos.flatMap(_.cursadas) }
}
case class Materia(cursos: List[Curso]) extends ServicioNotas {
  def cursadas: List[Cursada] = { cursos.flatMap(_.cursadas) }
}
case class Curso(cursadas: List[Cursada]) extends ServicioNotas
case class Cursada(nombre: String, terminada: Boolean, nota: Int, alumno: Alumno, anio: Int) {
	def aprobo: Boolean = nota match {
	  	case x if x > 3 => true
	  	case _ => false
	}
}