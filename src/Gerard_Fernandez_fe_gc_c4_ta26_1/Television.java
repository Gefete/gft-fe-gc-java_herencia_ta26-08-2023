package Gerard_Fernandez_fe_gc_c4_ta26_1;

public class Television extends Electrodomestico{
	private final int RESOLUCION_DEF=20;
	private final boolean SINTONIZADOR_TDT_DEF=false;
	
	private int resolucion;
	private boolean sintonizadorTDT;
	
	//Constructor Default
	public Television() {
		super();
		this.resolucion=RESOLUCION_DEF;
		this.sintonizadorTDT=SINTONIZADOR_TDT_DEF;
	}
	
	//Constructor con peso y precio
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion=RESOLUCION_DEF;
		this.sintonizadorTDT=SINTONIZADOR_TDT_DEF;
	}
	
	//Constructor con todos los atributos
	public Television(double precioBase, String color, char consumoEnergetico, 
			double peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}
	
	//Getters
	public int getResolucion() {
		return resolucion;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	//Metodo para obtener el precio total
	@Override
	protected double precioFinal() {
		double precioTotal=super.precioFinal();
		
		if(this.resolucion>40) {
			precioTotal*=1.30; 
		}
		if(this.sintonizadorTDT) {
			precioTotal+=50;
		}
		
		return precioTotal;
	}
	
	
}
