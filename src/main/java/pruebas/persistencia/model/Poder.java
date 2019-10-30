package pruebas.persistencia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Poder {
	
	@Id
	@GeneratedValue
	long id;
	private String nombre;
	
	public Poder(String nombre) {
		this.nombre = nombre;
	}
}
