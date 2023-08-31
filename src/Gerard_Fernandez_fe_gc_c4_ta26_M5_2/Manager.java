package Gerard_Fernandez_fe_gc_c4_ta26_M5_2;

public class Manager extends Empleado{
	 public Manager(String nombre, double salarioMensual) throws IllegalArgumentException {
	        super(nombre, salarioMensual);
	    }

	    @Override
	    public double calcularSueldo() {
	        return super.getSalarioMensual() * 1.10;
	    }
	    
	    @Override
	    protected double validarSalario(double salario) {
	        if (salario < 3000 || salario >= 5000) {
	            throw new IllegalArgumentException("Salario no válido para un Manager.");
	        }
	        return salario;
	    }
}
