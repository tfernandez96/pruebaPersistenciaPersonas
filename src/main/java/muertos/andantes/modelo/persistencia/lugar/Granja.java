package muertos.andantes.modelo.persistencia.lugar;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Granja")
public class Granja extends Lugar {
	int cantidadDeElementosPunzantes;
	int cantidadDeCercas;
}
