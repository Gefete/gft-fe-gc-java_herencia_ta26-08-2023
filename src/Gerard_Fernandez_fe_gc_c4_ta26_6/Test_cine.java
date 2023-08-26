package Gerard_Fernandez_fe_gc_c4_ta26_6;


public class Test_cine {

	public static void main(String[] args) {
		 Pelicula pelicula = new Pelicula("Tortugas ninja", 180, 11, "Raphael Dicaprio");
	        Cine cine = new Cine(pelicula, 13.0);

	        Espectador[] espectadores= new Espectador[50];
	        
	        for (int i = 0; i < espectadores.length; i++) {
	        	espectadores[i]= new Espectador();
			}
	        
	        Asiento[][] asientos =  cine.getAsientos();
	        
	        int fila;
	        int column;
	        int plazasAsign=0;
	        
	        for (int i = 0; i < espectadores.length; i++) {
				boolean asientoOcupado = true;

				// Comprobacion de requisitos para entrar en la sala
				if (espectadores[i].getEdad()>=pelicula.getEdadMinima() && espectadores[i].getDinero()>=cine.getPrecioEntrada()) {

					while (asientoOcupado) {
						// Escoge aleatoriamente fila y columna
						fila = (int) (Math.random() * asientos.length);
						column = (int) (Math.random() * asientos[0].length);

						// Realiza la comprobacion de si el asiento esta ocupado
						if (!asientos[fila][column].isOcupado()) {
							//Si no esta ocupado lo ocupa el espectador que esta buscando asiento
							asientos[fila][column].setOcupado(true);
							//El asiento pasa a estar ocupado se indica para que el 
							asientoOcupado = false;
							plazasAsign++;
							System.out.println("Asiento ocupado por " + espectadores[i].getNombre());
						}
						//Condicional para comprobar el aforo
						if (plazasAsign >= (asientos[0].length * asientos.length)) {
							System.out.println("Aforo completado");
							asientoOcupado = false;
						}
					}
				}
			}
	        
	        int count=8;
	        
	        System.out.println("\nLas 'X' marcan ocupacion mientras la 'O' marcan sitio vacio\n");
	        System.out.println("    A  B  C  D  E  F  G  H  I");
	        for (int i = 0; i < asientos.length; i++) {
	        	System.out.print(" "+count+" ");
				for (int j = 0; j < asientos[i].length; j++) {
					 if (asientos[i][j].isOcupado()) {
						 System.out.print(" X ");
					 } else {
						 System.out.print(" O ");
					 }
				}
				count--;
				System.out.println();
			}
	}

}
