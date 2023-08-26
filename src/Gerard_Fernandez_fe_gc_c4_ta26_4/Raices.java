package Gerard_Fernandez_fe_gc_c4_ta26_4;

public class Raices {
	private double a;
	private double b;
	private double c;
	
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getDiscriminante() {
        double discriminante;
        discriminante = (Math.pow(this.b, 2)) - 4 * this.a * this.c;
        return discriminante;
	}
	
	public boolean tieneRaices() {
		if(this.getDiscriminante() > 0) {
			return true;
		}else{
			return false;
		}
    }
	
    // Un discriminante de cero indica que la cuadrática tiene una solución real repetida.
    public boolean tieneRaiz() {
    	if (this.getDiscriminante() == 0) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    // Metodo que coge los metodos obtenerRaices y obtenerRaiz segun los metodos tieneRaices o tieneRaiz lo indique
    public void calcular() {
        if (this.tieneRaices()) {
            this.obtenerRaices();
        }
        else if (this.tieneRaiz()) {
            this.obtenerRaiz();
        }
        else {
        	System.out.println("no tiene solucion");
        }
    }
    
    // Metodo que calcula las 2 soluciones de la equaciones 2n grado
   public void obtenerRaices() {
        if (this.tieneRaices()) {
            //Resultado positivo
        	double operacion2nGradopositive = (-this.b + Math.sqrt((Math.pow(this.b, 2)) - (4 * this.a * this.c))) / (2 * this.a);
            System.out.println(operacion2nGradopositive);
            
            //resultado negativo
            double operacion2nGradonegative = (-this.b - Math.sqrt((Math.pow(this.b, 2)) - (4 * this.a * this.c))) / (2 * this.a);
            System.out.println(operacion2nGradonegative);
        }
        else {
        	System.out.println("solo tiene una solucion");
        }
    }
	
    //  Metodo que calcula la solucion de la equaciones 2n grado en caso de que solo salga una segun el discriminante
    public void obtenerRaiz() {
        if (this.tieneRaiz()) {
            double operacion2nGradon = (-this.b - Math.sqrt((Math.pow(this.b, 2)) - (4 * this.a * this.c))) / (2 * this.a);
            System.out.println(operacion2nGradon);
        }
        else {
        	System.out.println("No tiene una sola solucion");
        }
    }
}
