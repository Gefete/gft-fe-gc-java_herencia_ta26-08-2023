package Gerard_Fernandez_fe_gc_c4_ta26_M5_1;

public class Boss extends Empleado{
	 public Boss(String nombre, double salarioMensual) {
	        super(nombre, salarioMensual);
	    }

	    @Override
	    public double calcularSueldo() {
	        return super.getSalarioMensual() * 1.50;
	    }
}
