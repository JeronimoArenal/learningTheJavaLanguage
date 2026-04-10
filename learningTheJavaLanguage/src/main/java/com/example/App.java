package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {
	
    public static void main(String[] args) {
    	
    	Empleado empleado = Empleado.builder()
	            .salario(2750.0)
	            .dpto(Dpto.CONTABILIDAD)
	            .fecha_alta(LocalDate.now())
	            .ssn("123-456-789")
	            .build();
    	
    	System.out.println(empleado);
    			
    	
    	 Empleado empleado3 = Empleado.builder()
    	            // Atributos de Persona
    	            .nombre("Jerónimo")
    	            .primerApellido("Arenal")
    	            .segundoApellido("Gómez")
    	            .genero(Genero.FEMENINO)
    	            .fechaNacimiento(LocalDate.of(1969, Month.MAY, 22))
    	            
    	            // Atributos de Empleado
    	            .salario(2750.0)
    	            .dpto(Dpto.CONTABILIDAD)
    	            .fecha_alta(LocalDate.now())
    	            .ssn("123-456-789")
    	            
    	            //Creamos el objeto
    	            .build();

    	    System.out.println(empleado3);

    }
}
