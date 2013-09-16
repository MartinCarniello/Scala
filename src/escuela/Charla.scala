package escuela

case class Charla(apr: Boolean, nom: String, financ: Int, 
     cantidadDePublico: Int, dia: Int, horaInicio: Int, horaFin: Int) 
     extends Actividad(apr, nom, financ){
  
  override def getEventos : List[Evento] = {List(new Evento(this.dia, this.horaInicio, this.horaFin, this.nom))} 

}