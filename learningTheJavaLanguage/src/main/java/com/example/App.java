package com.example;


public class App {
	//Variable de clase
	private static int personas = 5; 
	
	//Variables de Instancia
	private String nombre;		//Por defecto NULL
	private int total;			//Por defecto 0
	
    public static void main(String[] args) {
    	/* VARIABLES
    	 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
    	 * Para nombrar una variable hay que tener en cuenta lo siguiente:
    	 * 1º El primer caracter no puede ser un numero y aunque se permite $ y _ no deben usarse.
    	 * 2º Las variables declaradas a nivel de clase, no es necesario asignaerles un valor por defecto,
    	 * porque tiene un valor por defecto. Lo contrario ocurre con las locales en las que el programador debe
    	 * darles un valor inicial es decir deben ser inicializadas explicitamente
    	 */
    	int total2 = 3;			//Primitivo
    	Integer total3 = 4;		//Envoltorio
    	/* TIPOS DE DATO
    	 * 1º Primitivos .- Guardan el valor puro.
    	 * 2º Objetos o Referencia.- guardan una referencia(direccion de memoria) donde estan los datos.
    	 * En la mayoria de los casos debemos utilizar el tipo primitivo en lugar de su correspondiente 
    	 * tipo Objeto o Referencia
    	 */

    }
}
