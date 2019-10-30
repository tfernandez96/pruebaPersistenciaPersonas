package pruebas.persistencia.mapped.superclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import pruebas.persistencia.model.Color;
import pruebas.persistencia.model.Direccion;
import pruebas.persistencia.model.Poder;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class PowerRangerMSC extends PersonaMSC {
	
	// EnumType.ORDINAL es mas eficiente, pero EnumType.STRING es mas expresivo cuando lo ves en la db (va en cada uno)
	@Enumerated(value = EnumType.STRING)
	private Color color;
	@ManyToMany
	@Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	private List<Poder> poderes;
	
	public PowerRangerMSC(String nombre, Direccion direccion, Color color, List<Poder> poderes) {
		super(nombre, direccion);
		this.color = color;
		this.poderes = poderes;
	}
}
