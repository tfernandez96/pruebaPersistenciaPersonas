package muertos.andantes.modelo.persistencia;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data

@Entity
public class Predador extends Sobreviviente {
	
	@OneToMany // En los metodos no se ve que se relacione con otros predadores, por ende un zombie solo es capturado por un predador
	@JoinColumn(name = "predador_id")
	List<Caminante> caminantesCapturados;
}
