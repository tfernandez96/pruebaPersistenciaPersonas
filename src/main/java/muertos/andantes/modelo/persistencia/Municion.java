package muertos.andantes.modelo.persistencia;

import lombok.Data;

import javax.persistence.Embeddable;

@Data

@Embeddable
public class Municion {
	int precio;
	int cantidad;
	String tipoMunicion;
}
