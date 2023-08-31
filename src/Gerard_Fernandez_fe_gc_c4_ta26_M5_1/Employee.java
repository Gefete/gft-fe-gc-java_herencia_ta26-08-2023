package Gerard_Fernandez_fe_gc_c4_ta26_M5_1;

public class Employee extends Empleado{
	public Employee(String nombre, double salarioMensual) {
        super(nombre, salarioMensual);
    }

    @Override
    public double calcularSueldo() {
        return super.getSalarioMensual() * 0.85;
    }
}
