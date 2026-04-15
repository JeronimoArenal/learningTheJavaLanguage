package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class App {
	
	static final int TOTAL_ELEMENTOS = 10;
	
	static int[] numerosEnteros = new int[TOTAL_ELEMENTOS];
	
	
	// .......................... Método main .......................................
    public static void main(String[] args) {
    	/* ARRAY
    	 * Es una variable de referencia que apunta a una zona de la RAM, donde se almacena un conjunto de valores 
    	 * del mismo tipo. Cuando se crea, se fija la longitud y no se puede modificar su tamaño (inmutable), 
    	 * aunque si sus elementos. Para acceder a los elementos se utiliza un indice entre corchetes con inicio en 0.
    	 */
    	
    	int[] miArray = rellenarArray();	//Variable local para guaradar el retiurn del método
    	    	
    	operatorsInt();
    	operatorsInt(miArray);
    	forMejorado();
    	forMejorado(miArray);
        //mainArray();  	
        //arrayPersonas();
    	//prePost();
    	//postPre();
    	
    }
    
    // .................... Método crearYLlenar metodo sin void por lo que devuelve array de enteros ..............................................
    public static int[] rellenarArray() {
        int[] numerosEnteros = new int[TOTAL_ELEMENTOS]; //Reservamos espacio en RAM para las cantidad TOTAL_ELEMENTOS
        
        for(int i = 0; i < TOTAL_ELEMENTOS; i++) {		//Llenamos bucle for
            numerosEnteros[i] = i + 1;
        }
        return numerosEnteros; // Devolvemos al array lleno para llenar la variable
    }
    
    
	// .......................... M E T H O D S ..............................................    
    public static void operatorsInt(){
    	/* OPERADORES
    	 *  Operadores Aritméticos, que son: +, -, *, /, %
    	 *  De los anteriores operadores vamos a ejemplificar el operador %(modulus) devuelve el residuo de la división.
    	 *  Utilizaremos la sentencia "for" para recorrer un array, primero la sentencia clásica y la mejorada.
    	 */   	
    	
    	// 1º Declarsmos el array utilizando la cantidad de elementos de TOTAL_ELEMENTOS
    	//int[] numerosEnteros = new int[TOTAL_ELEMENTOS]; //estamos utilizando la variable global (static)
    	
    	//2.  Agregamos valores al array
    	for(int i = 0; i < TOTAL_ELEMENTOS; i++) {
    		  numerosEnteros[i] = i + 1; 
    	}
 
    	//3- Recorrer el array y solamente mostrar los elementos que sean pares
    	System.out.println(" ------------------- For clásico pares ------------------");   	
    	for(int i = 0; i < TOTAL_ELEMENTOS; i++) {
    	    if (numerosEnteros[i] % 2 == 0) {	// Verificamos si es impar (el resto de la división entre 2 NO es 0)
    	        System.out.println("Posición " + i + " par: " + numerosEnteros[i]);
    	    }
    	}    	
    	
    }
    
    public static void operatorsInt(int[] numerosEnteros) {
        System.out.println(" ------------------- Metodo Numeros Pares Sobrecargado (------------------");
        for(int i = 0; i < numerosEnteros.length; i++) {
            if (numerosEnteros[i] % 2 == 0) {
                System.out.println("Posición: " + i + " Par: " + numerosEnteros[i]);
            }
        }
    }
    
    //............................... Metodo For mejorado ------------------------------------
    
    public static void forMejorado(){
    	int contador = 0;

    	// 1º Declarsmos el aray utilizando la cantidad de elementos de TOTAL_ELEMENTOS
    	// int[] numerosEnteros = new int[TOTAL_ELEMENTOS];
    	
        // 1º Comitear los cambios actuales del proyecto poniendo como comentario: "antes de realizar el ejercicio3"
        // 2º Utilizando un bucle for mejorado, que muestre los elementos que son impares del array numerosEnteros y
        //contando la cantidad de numeros impares:
    	        
        // EJERCICIO 3
    	   	
        // PASO 1: Llenar el array (For clásico)
        for (int i = 0; i < TOTAL_ELEMENTOS; i++) {
            numerosEnteros[i] = i + 1;
        }
    	
    	System.out.println(" ------------------- Método For mejorado Impares ------------------");
    	for(int numeroEntero : numerosEnteros) {
    	    if (numeroEntero % 2 != 0) {
    	        System.out.println("Impar: " + numeroEntero);
    	        contador++;
    	    }

    	}
    	System.out.println("Total números impares: " + contador);    	
    }
    
        
    public static void forMejorado(int[] numerosEnteros) {
        System.out.println(" -------------------Mètodo forFor mejorado Impares Sobrecargado (Overloading)------------------");
        int contador = 0;
        for(int numeroEntero : numerosEnteros) {
            if (numeroEntero % 2 != 0) {
                System.out.println("Impar: " + numeroEntero);
                contador++;
            }
        }
        System.out.println("Total números impares: " + contador);
    }
    

    
    
    
    
    
    
	// i++ (primero se usa el valor actual de la variable y después se le suma 1)
	// ++i (primero se le suma 1 a la variable y después se usa el nuevo valor)
    
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
    
    public static void mainArray(){
    	String[] nombres = {"Carolina", "Jorge", "Daniel"};
    	
    	// Array de numero primitivos
    	int[] numeros = {1, 2, 3, 4, 5};
    	//Creamos Array reservando memoria
    	int[] numeros2 = new int[10];
    	    	
    	System.out.println(Arrays.toString(nombres));
    	System.out.println(Arrays.toString(numeros));
    	System.out.println("EL array tiene una logitud de: " + numeros.length);
    	System.out.println("EL array tiene una logitud de: " + numeros2.length);
    	
    	// 2. Modificamos el array a 13
    	// Esto crea el nuevo, copia los 10 viejos y los guarda en la misma variable
    	numeros2 = Arrays.copyOf(numeros2, 13);
    	System.out.println("EL array tiene: " + numeros2.length);
    	
    }
    
    public static void arrayPersonas(){
    	
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

    }
    
}
