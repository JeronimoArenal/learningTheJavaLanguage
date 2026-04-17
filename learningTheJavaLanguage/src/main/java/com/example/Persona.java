package com.example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter @Setter @EqualsAndHashCode
//@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Persona {
	/*
	 * Es un mecanismo de reutilizacion de codigo, mediante una clase puede heredar todos los elementos publicos
	 * o protected de otra clase. Los atributos privados no se heredan
	 * 
	 * Los constructores no se heredan
	 */
	
	public static final String Pais = "España";
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Genero genero;
	private LocalDate fechaNacimiento;
	
	
	
	//................... M E T H O D S ............................................

	
	//......................... Constructor ............................
  @Override
  public String toString() {
      String pers = "Persona: ";

      if (nombre != null) pers += "nombre: " + nombre + ", ";
      if (primerApellido != null) pers += "primerApellido: " + primerApellido + ", ";
      if (segundoApellido != null) pers += "segundoApellido: " + segundoApellido + ", ";
      if (genero != null) pers += "genero: " + genero + ", ";
      if (fechaNacimiento != null) pers += "fechaNacimiento: " + fechaNacimiento + ", ";

      return pers ;
  }	

}
