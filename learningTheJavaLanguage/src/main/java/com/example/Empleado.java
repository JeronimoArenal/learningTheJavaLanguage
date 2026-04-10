package com.example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/*
 * Empleado hereda de Persona, es deicr, es una subclase de Persona. Tambien se puede decir que Empleado es un 
 * subtipo de Persona
 */
@Getter @Setter 
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Empleado extends Persona{
	
	private double salario;
	private Dpto dpto;
	private LocalDate fecha_alta;
	private String ssn;
	
	//............................. Constructors ...................................
	
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

	//.................................. toString ..........................................
/*	@Override
	public String toString() {
	    return super.toString() + 
	           " | Empleado: { " +
	           "Salario: " + salario + "€" +
	           ", Dpto: " + dpto + 
	           ", Alta: " + fecha_alta + 
	           ", SSN: '" + ssn + "' }";
	}
*/
}
