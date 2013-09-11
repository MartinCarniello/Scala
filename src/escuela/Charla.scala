package escuela

import java.util.GregorianCalendar


case class Charla(apr: Boolean, nom: String, financ: Int, 
     grupoDeInvestigacion: GrupoDeInvestigacion, cantidadDePublico: Int, 
     dia: GregorianCalendar, horaInicio: GregorianCalendar, horaFin: GregorianCalendar) extends 
     Actividad(apr, nom, financ, grupoDeInvestigacion){

}