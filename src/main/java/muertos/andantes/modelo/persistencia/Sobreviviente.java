package muertos.andantes.modelo.persistencia;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Sobreviviente {
	
	@Id @GeneratedValue
	long id;
	
	int carisma;
	int puntos;
	int resistencia;
	
	@OneToMany
	List<Arma> armas;
	
	@Enumerated
	Estado estado;
}
