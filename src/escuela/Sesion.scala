package escuela

class Sesion(fecha: Int, horaInicio: Int, horaFin: Int){
  
  def getEvento(nombre : String) : Evento = { new Evento(fecha, horaInicio, horaFin, nombre) }

}