package escuela

abstract class Actividad{
  val aprobada: Boolean
  val nombre: String
  val financiamiento: Int
  val responsable: Integrante
  val integrantes: List[Integrante]
  def eventos : List[Evento]
}

case class Seminario(aprobada: Boolean, nombre: String, financiamiento: Int, sesiones: List[Sesion], responsable: Integrante, integrantes: List[Integrante], requerimientos: List[String]) extends Actividad with ConsultaAula {
	override def eventos: List[Evento] = { sesiones.map(_.evento(nombre))}
	def cantidadDeIntegrantes: Int = { 1 + integrantes.size }
}

case class Sesion(fecha: Int, horaInicio: Int, horaFin: Int){
  def evento(nombre : String) : Evento = { Evento(fecha, horaInicio, horaFin, nombre) }
}

case class Charla(aprobada: Boolean, nombre: String, financiamiento: Int, cantidadDePublico: Int, dia: Int, horaInicio: Int, horaFin: Int, responsable: Integrante, integrantes: List[Integrante], requerimientos: List[String]) extends Actividad with ConsultaAula{
  override def eventos : List[Evento] = { List(Evento(dia, horaInicio, horaFin, nombre)) }
  def cantidadDeIntegrantes: Int = { 1 + cantidadDePublico + integrantes.size }
}

case class Proyecto(aprobada: Boolean, nombre: String, financiamiento: Int, resultados: List[Resultado], bitacora: List[Experimento], responsable: Integrante, integrantes: List[Integrante]) extends Actividad {
  override def eventos: List[Evento] = { bitacora.map(_.evento) }
}

case class Experimento(fecha: Int, horaInicio: Int, horaFin: Int, experimento: String) {
  def evento: Evento = { Evento(fecha, horaInicio, horaFin, experimento) }
}

case class Resultado(resultado: String, fecha: Int)

case class Evento(fecha: Int, horaInicio: Int, horaFin: Int, info: String)