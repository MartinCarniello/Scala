package escuela

case class Proyecto(apr: Boolean, nom: String,
			financ: Int, resultados: List[Resultado], bitacora: List[Experimento]) 
			extends Actividad(apr, nom, financ) {
  
  override def getEventos: List[Evento] = { this.bitacora.map(_.getEvento) }

}