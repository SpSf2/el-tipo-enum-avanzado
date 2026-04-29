package com.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        /*  El enum tiene un método que se llama Values() que permite iterar a través de las constantes del enum y mostrar
         * el ordinal asociado a dicha constante y el nombre de tipo String de la propia constante  */
    	
    	// Primero utilizando for mejorado
    	
    	for (Season season : Season.values()) {
    		
    		System.out.println("Nombre de la Constante: " + season.name() + ", ordinal: " + season.ordinal());
    	
			
		}
    	//  Segundo: utilizando operaciones de agregado
    	
    	// asi se podría: new ArrayList<Season>(Arrays.asList(Season.values())); pero el siguiente es mejor
    	// Arrays.stream(Season.values());  esta es la mejor
    	// y así se crea una variable de flujo:
    /*	Stream<Season> flujoDeSeason = Arrays.stream(Season.values());
    	
    	flujoDeSeason.forEach(season -> System.out.println("Nombre: " + season.name()
    			+ ", Ordinal: " + season.ordinal()));
    	*/
    	/* La variable flujoDeSeason es redundante, porque solamente sirve para cuando uno es un principiante,
    	 * entender que el método String de la clase Arrays genera un flujo (Stream) a partir de un Array. */
    	
    	Arrays.stream(Season.values())
    	.forEach(season -> System.out.println("Nombre: " + season.name()
		+ ", Ordinal: " + season.ordinal()));
    }
}
