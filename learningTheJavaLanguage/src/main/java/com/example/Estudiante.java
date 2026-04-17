package com.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter @Setter
//@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder
public class Estudiante extends Persona implements Identificador{
	private int totalAsignaturas;
	private Facultad facultad;
	
	
	//................... M E T H O D S ........................................

	@Override
	public String obtenerIdentificacion() {
		return "Carnet Universitario de " + getNombre();
	}
	
	//.................................. toString ..........................................
	@Override
	public String toString() {
	    return super.toString() + 
	           " |Estudiante: { " +
	           "Total asignaturas: " + totalAsignaturas +
	           ", Facultad: '" + facultad + "' }";
	}

}
