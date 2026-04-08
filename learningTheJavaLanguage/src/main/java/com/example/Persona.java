package com.example;

public class Persona {
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
	
	
  /*  public void setNombre(String nuevoNombre) {
        // "this.nombre" se refiere a la variable privada de arriba
        // "nuevoNombre" es lo que recibes por paréntesis
        this.nombre = nuevoNombre;
    }
	
	
    public String getNombre() {
        return nombre; 
    }
	*/
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		// "this.nombre" se refiere a la variable privada de arriba
		// "nombre" es lo que recibes por paréntesis
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
	

	
	

}
