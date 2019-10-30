package pruebas.persistencia.mapped.superclass;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import pruebas.persistencia.model.Direccion;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@Data
@NoArgsConstructor

@MappedSuperclass
public abstract class PersonaMSC {
	
	@Id
	@GeneratedValue
	long id;
	private String nombre;
	@ManyToOne
	// Solo es persist, porque es varias personas pueden vivir en la misma direccion, y no queremos gente homeless
	@Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	private Direccion direccion;
	
	protected PersonaMSC(String nombre, Direccion direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
}
