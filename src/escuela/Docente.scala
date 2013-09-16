package escuela

import scala.collection.mutable.Set

class Docente(nombre: String, legajo: Int) 
				extends Integrante(nombre, legajo, Set()){

}