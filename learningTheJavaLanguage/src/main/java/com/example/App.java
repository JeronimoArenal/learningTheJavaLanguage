package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class App {
	
    public static void main(String[] args) {
    	/* ARRAY
    	 * Es una variable de referencia que apunta a una zona de la RAM, donde se almacena un conjunto de valores 
    	 * del mismo tipo. Cuando se crea, se fija la longitud y no se puede modificar su tamaño (inmutable), 
    	 * aunque si sus elementos. Para acceder a los elementos se utiliza un indice entre corchetes con inicio en 0.
    	 */
    	
    	String[] nombres = {"Carolina", "Jorge", "Daniel"};
    	
    	// Array de numero primitivos
    	int[] numeros = {1, 2, 3, 4, 5};
    	
    	//Creamos Array reservando memoria
    	int[] numeros2 = new int[10];
    	    	
    	System.out.println(Arrays.toString(nombres));
    	System.out.println(Arrays.toString(numeros));
    	System.out.println("EL array tiene: " + numeros.length);
    	System.out.println("EL array tiene: " + numeros2.length);
    	
    	// 2. Modificamos el array a 13
    	// Esto crea el nuevo, copia los 10 viejos y los guarda en la misma variable
    	numeros2 = Arrays.copyOf(numeros2, 13);
    	System.out.println("EL array tiene: " + numeros2.length);
    	
        System.out.println("--------------------------------------------------");
    	
    	
    	Persona[] personas = {
                Persona.builder()
                    .nombre("Jorge")
                    .primerApellido("Pascual")
                    .segundoApellido("Ramirez")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 10))
                    .salario(3500.50)
                    .build(),
                
                Persona.builder()
                    .nombre("Sebastian")
                    .primerApellido("Sanjuanelo")
                    .segundoApellido("Arrieta")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 1)) // Corregido el año
                    .salario(2450.70)
                    .build(),
                
                Persona.builder()
                    .nombre("Alex Eduardo")
                    .primerApellido("Pilicita")
                    .segundoApellido("Changoluisa")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(1997, Month.SEPTEMBER, 11))
                    .salario(4800.46)
                    .build(),
                
                Persona.builder()
                    .nombre("Javier")
                    .primerApellido("Jurado")
                    .segundoApellido("Mran")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(2005, Month.OCTOBER, 25))
                    .salario(4500.50)
                    .build(),
                
                Persona.builder()
                    .nombre("Rodrigo")
                    .primerApellido("Rivero")
                    .segundoApellido("Fernández")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 4))
                    .salario(3760.40)
                    .build()
            };
    	
        // 1. Mostrar cuántas personas hay usando .length
        System.out.println("Total de personas en el array: " + personas.length);
        System.out.println("--------------------------------------------------");

        // 2. Imprimir todos los nombres y salarios con un bucle for-each
        for (Persona p : personas) {
            System.out.println("Empleado: " + p.getNombre() + " " + p.getPrimerApellido() 
                               + " | Salario: " + p.getSalario() + "€");
        }

    	  

    }
}
