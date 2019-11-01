package muertos.andantes.modelo.inicial;

import lombok.Data;

import java.util.List;

@Data
public class Grupo {
	Caminante lider;
	List<Caminante> caminantes;
	String nombre;
}
