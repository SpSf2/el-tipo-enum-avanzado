package com.example;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        /*  El enum tiene un método que se llama Values() que permite iterar a través de las constantes del enum y mostrar
         * el ordinal asociado a dicha constante y el nombre de tipo String de la propia constante  */
    	
    	// Primero utilizando for mejorado
    	
    	for (Season season : Season.values()) {
    		
    		System.out.println("Nombre de la Constante: " + season.name() + ", ordinal: " + season.ordinal());
    	
			
		}
    	//  Segundo: utilizando operaciones de agregado
    }
}
