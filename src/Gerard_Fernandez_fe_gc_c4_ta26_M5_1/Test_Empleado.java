package Gerard_Fernandez_fe_gc_c4_ta26_M5_1;

public class Test_Empleado {
	public static void main(String[] args) {
        Empleado[] empleados = new Empleado[]{
            new Manager("Gerente 1", 2000),
            new Boss("Jefe 1", 1500),
            new Employee("Empleado 1", 1000),
            new Volunteer("Voluntario 1")
        };

        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + ": Sueldo = " + empleado.calcularSueldo());
        }
    }
}
