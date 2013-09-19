package escuela

abstract class Actividad{
  val aprobada: Boolean
  val nombre: String
  val financiamiento: Int
  def eventos : List[Evento]
}

case class Seminario(aprobada: Boolean, nombre: String, financiamiento: Int, sesiones: List[Sesion]) extends Actividad {
	override def eventos: List[Evento] = { sesiones.map(_.evento(nombre))}
}

case class Sesion(fecha: Int, horaInicio: Int, horaFin: Int){
  def evento(nombre : String) : Evento = { Evento(fecha, horaInicio, horaFin, nombre) }
}

case class Charla(aprobada: Boolean, nombre: String, financiamiento: Int, cantidadDePublico: Int, dia: Int, horaInicio: Int, horaFin: Int) extends Actividad{
  override def eventos : List[Evento] = {List(Evento(dia, horaInicio, horaFin, nombre))}
}

case class Proyecto(aprobada: Boolean, nombre: String, financiamiento: Int, resultados: List[Resultado], bitacora: List[Experimento]) extends Actividad {
  override def eventos: List[Evento] = { bitacora.map(_.evento) }
}

case class Experimento(fecha: Int, horaInicio: Int, horaFin: Int, experimento: String) {
  def evento: Evento = { Evento(fecha, horaInicio, horaFin, experimento) }
}

case class Resultado(resultado: String, fecha: Int)
case class Evento(fecha: Int, horaInicio: Int, horaFin: Int, info: String)