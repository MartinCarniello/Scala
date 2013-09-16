package escuela

class Experimento(fecha: Int, horaInicio: Int, horaFin: Int,
    experimento: String) {

  def getEvento: Evento = { new Evento(this.fecha, this.horaInicio, this.horaFin, this.experimento) }
}