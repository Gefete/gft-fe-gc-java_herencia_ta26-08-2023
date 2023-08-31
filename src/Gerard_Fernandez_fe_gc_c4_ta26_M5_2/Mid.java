package Gerard_Fernandez_fe_gc_c4_ta26_M5_2;

public class Mid extends Empleado{
	public Mid(String nombre, double salarioMensual) throws IllegalArgumentException {
        super(nombre, salarioMensual);
    }

    @Override
    public double calcularSueldo() {
        return super.getSalarioMensual() * 0.90;
    }
    
    @Override
    protected double validarSalario(double salario) {
        if (salario < 1800 || salario >= 2500) {
            throw new IllegalArgumentException("Salario no válido para un Mid.");
        }
        return salario;
    }
}
