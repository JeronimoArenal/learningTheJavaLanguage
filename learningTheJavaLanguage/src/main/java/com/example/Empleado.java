package com.example;

import java.time.LocalDate;

/*
 * Empleado hereda de Persona, es deicr, es una subclase de Persona. Tambien se puede decir que Empleado es un 
 * subtipo de Persona
 */

public class Empleado extends Persona{
	
	private double salario;
	private Dpto dpto;
	private LocalDate fecha_alta;
	
	//............................. Constructors ...................................
	public Empleado() {
		super();
	}

	public Empleado(double salario, Dpto dpto, LocalDate fecha_alta) {
		super();
		this.salario = salario;
		this.dpto = dpto;
		this.fecha_alta = fecha_alta;
	}

	public Empleado(String nombre, String primerApellido, String segundoApellido, Genero genero,
			LocalDate fechaNacimiento, 
			double salario, Dpto dpto, LocalDate fecha_alta) {
		super(nombre, primerApellido, segundoApellido, genero, fechaNacimiento);
		this.salario = salario;
		this.dpto = dpto;
		this.fecha_alta = fecha_alta;
	}

	@Override
	public String toString() {
	    return "Empleado [" + super.toString() + ", salario=" + salario + 
	           ", dpto=" + dpto + ", fecha_alta=" + fecha_alta + "]";
	}
	
	
	
	/*
	@Override
	public String toString() {
	    // 1. Traemos lo que dice el padre: "Persona [nombre=Juan...]"
	    String infoPadre = super.toString();

	    // 2. Le quitamos el último carácter (el ']') para poder seguir escribiendo dentro
	    String sinCierre = infoPadre.substring(0, infoPadre.length() - 1);

	    // 3. Le añadimos los datos propios de Empleado y cerramos el corchete
	    return sinCierre + 
	           ", salario=" + salario + 
	           ", dpto=" + dpto + 
	           ", fecha_alta=" + fecha_alta + "]";
	}
	*/
	

}
