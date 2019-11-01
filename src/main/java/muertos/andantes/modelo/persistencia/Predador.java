package muertos.andantes.modelo.persistencia;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data

@Entity
public class Predador extends Sobreviviente {
	
	@OneToMany // En los metodos no se ve que se relacione con otros predadores, por ende un zombie solo es capturado por un predador
	List<Caminante> caminantesCapturados;
}
