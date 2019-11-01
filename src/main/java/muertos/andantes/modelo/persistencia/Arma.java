package muertos.andantes.modelo.persistencia;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Tipo_Arma")
@DiscriminatorValue("Arma_Comun")
public class Arma {
	
	@Id @GeneratedValue
	long id;
	
	int municiones;
	int calibre;
	boolean esRuidosa;
}