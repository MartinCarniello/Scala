package escuela

case class Proyecto(apr: Boolean, nom: String,
			financ: Int, grupoDeInvestigacion: GrupoDeInvestigacion,
			resultado: Resultado, bitacora: List[Experimento]) extends 
			Actividad(apr, nom, financ, grupoDeInvestigacion) {

}