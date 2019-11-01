package muertos.andantes.modelo.persistencia.lugar;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Prision")
public class Prision extends Lugar{
	int cantidadDePabellones;
}
