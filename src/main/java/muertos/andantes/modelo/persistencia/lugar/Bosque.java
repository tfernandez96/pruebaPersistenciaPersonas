package muertos.andantes.modelo.persistencia.lugar;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bosque")
public class Bosque extends Lugar{
}
