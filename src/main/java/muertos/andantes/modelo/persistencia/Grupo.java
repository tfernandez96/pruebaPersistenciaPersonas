package muertos.andantes.modelo.persistencia;

import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Grupo {
	
	@Id @GeneratedValue long id;
	
	@Cascade(CascadeType.PERSIST)
	@OneToOne // Un wachin solo puede pertenecer a un grupo
	Sobreviviente lider;
	@Cascade(CascadeType.PERSIST)
	@OneToMany // Lo mismo que arriba
	List<Sobreviviente> sobrevivientes;
	String nombre;
}
