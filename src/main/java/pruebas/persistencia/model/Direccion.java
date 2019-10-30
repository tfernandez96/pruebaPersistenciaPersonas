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
public class Direccion {
	
	@Id
	@GeneratedValue
	long id;
	private String calle;
	private Integer numero;
	private Integer piso;
	private Integer departamento;
	
	public Direccion(String calle, Integer numero, Integer piso, Integer departamento) {
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
	}
	
}
