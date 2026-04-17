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
//@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Empleado extends Persona implements Identificador{
	
	private double salario;
	private Dpto dpto;
	private LocalDate fecha_alta;
	private String ssn;
	
	
	//................... M E T H O D S ............................................
	@Override
	public String obtenerIdentificacion() {
		return "ID de Empleado - SSN: " + ssn;
	}
	
	//.................................. toString ..........................................
	@Override
	public String toString() {
	    return super.toString() + 
	           " |Empleado: " +
	           "Salario: " + salario + "€" +
	           ", Dpto: " + dpto + 
	           ", Alta: " + fecha_alta + 
	           ", SSN: '" + ssn + "' ";
	}



}
