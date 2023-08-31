package Gerard_Fernandez_fe_gc_c4_ta26_M5_2;

public class Junior extends Empleado{
	public Junior(String nombre, double salarioMensual) throws IllegalArgumentException {
        super(nombre, salarioMensual);
    }

    @Override
    public double calcularSueldo() {
        return super.getSalarioMensual() * 0.85;
    }
    
    @Override
    protected double validarSalario(double salario) {
        if (salario < 900 || salario >= 1600) {
            throw new IllegalArgumentException("Salario no válido para un Junior.");
        }
        return salario;
    }
}
