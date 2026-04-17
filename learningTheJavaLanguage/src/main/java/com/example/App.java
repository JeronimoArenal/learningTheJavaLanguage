package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class App {
	
	/*Crear un array de objetos y agregarle elementos de tipo empleado y Estudiante. tres empleados  (2 masculino 1 femenino)
	 * y tres estudiantes, con todas las propiedades de Persona en ambos casos.
	 * 
	 * 2º Recorrer el array utilizando una sentencia for mejorado y para los estudiantes obtener la media de las 
	 * asignaturas matriculadas y para los empleados obtener el salario medio de los empleados del genero Masculino.
	 * Se sugiere utilizar pattern matching con instanceof en el momento de iterar el array.
	 */
	
		
	// .......................... Método main .......................................
    public static void main(String[] args) {
        arrayPersonas();
    	
   /* 	Persona p1 = new Persona();
    	
    	Estudiante e1 = new Estudiante();
    	e1.setTotalAsignaturas(10);
    	
    	Empleado emp1 = new Empleado();
    	emp1.setSalario(3450.25);
    	
    	//Invocamos (llamamos) al método sin retorno void
    	printObject(p1);
    	printObject(e1);
    	printObject(emp1);
   	
        // Utilizamos método con return de tipo String
    	System.out.println("..... Imprimimos con metodo con return ..............");
        System.out.println(printObjecto(p1));
        System.out.println(printObjecto(e1));
        System.out.println(printObjecto(emp1));
  	
    }
    
	/*Este método sin retorno, recibe un object y depediendo de si es Empleado o totalde asignaturas si se trata de Estudiante 
	static void printObject(Object object) {
		
		if(object instanceof Empleado) {
			Empleado empleado = (Empleado) object;
			System.out.println("EL salario es: " + empleado.getSalario());
			
		} else if (object instanceof Estudiante){
			Estudiante estudiante = (Estudiante) object;
			System.out.println("Total asignaturas: " + estudiante.getTotalAsignaturas());
			
		} else {
			System.out.println("Es algun otro ente del espectro ");
		}
	}
	
	
	/*El mismo metodo con retorno. Utilizando los beneficios de Pattern Matching. Nos evitamos crear y castear el objeto	
	static String printObjecto(Object obj) {
		
	    if(obj instanceof Empleado empleado) {
	        return "El salario es: " + empleado.getSalario();
	    } else if (obj instanceof Estudiante estudiante){
	        return "Total asignaturas: " + estudiante.getTotalAsignaturas();
	    } else {
	        return "Es algun otro ente del espectro";
	    }
	    */
	}
	
	
    
	// .......................... M E T H O D S ..............................................      
    /* instanceof,  Es un operador que se utiliza para comprobar si un objeto es una instancia de una clase específica, 
     * de una subclase o de una interface. Devuelve true si el objeto coincide con el tipo y false en caso contrario.
     */
    public static void arrayPersonas(){
    	    	
        double sumaSalariosHombres = 0;
        int contadorHombres = 0;
        
        int sumaTotalAsignaturas = 0;
        int contadorEstudiantes = 0;
    	
    	Persona[] personas = {
                Empleado.builder()
                    .nombre("Jorge")
                    .primerApellido("Pascual")
                    .segundoApellido("Ramirez")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 10))
                    .salario(3500.50)
                    .dpto(Dpto.CONTABILIDAD)
                    .fecha_alta(LocalDate.of(2000, Month.DECEMBER, 1))
                    .ssn("234342")
                    .build(),
   
                Empleado.builder()
                    .nombre("Sebastian")
                    .primerApellido("Sanjuanelo")
                    .segundoApellido("Arrieta")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 1)) // Corregido el año
                    .salario(2450.70)
                    .dpto(Dpto.CONTABILIDAD)
                    .fecha_alta(LocalDate.of(2000, Month.DECEMBER, 1))
                    .ssn("23-4342")
                    .build(),
                
                Empleado.builder()
                    .nombre("Alejandra Eduarda")
                    .primerApellido("Pilicita")
                    .segundoApellido("Changoluisa")
                    .genero(Genero.FEMENINO)
                    .fechaNacimiento(LocalDate.of(1997, Month.SEPTEMBER, 11))
                    .salario(4800.46)
                    .dpto(Dpto.INFORMATICA)
                    .fecha_alta(LocalDate.of(2000, Month.DECEMBER, 1))
                    .ssn("23-43-42")
                    .build(),
                
                Estudiante.builder()
                    .nombre("Javier")
                    .primerApellido("Jurado")
                    .segundoApellido("Mran")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(2005, Month.OCTOBER, 25))
                    .totalAsignaturas(10)
                    .facultad(Facultad.BIOLOGIA)
                    .build(),
                
                Estudiante.builder()
                    .nombre("Rodrigo")
                    .primerApellido("Rivero")
                    .segundoApellido("Fernández")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 4))
                    .totalAsignaturas(10)
                    .facultad(Facultad.BIOLOGIA)
                    .build(),
                    
                Estudiante.builder()
                    .nombre("Carolina")
                    .primerApellido("Garzón")
                    .segundoApellido("Becerra")
                    .genero(Genero.FEMENINO)
                    .fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 4))
                    .totalAsignaturas(5)
                    .facultad(Facultad.INFORMATICA)
                    .build()    
            };
 
          // Recorrer el array con for mejorado y Pattern Matching
    	  //Para cada Persona 'p' que esté en la lista 'personas.
          for (Persona p : personas) {
              
              if (p instanceof Estudiante est) {
                  sumaTotalAsignaturas += est.getTotalAsignaturas();
                  contadorEstudiantes++;
              } else if (p instanceof Empleado emp && emp.getGenero().equals(Genero.MASCULINO)) {
                      sumaSalariosHombres += emp.getSalario();
                      contadorHombres++;
              }
              
              System.out.println(p);
              
              // instanceof con Interface
              if (p instanceof Identificador identity) {
                  // Aquí no nos importa si es Estudiante o Empleado. 
                  // Solo sabemos que es "Identificable".
                  System.out.println("ACCESO CONCEDIDO: " + identity.obtenerIdentificacion());
              } 

          }

          // 1. Mostramos media de asignaturas matriculadas
          if (contadorEstudiantes > 0) {
              int mediaAsignaturas = sumaTotalAsignaturas / contadorEstudiantes;
              System.out.printf("Media de asignaturas matriculadas: %d%n", mediaAsignaturas); //%d "marcador de posición" para enteros
              //double mediaAsignaturas = (double) sumaTotalAsignaturas / contadorEstudiantes;
              //System.out.printf("Media de asignaturas matriculadas: %.2f%n", mediaAsignaturas);
          }

          // 2. Mostramos salario medio de hombres
          if (contadorHombres > 0) {
              double salarioMedio = sumaSalariosHombres / contadorHombres;
              System.out.println("Salario medio de los empleados masculinos: " + salarioMedio + "€");
          }

      }
    
}
