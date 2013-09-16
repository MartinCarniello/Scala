package escuela

case class Seminario(apr: Boolean, nom: String, financ: Int, 
    sesiones: List[Sesion])
    extends Actividad(apr, nom, financ) {
	
	override def getEventos : List[Evento] = { this.sesiones.map(_.getEvento(this.nom))}
}