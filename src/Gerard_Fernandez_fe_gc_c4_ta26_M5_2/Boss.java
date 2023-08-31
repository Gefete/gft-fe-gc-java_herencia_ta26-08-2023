package Gerard_Fernandez_fe_gc_c4_ta26_M5_2;

public class Boss extends Empleado{
	public Boss(String nombre, double salarioMensual) throws IllegalArgumentException {
		
        super(nombre, salarioMensual);
    }

    @Override
    public double calcularSueldo() {
        return super.getSalarioMensual() * 1.50;
    }

    @Override
    protected double validarSalario(double salario) {
        if (salario <= 8000) {
            throw new IllegalArgumentException("Salario no válido para un Boss.");
        }
        return salario;
    }
    
    
}
