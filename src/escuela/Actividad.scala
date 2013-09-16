package escuela

abstract class Actividad (var aprobada: Boolean, var nombre: String, 
	var financiamiento: Int){
  
  def getEventos : List[Evento]
  
}