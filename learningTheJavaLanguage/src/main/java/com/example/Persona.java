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

	
	//......................... Constructor ............................

  
  @Override
  public String toString() {
      String res = "Persona [";

      if (nombre != null) res += "nombre: " + nombre + ", ";
      if (primerApellido != null) res += "primerApellido: " + primerApellido + ", ";
      if (segundoApellido != null) res += "segundoApellido" + segundoApellido + ", ";
      if (genero != null) res += "genero: " + genero + ", ";
      if (fechaNacimiento != null) res += "fechaNacimiento: " + fechaNacimiento + ", ";

      return res + "]";
  }	
	

}
