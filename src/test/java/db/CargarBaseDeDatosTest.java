package db;

import org.junit.jupiter.api.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import static org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers.getEntityManager;

public class CargarBaseDeDatosTest extends AbstractPersistenceTest implements WithGlobalEntityManager {
	
	@Test
	private static void llenarBaseDeDatos() {
		int loops = 150;
		GeneradorDeObjetos.generarPersonasST(loops).forEach(CargarBaseDeDatosTest::persistObjects);
		GeneradorDeObjetos.generarPersonasJT(loops).forEach(CargarBaseDeDatosTest::persistObjects);
		GeneradorDeObjetos.generarPersonasTPC(loops).forEach(CargarBaseDeDatosTest::persistObjects);
		GeneradorDeObjetos.generarPersonasMSC(loops).forEach(CargarBaseDeDatosTest::persistObjects);
	}
	
	// Este metodo crea una transaccion, persiste los objetos y la commitea
	private static void persistObjects(Object... objects) {
		getEntityManager().getTransaction().begin();
		for (Object object : objects) {
			getEntityManager().persist(object);
		}
		getEntityManager().getTransaction().commit();
	}
}
