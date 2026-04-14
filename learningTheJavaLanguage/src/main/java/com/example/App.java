package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class App {
	
	static final int TOTAL_ELEMENTOS = 10;
	
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
    	
        System.out.println("---------------- Empezamos con el Array de Personas ----------------------------------");
    	
    	
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
    	
    	
    	operatorsInt();
    	prePost();
    	postPre();
    	

    }
    
    public static void operatorsInt(){
    	/* OPERADORES
    	 *  Operadores Aritméticos, que son: +, -, *, /, %
    	 *  De los anteriores operadores vamos a ejemplificar el operador %(modulus) devuelve el residuo de la división.
    	 *  Utilizaremos la sentencia "for" para recorrer un array, primero la sentencia clásica y la mejorada.
    	 */
    	
    	//1- Declarar u array de 100 elementos
    	//2- Agregar valores al array
    	//3- Recorrer el array y solamente mostrar los elementos que sean pares
    	
    	int[] numerosEnteros = new int[TOTAL_ELEMENTOS];
    	
    	// i++ (primero se usa el valor actual de la variable y después se le suma 1)
    	// ++i (primero se le suma 1 a la variable y después se usa el nuevo valor)
    	
    	for(int i = 0; i < TOTAL_ELEMENTOS; i++) {
    		  numerosEnteros[i] = i + 1; 
    		  System.out.println("Posición " + i + " tiene el valor: " + numerosEnteros[i]);
    	}
    	
    }

    
    public static void prePost() {
    	int a = 10;
    	int b = a++;
    	
    	System.out.println("a: " + a + " b: " + b );
    }
    
    public static void postPre() {
    	int a = 10;
    	int b = ++a;
    	
    	System.out.println("a: " + a + " b: " + b );
    } 
}
