package pruebas.persistencia.table.per.classs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pruebas.persistencia.model.Direccion;
import pruebas.persistencia.model.Titulo;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "IngenieroTPC")
public class IngenieroTPC extends PersonaTPC {
	
	@Id
	@GeneratedValue
	long id;
	// Casi cualquier clase podría ser embedded para el modelo corto que tenemos, pero pongo una sola para comparar en la bd
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "nombreCarrera", column = @Column(name = "titulo")),
			@AttributeOverride(name = "promedioFinal", column = @Column(name = "promedio"))})
	private Titulo titulo;
	
	public IngenieroTPC(String nombre, Direccion direccion, Titulo titulo) {
		super(nombre, direccion);
		this.titulo = titulo;
	}
}
