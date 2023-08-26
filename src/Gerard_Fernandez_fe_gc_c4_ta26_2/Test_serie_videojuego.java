package Gerard_Fernandez_fe_gc_c4_ta26_2;

public class Test_serie_videojuego {

	public static void main(String[] args) {
		Serie[] series= new Serie[5];
		Videojuego[] videojuegos= new Videojuego[5];
		
		//Creacion de objetos en las listas array
		series[0]=new Serie();
		series[1]=new Serie("RWBY", "Monty Oum");
		series[2]=new Serie("Overlord", 4, "Fantasia", "Kugane Maruyama");
		series[3]=new Serie("Agallas el perro cobarde", "John R. Dilworth");
		series[4]=new Serie("Laboratorio de Dexter", 4, "Humor", "Genndy Tartakovsky");
		
		videojuegos[0]=new Videojuego();
		videojuegos[1]=new Videojuego("Call of Duty 4 Modern Warfare", 8);
		videojuegos[2]=new Videojuego("Borderlands", 24, "Shooter", "Gearbox");
		videojuegos[3]=new Videojuego("Evolve", 7);
		videojuegos[4]=new Videojuego("Metro Last Light", 10, "Drama", "Deep Silver");
		
		//Se utiliza metodo entregar
		series[0].entregar();
		series[2].entregar();
		series[4].entregar();
		
		videojuegos[0].entregar();
		videojuegos[2].entregar();
		videojuegos[4].entregar();
		
		//Bucles para contar cuantos objetos entregados hay
		int count=0;
		for (int i = 0; i < videojuegos.length; i++) {
			if(videojuegos[i].isEntregado()) {
				count++;
				videojuegos[i].devolver();
			}
		}
		System.out.println("Se han entregado "+count+" videojuegos ");
		
		count=0;
		for (int i = 0; i < series.length; i++) {
			if(series[i].isEntregado()) {
				count++;
				series[i].devolver();
			}
		}
		System.out.println("Se han entregado "+count+" series ");
		
		System.out.println();
		
		//Comparación de objetos
		//Videojuegos
		System.out.println("El videojuego num 3 de la lista:"+videojuegos[2].toString());
		System.out.println("El videojuego num 4 de la lista:"+videojuegos[3].toString());
		Videojuego objCompare=(Videojuego) videojuegos[2].compareTo(videojuegos[3]);
		System.out.println("El videojuego con mas horas es '"+objCompare.getTitulo()
		+"' con un total de "+objCompare.getHorasEstimadas()+"H.estimadas de juego");
		
		System.out.println();
		
		//Series
		System.out.println("La serie num 3 de la lista:"+series[2].toString());
		System.out.println("La serie num 4 de la lista:"+series[3].toString());
		Serie objCompareS=(Serie) series[2].compareTo(series[3]);
		System.out.println("La serie con mas temporadas es '"+objCompareS.getTitulo()
		+"' con un total de "+objCompareS.getNumTemporadas()+" Temporadas");
		
		
		
		
	}

}
