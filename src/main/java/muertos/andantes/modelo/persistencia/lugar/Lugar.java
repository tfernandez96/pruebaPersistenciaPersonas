package muertos.andantes.modelo.persistencia.lugar;

import muertos.andantes.modelo.persistencia.Caminante;
import muertos.andantes.modelo.persistencia.Grupo;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Tipo_Lugar")
public abstract class Lugar {
	
	@Id @GeneratedValue
	long id;
	
	@OneToMany // Cada caminante solo esta en un lugar
	List<Caminante> caminantes;
//	@OneToMany // Cada grupo solo esta en un lugar
//	List<Grupo> grupos;
	// Dice que existen lugares caoticos con mas de un grupo por lo que hay 2 opciones:
	// 1) Tener Lucar (Grupo: grupo) y LugarCaotico (List<Grupo> grupos)
	// 2) Tener un Lugar (List<Grupo> grupos) y si tiene size > 1 es caotico
	
	//Y tenemos el metodo para saber si es caotico
//	public boolean esCaotico(){
//		return grupos.size() > 1;
//	}
}
