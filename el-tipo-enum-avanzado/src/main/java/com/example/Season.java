/* 
* Los enumerables, al igual que las clases, tambien pueden contener
* constructores, campos (propiedades o atributos) y metodos */

/*  A modo de ejemplo:  Un Zoo ficticio que quieren conocer la frecuencia o afluencia de visitantes 
 *  segun la epoca del año (es alta, media o baja*/

/* Cuando un enum va a contener algo más que las constantes, todo tiene que ir después de las 
 * constantes, separado por punto y coma ( ; ) */

package com.example;

public enum Season {
	SPRING("La Afluencia de visitantes en Primavera es: Media") {
		@Override
		public String getHours() {
			// TODO Auto-generated method stub
			return "De 9:00 a.m.  a   17:00 p.m"; // SE PUEDE COLOCAR AQUI TODO EL PRINT COMO SE HIZO EN 
		}                                         // LA CONSTANTE
	}, 
	WINTER("La Afluencia de visitantes en Invierno es: Baja") {
		@Override
		public String getHours() {
			// TODO Auto-generated method stub
			return "De 10:00 a.m.  a   15:00 p.m";
		}
	}, 
	SUMMER("La Afluencia de visitantes en Verano es: Alta") {
		@Override
		public String getHours() {
			
			// TODO Auto-generated method stub
			return "De 9:00 a.m.  a   19:00 p.m";
		}
	}, 
	FALL("La Afluencia de visitantes en Otoño es: Media") {
		@Override
		public String getHours() {
			// TODO Auto-generated method stub
			return "De 9:00 a.m.  a   17:00 p.m";
		}
	};
	
	private final String expectedVisitors;
	
	private Season(String expectedVisitor) {
		this.expectedVisitors = expectedVisitor;
		// TODO Auto-generated constructor stub
	}
	
	public void printExpectedVisitors()  {
		System.out.println(expectedVisitors);
	}
	//  Establecer el horario de visitas al Zoo según la época del año
	
    public abstract String getHours();
    
	
}











