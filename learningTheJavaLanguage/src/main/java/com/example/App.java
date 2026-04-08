package com.example;

public class App {
	
    public static void main(String[] args) {
        // 1. Crear el objeto (instancia) Persona
        Persona objetoPax1 = new Persona();
        Persona objetoPax2 = new Persona();
               
        objetoPax1.nombre = "Ramiro";
        objetoPax2.nombre = "Ramiro";
        
        if(objetoPax1 == objetoPax2) {
         	System.out.println("Son iguales");
        } else {
        	System.out.println("No son iguales");
        }
        /*
         * identityHashCode garantiza un valor único por vida del objeto.
         * hash hexadecimal del objeto.
         */
        /*
         * ID único: 366712642
ID único: 692404036
         */
        
        int referenciaInt1 = System.identityHashCode(objetoPax1);
        System.out.println("ID único: " + referenciaInt1);
        
        int referenciaInt2 = System.identityHashCode(objetoPax2);
        System.out.println("ID único: " + referenciaInt2);
   
        
        // 2. Llamar al método que quieres ejecutar
        //objeto.saludar();
    }
}
