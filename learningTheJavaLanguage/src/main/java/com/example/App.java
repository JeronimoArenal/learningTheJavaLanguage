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
    	
    	Persona persona1 = new Persona();
    	persona1.setNombre("Jerónimo");
    	persona1.setPrimerApellido("Arenal");
    	persona1.setSegundoApellido("Gómez");
    	var family = new Persona("Esther", "Arenal", "Martínez");
    	var family1 = new Persona("Miguel", "Arenal", "Martinez");
    	
    	System.out.print("Me llamo: " + "\n" + persona1.getNombre() +' ' + persona1.getPrimerApellido() + ' ' +
    			persona1.getSegundoApellido() + "\n"); 
    	System.out.println(family);
    	System.out.println(family1);

    }
}
