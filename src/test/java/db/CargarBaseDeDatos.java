package db;

import static org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers.getEntityManager;

public class CargarBaseDeDatos {
	
	public static void main(String args[]) {
		int loops = 300;
		GeneradorDeObjetos.generarPersonasST(loops).forEach(CargarBaseDeDatos::persistObjects);
		GeneradorDeObjetos.generarPersonasJT(loops).forEach(CargarBaseDeDatos::persistObjects);
		GeneradorDeObjetos.generarPersonasTPC(loops).forEach(CargarBaseDeDatos::persistObjects);
		GeneradorDeObjetos.generarPersonasMSC(loops).forEach(CargarBaseDeDatos::persistObjects);
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
