package muertos.andantes.modelo.inicial.lugar;

import muertos.andantes.modelo.inicial.Caminante;
import muertos.andantes.modelo.inicial.Grupo;

import java.util.List;

public abstract class Lugar {
	List<Caminante> caminantes;
	List<Grupo> grupos;
	// Dice que existen lugares caoticos con mas de un grupo, para no generar la abstraccion LugarCaotico, es ma facil asi
}
