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
    	
    	var persona1 = new Persona("Jerónimo", "Arenal", "Gómez", 2500.0);
    	
    	System.out.println(persona1);
    	

    }
}
