package escuela

class Seminario(aprobada: Boolean, nombre: String, financiamiento: Int, 
    grupoDeInvestigacion: GrupoDeInvestigacion, sesiones: List[Sesion]) 
    extends Actividad(aprobada, nombre, financiamiento, grupoDeInvestigacion) {

}