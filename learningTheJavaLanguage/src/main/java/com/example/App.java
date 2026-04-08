package com.example;

public class App {
	
    public static void main(String[] args) {
    	
    	Persona persona1 = new Persona();
    	persona1.setNombre("Jerónimo");
    	persona1.setPrimerApellido("Arenal");
    	persona1.setSegundoApellido("Gómez");
    	
    	System.out.print("Me llamo " + persona1.getNombre() +' ' + persona1.getPrimerApellido() + ' ' +
    			persona1.getSegundoApellido()); 

    }
}
