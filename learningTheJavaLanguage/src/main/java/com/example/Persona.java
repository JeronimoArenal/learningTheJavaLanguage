package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.StringJoiner;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Getter @Setter
//@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Persona{
	/*
	 * Los elemntos de una clase existen en el plano de la clase o de las instancias
	 */
	
	/*
	 * protected: Lo ven todas las clases del mismo paquete Y 
	 * también cualquier clase hija, sin importar en qué paquete o carpeta esté
	 * 
	 * default: Lo ven todas las clases del mismo paquete
	 * 
	 * private: se relacionan con el mundo exterior a través de métodos 
	 * públicos que acceden a dichas variables. Una instancia de la misma clase no puede 
	 * acceder a las propiedades privadas. Las variables de una clase deben ser privadas.
	 */
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Genero genero;
	private LocalDate fechaNacimiento;
	private double salary;
	public static final String PAIS = "España";
	
	
	// ............................ Constructors .......................................
	public Persona(String nombre, String primerApellido, String segundoApellido, double salary) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.salary = salary;
	}
	
	
	// ............................ M E T H O D S .......................................
	/*
	 * bloque de código reutilizable que realiza una tarea específica y solo se ejecuta cuando es invocado. 
	 */
	
/*	@Override
	public String toString() {
	    // Retorna: nombre primerApellido segundoApellido salary
	    return nombre + " " + primerApellido + " " + segundoApellido + " " + salary;
	}
*/
	@Override
	public String toString() {
	    StringJoiner sj = new StringJoiner(", ", Persona.class.getSimpleName() + "[", "]");
	    if (nombre != null) sj.add("nombre='" + nombre + "'");
	    if (primerApellido != null) sj.add("primerApellido='" + primerApellido + "'");
	    if (segundoApellido != null) sj.add("segundoApellido='" + segundoApellido + "'");
	    if (salary != 0.0) sj.add("salary=" + salary);
	    // ... repetir para cada campo
	    return sj.toString();
	}




	
	

}
