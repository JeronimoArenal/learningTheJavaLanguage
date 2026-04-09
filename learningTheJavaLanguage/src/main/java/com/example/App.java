package com.example;

import java.time.LocalDate;
import java.time.Month;

import lombok.NoArgsConstructor;

public class App {
	
	public String texto = "vivo sin vivir";	
	/*
	 * static .-  Modificador de acceso que indica que un miembro (variable, metodo o bloque)
	 * pertenece a la clase en si misma en lugar de a una instancia(objeto) esoecífica.
	 * 
	 * variable de clase .- una sola copia para todas las instancias, si se modifica se modifica
	 * para todas.
	 * 
	 * Metodo .- pueden invocarse sin crear un objeto. ejem. Math.sqrt()
	 * 
	 * Bloque.- Bloques de cdigo que se ejecutan una sola vez cuando la clase es cargada en la JVM
	 * con final.- constantes globales.
	 */
	
    public static void main(String[] args) {

    	var persona1 = new Persona("Jerónimo", "Arenal", "Gómez", 2500.0);
    	var app1 = new App();
    	
    	Persona persona2 = Persona.builder().salary(2500.0)
    			.nombre("Jerónimo")
    			.primerApellido("Arenal")
    			.build();
    	
    	Persona persona3 = Persona.builder().salary(2500.0)
    			.nombre("Jerónimo")
    			.primerApellido("Arenal")
    			.genero(Genero.FEMENINO)
    			.fechaNacimiento(LocalDate.of(1969, Month.MAY,22))
    			.build();
    	
    	System.out.println(persona1);
    	System.out.println(persona2);
    	System.out.println(persona3);
    	
    	System.out.println(Persona.PAIS);
    	
    	System.out.println(app1.texto);
    	

    }
}
