package Gerard_Fernandez_fe_gc_c4_ta26_1;


public class Electrodomestico {
	
	protected final String[] COLORS= {"blanco", "negro", "rojo", "azul", "gris"};
	
	protected final String COLOR_DEF=COLORS[0];
	protected final char CONSUMO_DEF='F';
	protected final double PRECIO_DEF=100;
	protected final double PESO_DEF=5;
	
	//Variables
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	
	//Constructor Default
	public Electrodomestico() {
		this.precioBase=PRECIO_DEF;
		this.color=COLOR_DEF;
		this.consumoEnergetico=CONSUMO_DEF;
		this.peso=PESO_DEF;
	}

	//Constructor con precio y peso
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color=COLOR_DEF;
		this.consumoEnergetico=CONSUMO_DEF;
		this.peso = peso;
	}

	//Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = Character.toUpperCase(consumoEnergetico);
		this.peso = peso;
	}
	
	//Getters
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	
	// Para comprobar que el valor energetico es correcto si no  pone por defecto
    protected char comprobarConsumoEnergetico(char consumo) {
        if (consumo >= 65 && consumo <= 70) {
            return consumo;
        } else {
            return CONSUMO_DEF;
        }
    }
    
	// Para comprobar que el color es correcto si no  pone por defecto
    protected String comprobarColor(String color) {
        color = color.toLowerCase();
        for (int i = 0; i < COLORS.length; i++) {
			if (color.equals(COLORS[i])) {
                return color;
            }
		}
        return COLOR_DEF;
    }

    
    
    protected double precioFinal() {
    	switch (this.consumoEnergetico) {
			case 'A':
				this.precioBase+=100;
				break;
			case 'B':
				this.precioBase+=80;
				break;
			case 'C':
				this.precioBase+=60;
				break;
			case 'D':
				this.precioBase+=50;
				break;
			case 'E':
				this.precioBase+=30;
				break;
			default:
				this.precioBase+=10;
				break;
		}
    	
    	if(this.peso>=0 && this.peso<=19) {
    		this.precioBase+=10;
    	}else if(this.peso>=20 && this.peso<=49) {
    		this.precioBase+=50;
    	}else if(this.peso>=50 && this.peso<=79) {
    		this.precioBase+=80;
    	}else if(this.peso>=80) {
    		this.precioBase+=100;
    	}
    	
    	return this.precioBase;
    }
}
