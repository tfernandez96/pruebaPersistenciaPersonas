package muertos.andantes.modelo.persistencia;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data

@Entity
public class Caminante {
	
	@Id @GeneratedValue
	long id;
	
	int sedDeSangre;
	boolean somnoliento;
	int dientes;
}
