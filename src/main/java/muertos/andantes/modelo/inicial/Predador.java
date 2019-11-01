package muertos.andantes.modelo.inicial;

import lombok.Data;

import java.util.List;

@Data
public class Predador extends Sobreviviente {
	List<Caminante> caminantesAtacadosYCapturados;
}
