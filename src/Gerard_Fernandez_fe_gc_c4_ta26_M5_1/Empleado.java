package Gerard_Fernandez_fe_gc_c4_ta26_M5_1;

public class Empleado {
	private String nombre;
    private double salarioMensual;

    public Empleado(String nombre, double salarioMensual) {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public double calcularSueldo() {
        return salarioMensual;
    }
}
