package muertos.andantes.modelo.persistencia;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Arma_Especial")
public class ArmaEspecial extends Arma {
	private String calidadEspecial;
}
