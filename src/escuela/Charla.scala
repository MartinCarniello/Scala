package escuela

import java.util.Calendar

class Charla(aprobada: Boolean, nombre: String, financiamiento: Int, 
     grupoDeInvestigacion: GrupoDeInvestigacion, cantidadDePublico: Int, 
     dia: Calendar, horaInicio: Calendar, horaFin: Calendar) extends 
     Actividad(aprobada, nombre, financiamiento, grupoDeInvestigacion){

}