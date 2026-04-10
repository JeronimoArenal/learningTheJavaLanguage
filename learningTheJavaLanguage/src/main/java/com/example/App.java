package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {
	
    public static void main(String[] args) {
    	Empleado empleado1 = new Empleado();
    	Empleado empleado2 = new Empleado(3600.00, Dpto.CONTABILIDAD, LocalDate.of(2026, Month.MAY, 22));
    	empleado1.setNombre("Jeronimo");
    	
    	System.out.println(empleado1);
    	
    	Empleado empleado3 = new Empleado("Juan", "Martínez", "Lopez", Genero.MASCULINO, 
    			LocalDate.of(2026, Month.MAY, 22), 5000.0, Dpto.FINANZAS, 
    			LocalDate.of(2026,Month.APRIL, 12));
    	
    	System.out.print(empleado3);

    }
}
