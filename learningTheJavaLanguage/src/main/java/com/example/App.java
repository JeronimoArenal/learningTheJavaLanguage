package com.example;

public class App {
	/*
	 * static .-  Modificador de acceso que indica que un miembro (variable, metodo o bloque)
	 * pertenece a la clase en si misma en lugar de a una instancia(objeto) esoecífica.
	 * variable de clase .- una sola copia para todas las instancias, si se modifica se modifica
	 * para todas
	 * Metodo .- pueden invocarse sin crear un objeto. ejem. Math.sqrt()
	 * Bloque.- Blques de cdigo que se ejecutan una sola vez cuando la clase es cargada en la JVM
	 * con final.- constantes globales.
	 */
	
    public static void main(String[] args) {
    	/*
    	 * Instanciacion de objetos utilizando Builder. Es un patrón creaccional, que nos permite crear
    	 * objetos aunque no tengamos el constructor implementado, pudiendo utilizar las propiedades de 
    	 * la clase de forma indiferente
    	 */

    	var persona1 = new Persona("Jerónimo", "Arenal", "Gómez", 2500.0);
    	Persona persona2 = Persona.builder().salary(2500.0)
    			.nombre("Jerónimo")
    			.primerApellido("Arenal")
    			.build();
    	Persona persona3 = Persona.builder().salary(2500.0)
    			.nombre("Jerónimo")
    			.primerApellido("Arenal")
    			.genero(Genero.FEMENINO)
    			.build();
    	
    	System.out.println(persona1);
    	System.out.println(persona2);
    	System.out.println(persona3);
    	

    }
}
