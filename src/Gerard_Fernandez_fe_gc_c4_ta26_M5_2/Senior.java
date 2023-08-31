package Gerard_Fernandez_fe_gc_c4_ta26_M5_2;

public class Senior extends Empleado{
	public Senior(String nombre, double salarioMensual) throws IllegalArgumentException {
        super(nombre, salarioMensual);
    }

    @Override
    public double calcularSueldo() {
        return super.getSalarioMensual() * 0.95;
    }
    
    @Override
    protected double validarSalario(double salario) {
        if (salario < 2700 || salario >= 4000) {
            throw new IllegalArgumentException("Salario no válido para un Senior.");
        }
        return salario;
    }
}
