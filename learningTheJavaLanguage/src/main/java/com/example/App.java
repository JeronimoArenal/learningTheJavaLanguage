package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import lombok.EqualsAndHashCode;

public class App {

	/*Este método recibe un object y depediendo de si es Empleado o totalde asignaturas si se trata de Estudiante */
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
	
	
	// .......................... Método main .......................................
    public static void main(String[] args) {   	
    	
        //arrayPersonas();
    	
    	Persona p1 = new Persona();
    	
    	Estudiante e1 = new Estudiante();
    	e1.setTotalAsignaturas(10);
    	
    	Empleado emp1 = new Empleado();
    	emp1.setSalario(3450.25);
    	
    	//Incocamos (llamamos) al método
    	printObject(p1);
    	printObject(e1);
    	printObject(emp1);

    	
    }
    
    
	// .......................... M E T H O D S ..............................................      
    /* instanceof, se utiliza para saber si una variable de referencia o de un objeto es una instancia de un tipo
     * 
     */
    
    public static void arrayPersonas(){
    	
    System.out.println("---------------- Empezamos con el Array de Personas ----------------------------------");	    	
    	
    	Persona[] personas = {
                Persona.builder()
                    .nombre("Jorge")
                    .primerApellido("Pascual")
                    .segundoApellido("Ramirez")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 10))
                    //.salario(3500.50)
                    .build(),
                
                Persona.builder()
                    .nombre("Sebastian")
                    .primerApellido("Sanjuanelo")
                    .segundoApellido("Arrieta")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 1)) // Corregido el año
                    //.salario(2450.70)
                    .build(),
                
                Persona.builder()
                    .nombre("Alex Eduardo")
                    .primerApellido("Pilicita")
                    .segundoApellido("Changoluisa")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(1997, Month.SEPTEMBER, 11))
                    //.salario(4800.46)
                    .build(),
                
                Persona.builder()
                    .nombre("Javier")
                    .primerApellido("Jurado")
                    .segundoApellido("Mran")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(2005, Month.OCTOBER, 25))
                    //.salario(4500.50)
                    .build(),
                
                Persona.builder()
                    .nombre("Rodrigo")
                    .primerApellido("Rivero")
                    .segundoApellido("Fernández")
                    .genero(Genero.MASCULINO)
                    .fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 4))
                    //.salario(3760.40)
                    .build()
            };
    	
    	for (Persona p : personas) {
    	    System.out.println(p);
    	}
    	
    	System.out.println(Arrays.toString(personas));
    	
    	Arrays.stream(personas).forEach(System.out::println);

    }
    
}
