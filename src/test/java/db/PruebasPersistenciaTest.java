package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;
import pruebas.persistencia.joined.table.IngenieroJT;
import pruebas.persistencia.joined.table.PersonaJT;
import pruebas.persistencia.joined.table.PowerRangerJT;
import pruebas.persistencia.mapped.superclass.IngenieroMSC;
import pruebas.persistencia.mapped.superclass.PowerRangerMSC;
import pruebas.persistencia.single.table.IngenieroST;
import pruebas.persistencia.single.table.PersonaST;
import pruebas.persistencia.single.table.PowerRangerST;
import pruebas.persistencia.table.per.classs.IngenieroTPC;
import pruebas.persistencia.table.per.classs.PowerRangerTPC;

import java.util.List;

import static org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers.getEntityManager;

public class PruebasPersistenciaTest extends AbstractPersistenceTest implements WithGlobalEntityManager {
	
	@BeforeEach
	public void ejecutarQueryAlAzar(){
		// Creamos querys cualquiera para la creacion del em y esas cosas no perjudique los tiempos
		tiempoDeQuery("from IngenieroST", IngenieroST.class);
		tiempoDeQuery("from IngenieroJT", IngenieroJT.class);
		tiempoDeQuery("from IngenieroTPC", IngenieroTPC.class);
		tiempoDeQuery("from PowerRangerMSC", PowerRangerMSC.class);
	}
	
	@Test
	public void compararLosTiemposDeAccesoPolimorfico() {
		System.out.println(
				String.format("Single table tardo: %dms%n" +
								"Joined table tardo: %dms%n" +
								"Table Per Class NO tiene acceso polimorfico%n" +
								"MappedSuperClass NO tiene acceso polimorfico",
						tiempoDeQuery("from PersonaST", PersonaST.class),
						tiempoDeQuery("from PersonaJT", PersonaJT.class)));
	}
	
	@Test
	public void comprarLosTiemposDeAccesoPorClaseConcreta() {
		System.out.println(
				String.format("Single table tardo: %dms%n" +
								"Joined table tardo: %dms%n" +
								"Table Per Class tardo: %dms%n" +
								"MappedSuperClass tardo: %dms",
						tiempoDeQuery("from IngenieroST", IngenieroST.class) +
								tiempoDeQuery("from PowerRangerST", PowerRangerST.class),
						tiempoDeQuery("from IngenieroJT", IngenieroJT.class) +
								tiempoDeQuery("from PowerRangerJT", PowerRangerJT.class),
						tiempoDeQuery("from IngenieroTPC", IngenieroTPC.class) +
								tiempoDeQuery("from PowerRangerTPC", PowerRangerTPC.class),
						tiempoDeQuery("from IngenieroMSC", IngenieroMSC.class) +
								tiempoDeQuery("from PowerRangerMSC", PowerRangerMSC.class)));
	}
	
	private long tiempoDeQuery(String query, Class classs) {
		getEntityManager().clear();
		long start = System.currentTimeMillis();
		List list = getEntityManager().createQuery(query, classs).getResultList();
		return System.currentTimeMillis() - start;
	}
}
