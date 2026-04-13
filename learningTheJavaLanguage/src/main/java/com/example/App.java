package com.example;

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
    	numeros[0] = 100;
    	System.out.println(Arrays.toString(numeros));
    	System.out.println("EL array tiene: " + numeros.length);
    	System.out.println("EL array tiene: " + numeros2.length);
    	
    	// 2. Modificamos el array a 13
    	// Esto crea el nuevo, copia los 10 viejos y los guarda en la misma variable
    	numeros2 = Arrays.copyOf(numeros2, 13);
    	System.out.println("EL array tiene: " + numeros2.length);
    	
    	
    }
}
