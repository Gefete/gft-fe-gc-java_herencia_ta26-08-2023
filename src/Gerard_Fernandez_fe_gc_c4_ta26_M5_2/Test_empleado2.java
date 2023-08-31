package Gerard_Fernandez_fe_gc_c4_ta26_M5_2;

public class Test_empleado2 {
    public static void main(String[] args) {
    	Empleado[] empleados = new Empleado[]{
	        new Boss("Jefe 1", 9000),
	        new Manager("Gerente 1", 4000),
	        new Senior("Senior 1", 3000),
	        new Mid("Mid 1", 1799), //<--Puesto un salario menor para que salte el exception
	        new Junior("Junior 1", 1500),
	        new Volunteer("Voluntario 1")
	    };
	
	    for (Empleado empleado : empleados) {
	        System.out.println(empleado.getNombre() + ": Sueldo = " + empleado.calcularSueldo());
	    }
    }
}
