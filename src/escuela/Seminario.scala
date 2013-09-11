package escuela

case class Seminario(apr: Boolean, nom: String, financ: Int, 
    grupoDeInvestigacion: GrupoDeInvestigacion, sesiones: List[Sesion]) 
    extends Actividad(apr, nom, financ, grupoDeInvestigacion) {

}