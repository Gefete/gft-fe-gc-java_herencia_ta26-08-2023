package Gerard_Fernandez_fe_gc_c4_ta26_M5_3;

public class Mid extends Empleado{
	  public Mid(String nombre, double salarioBrutoMensual) {
	        super(nombre, salarioBrutoMensual);
	    }

	  	//Se pasa a los adtos del padre el procentaje (se calcula en un metodo del padre)
	    @Override
	    protected double calcularPorcentajeIRPF() {
	        return 0.15;
	    }

	    @Override
	    public double calcularSueldo() {
	        return getSalarioNetoMensual();
	    }
	    
	    //Calcula los margenes de ganancia medios de cada tipo de usuario
	    @Override
	    protected double validarSalario(double salario) {
	        if (salario < 1800 || salario >= 2500) {
	            throw new IllegalArgumentException("Salario no válido para un Mid.");
	        }
	        return salario;
	    }
}
