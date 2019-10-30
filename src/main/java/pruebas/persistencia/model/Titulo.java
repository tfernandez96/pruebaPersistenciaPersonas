package pruebas.persistencia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Embeddable
public class Titulo {
	
	private String nombreCarrera;
	private Integer promedioFinal;
}
