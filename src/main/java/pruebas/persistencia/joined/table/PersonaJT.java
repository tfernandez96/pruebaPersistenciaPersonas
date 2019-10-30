package pruebas.persistencia.joined.table;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import pruebas.persistencia.model.Direccion;

import javax.persistence.*;

@Data
@NoArgsConstructor

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PersonaJT {
	
	@Id
	@GeneratedValue
	long id;
	private String nombre;
	@ManyToOne
	// Solo es persist, porque es varias personas pueden vivir en la misma direccion, y no queremos gente homeless
	@Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	private Direccion direccion;
	
	protected PersonaJT(String nombre, Direccion direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
}
