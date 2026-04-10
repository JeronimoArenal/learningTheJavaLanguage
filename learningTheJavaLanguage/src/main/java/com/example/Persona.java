package com.example;

import java.time.LocalDate;

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
	public Persona() {
		
	}	
	
  public Persona(String nombre, String primerApellido, String segundoApellido, Genero genero,
			LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
	} 

  public String getNombre() {
	return nombre;
  }

  public void setNombre(String nombre) {
	this.nombre = nombre;
  }

  public String getPrimerApellido() {
	return primerApellido;
  }

  public void setPrimerApellido(String primerApellido) {
	this.primerApellido = primerApellido;
  }

  public String getSegundoApellido() {
	return segundoApellido;
  }

  public void setSegundoApellido(String segundoApellido) {
	this.segundoApellido = segundoApellido;
  }

  public Genero getGenero() {
	return genero;
  }

  public void setGenero(Genero genero) {
	this.genero = genero;
  }

  public LocalDate getFechaNacimiento() {
	return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
  }
  
  @Override
  public String toString() {
      String res = "Persona [";

      if (nombre != null) res += "nombre=" + nombre + ", ";
      if (primerApellido != null) res += "primerApellido=" + primerApellido + ", ";
      if (segundoApellido != null) res += "segundoApellido=" + segundoApellido + ", ";
      if (genero != null) res += "genero=" + genero + ", ";
      if (fechaNacimiento != null) res += "fechaNacimiento=" + fechaNacimiento + ", ";

      // Si termina en coma, se la quitamos
      if (res.endsWith(", ")) {
          res = res.substring(0, res.length() - 2);
      }

      return res + "]";
  }	
	

}
