package Gerard_Fernandez_fe_gc_c4_ta26_1;


public class Lavadora extends Electrodomestico {
	
	private final double CARGA_DEF=5;
	
	private double carga;

	public Lavadora() {
		super();
		this.carga=CARGA_DEF;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga=CARGA_DEF;
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga=carga;
	}

	//Getter
	public double getCarga() {
		return carga;
	}

	@Override
	protected double precioFinal() {
		double preciobase=0;
		
		if(this.carga>30) {
			preciobase+=50;
		}
		
		return super.precioFinal()+preciobase;
	}
	
	
	
	
}
