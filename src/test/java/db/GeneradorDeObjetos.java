package db;

import pruebas.persistencia.joined.table.IngenieroJT;
import pruebas.persistencia.joined.table.PersonaJT;
import pruebas.persistencia.joined.table.PowerRangerJT;
import pruebas.persistencia.mapped.superclass.IngenieroMSC;
import pruebas.persistencia.mapped.superclass.PersonaMSC;
import pruebas.persistencia.mapped.superclass.PowerRangerMSC;
import pruebas.persistencia.model.Color;
import pruebas.persistencia.model.Direccion;
import pruebas.persistencia.model.Poder;
import pruebas.persistencia.model.Titulo;
import pruebas.persistencia.single.table.IngenieroST;
import pruebas.persistencia.single.table.PersonaST;
import pruebas.persistencia.single.table.PowerRangerST;
import pruebas.persistencia.table.per.classs.IngenieroTPC;
import pruebas.persistencia.table.per.classs.PersonaTPC;
import pruebas.persistencia.table.per.classs.PowerRangerTPC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneradorDeObjetos {
	
	private static Titulo tituloSistemas = new Titulo("Ingenieria en sistemas", 7);
	private static Titulo tituloTextil = new Titulo("Ingenieria textil", 10);
	private static Direccion falsa = new Direccion("Calle falsa", 123, 0, 10);
	private static Direccion real = new Direccion("Calle real", 777, 7, 7);
	private static List<Poder> poderesPiola = Arrays.asList(
			new Poder("Explotar cosas con la mente"), new Poder("Ser inmortal"),
			new Poder("Codear Lindo"));
	private static List<Poder> poderesDePowerRanger = Arrays.asList(
			new Poder("Hacer poses raras"), new Poder("Llamar Al Megazord"));
	private static String nombre1 = "Chimuelo";
	private static String nombre2 = "Cosme Fulanito";
	
	public static List<PersonaST> generarPersonasST(int loops) {
		List<PersonaST> personas = new ArrayList<>();
		for (int i = 0; i < loops; i++) {
			personas.addAll(
					Arrays.asList(
							new PowerRangerST(nombre1, falsa, Color.ROJO, poderesPiola),
							new PowerRangerST(nombre2, real, Color.AZUL, poderesDePowerRanger),
							new PowerRangerST(nombre1, real, Color.ROSA, poderesDePowerRanger),
							new PowerRangerST(nombre2, falsa, Color.GRIS, poderesPiola),
							new IngenieroST(nombre1, real, tituloSistemas),
							new IngenieroST(nombre1, falsa, tituloTextil),
							new IngenieroST(nombre2, falsa, tituloSistemas),
							new IngenieroST(nombre2, real, tituloSistemas))
			);
		}
		return personas;
	}
	
	public static List<PersonaJT> generarPersonasJT(int loops) {
		List<PersonaJT> personas = new ArrayList<>();
		for (int i = 0; i < loops; i++) {
			personas.addAll(
					Arrays.asList(
							new PowerRangerJT(nombre1, falsa, Color.ROJO, poderesPiola),
							new PowerRangerJT(nombre2, real, Color.AZUL, poderesDePowerRanger),
							new PowerRangerJT(nombre1, real, Color.ROSA, poderesDePowerRanger),
							new PowerRangerJT(nombre2, falsa, Color.GRIS, poderesPiola),
							new IngenieroJT(nombre1, real, tituloSistemas),
							new IngenieroJT(nombre1, falsa, tituloTextil),
							new IngenieroJT(nombre2, falsa, tituloSistemas),
							new IngenieroJT(nombre2, real, tituloSistemas))
			);
		}
		return personas;
	}
	
	public static List<PersonaTPC> generarPersonasTPC(int loops) {
		List<PersonaTPC> personas = new ArrayList<>();
		for (int i = 0; i < loops; i++) {
			personas.addAll(
					Arrays.asList(
							new PowerRangerTPC(nombre1, falsa, Color.ROJO, poderesPiola),
							new PowerRangerTPC(nombre2, real, Color.AZUL, poderesDePowerRanger),
							new PowerRangerTPC(nombre1, real, Color.ROSA, poderesDePowerRanger),
							new PowerRangerTPC(nombre2, falsa, Color.GRIS, poderesPiola),
							new IngenieroTPC(nombre1, real, tituloSistemas),
							new IngenieroTPC(nombre1, falsa, tituloTextil),
							new IngenieroTPC(nombre2, falsa, tituloSistemas),
							new IngenieroTPC(nombre2, real, tituloSistemas))
			);
		}
		return personas;
	}
	
	public static List<PersonaMSC> generarPersonasMSC(int loops) {
		List<PersonaMSC> personas = new ArrayList<>();
		for (int i = 0; i < loops; i++) {
			personas.addAll(
					Arrays.asList(
							new PowerRangerMSC(nombre1, falsa, Color.ROJO, poderesPiola),
							new PowerRangerMSC(nombre2, real, Color.AZUL, poderesDePowerRanger),
							new PowerRangerMSC(nombre1, real, Color.ROSA, poderesDePowerRanger),
							new PowerRangerMSC(nombre2, falsa, Color.GRIS, poderesPiola),
							new IngenieroMSC(nombre1, real, tituloSistemas),
							new IngenieroMSC(nombre1, falsa, tituloTextil),
							new IngenieroMSC(nombre2, falsa, tituloSistemas),
							new IngenieroMSC(nombre2, real, tituloSistemas))
			);
		}
		return personas;
	}
	
}
