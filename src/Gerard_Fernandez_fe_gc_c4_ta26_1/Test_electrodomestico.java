package Gerard_Fernandez_fe_gc_c4_ta26_1;

public class Test_electrodomestico {

	public static void main(String[] args) {
		Electrodomestico[] electrodomesticos= new Electrodomestico[10];
		
		electrodomesticos[0]= new Electrodomestico();
		electrodomesticos[1]= new Lavadora();
		electrodomesticos[2]= new Television();
		electrodomesticos[3]= new Electrodomestico(120,65);
		electrodomesticos[4]= new Lavadora(130,50);
		electrodomesticos[5]= new Television(125,40);
		electrodomesticos[6]= new Electrodomestico(125, "rojo", 'B', 80);
		electrodomesticos[7]= new Lavadora(125, "negro", 'A', 80, 10);
		electrodomesticos[8]= new Television(125, "azul", 'E', 80, 47, true);
		electrodomesticos[9]= new Lavadora(110, "azul", 'D', 40, 3);
		
		double sumaTotal=0;
		
		double sumLav=0;
		double sumTv=0;
		double sumElectro=0;
		
		
		for (int i = 0; i < electrodomesticos.length; i++) {
			electrodomesticos[i].precioFinal();
			
			sumaTotal+= electrodomesticos[i].getPrecioBase();
		    
		    if (electrodomesticos[i] instanceof Lavadora) {
		    	sumLav += electrodomesticos[i].precioFinal();
		    }else if (electrodomesticos[i] instanceof Television) {
		    	sumTv += electrodomesticos[i].precioFinal();
		    } else if (electrodomesticos[i] instanceof Electrodomestico) {
		    	sumElectro += electrodomesticos[i].precioFinal();
		    }
	    }
		
		System.out.println("precio de todas las Lavadoras: "+sumLav);
		System.out.println("precio de todas los Televisores: "+sumTv);
		System.out.println("precio de todas las Electrodomesticos: "+sumElectro);
		
		System.out.println("precio de todo: "+sumaTotal);
	}

}
