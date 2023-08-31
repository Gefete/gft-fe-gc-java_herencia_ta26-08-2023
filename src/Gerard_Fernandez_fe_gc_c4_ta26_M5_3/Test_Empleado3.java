package Gerard_Fernandez_fe_gc_c4_ta26_M5_3;

public class Test_Empleado3 {
	public static void main(String[] args) {
		//Creacion de empleados
        Empleado[] empleados = new Empleado[]{
            new Boss("Jefe 1", 9000),
            new Manager("Gerente 1", 4000),
            new Senior("Senior 1", 3000),
            new Mid("Mid 1", 2000),
            new Junior("Junior 1", 1500),
            new Volunteer("Voluntario 1", true),
            new Volunteer("Voluntario 2", false)
        };

        for (Empleado empleado : empleados) {
        	//Si es voluntario
            if (empleado instanceof Volunteer) {
            	Volunteer voluntario=(Volunteer)empleado;
            	//Si es voluntario y tiene ayuda del estado
            	if(voluntario.isAyudaGubernamental()) {
            		System.out.println(empleado.getNombre() + ": Ayuda Mensual estado = " + empleado.getSalarioNetoMensual()
	                + ", ayuda estado Neto Anual = " + empleado.getSalarioNetoAnual());
            	}else {
	            	System.out.println(empleado.getNombre() + ": Sueldo Neto Mensual = " + empleado.getSalarioNetoMensual()
	                + ", Sueldo Neto Anual = " + empleado.getSalarioNetoAnual());
            	}
            } else {
	        	System.out.println(empleado.getNombre() + ": Sueldo Neto Mensual = " + empleado.getSalarioNetoMensual()
	                + ", Sueldo Neto Anual = " + empleado.getSalarioNetoAnual());
            }
            empleado.emitirBonus();
        }
    }
}
