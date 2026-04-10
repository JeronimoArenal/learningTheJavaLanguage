/*
 * Una interface es un conjunto de metodos abastractos, en principio, que no tienen implementacion y que están
 * relacionados.
 * Se pueden implementar una o varias dentro de una clase, para eyudar a la herencia multiple.
 * Sirven para desacoplar el código, que veremos mas adelante a través de la ID en Spring
 */
package com.example.bicicleta;

//Considere una empresa qe se dedique a la fabricacion de diferentes tipos de bicicletas.
//Existe en dicha fabrica/empresa varios departamentos que se dedican a la fabricacion, pero hay que cambiar 
//el metodo de frenar o embragar segun el tipo. Asi mismo tiene que aumentar o reducir la velocidad, con el
//mismo metodo
//TECNICAMENTE: Una interface es un contrato mediante el cual una clase concreta debe implementar 
//todos sus metodos
public interface Bici {
	
	//La firma (signature) es el nombre y los parametros que recibe, sin incluir el tipo de retorno.
	public abstract void acelerar(double velocidad);
	public abstract void frenar(double velocidad);
	public abstract void embragar(int engrane);

}
