package pruebas.persistencia.table.per.classs;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import pruebas.persistencia.model.Direccion;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class PersonaTPC {
	
	//A esta clase le sacamos el id, y se lo asignamos a cada una de las clases
	private String nombre;
	@ManyToOne
	// Solo es persist, porque es varias personas pueden vivir en la misma direccion, y no queremos gente homeless
	@Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	private Direccion direccion;
	
	protected PersonaTPC(String nombre, Direccion direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
}
