package escuela

class Proyecto(aprobada: Boolean, nombre: String,
			financiamiento: Int, grupoDeInvestigacion: GrupoDeInvestigacion,
			resultado: Resultado, bitacora: List[Experimento]) extends 
			Actividad(aprobada, nombre, financiamiento, grupoDeInvestigacion) {

}