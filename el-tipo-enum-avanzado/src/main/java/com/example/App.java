package com.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
    	
    	//  Frecuencia de visitantes al Zoo en Spring:
    	
    	Season.SPRING.printExpectedVisitors();
    	
    	//  Horario de isitas en Verano:
    	
    	System.out.println("El Horario de visitas al Zoo en Verano es: " + Season.SUMMER.getHours());

    }
}
