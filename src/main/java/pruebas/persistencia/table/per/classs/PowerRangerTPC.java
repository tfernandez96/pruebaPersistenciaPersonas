package pruebas.persistencia.table.per.classs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import pruebas.persistencia.model.Color;
import pruebas.persistencia.model.Direccion;
import pruebas.persistencia.model.Poder;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "PowerRangerTPC")
public class PowerRangerTPC extends PersonaTPC {
	
	@Id
	@GeneratedValue
	long id;
	// EnumType.ORDINAL es mas eficiente, pero EnumType.STRING es mas expresivo cuando lo ves en la db (va en cada uno)
	@Enumerated(value = EnumType.STRING)
	private Color color;
	@ManyToMany
	@Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	private List<Poder> poderes;
	
	public PowerRangerTPC(String nombre, Direccion direccion, Color color, List<Poder> poderes) {
		super(nombre, direccion);
		this.color = color;
		this.poderes = poderes;
	}
}
