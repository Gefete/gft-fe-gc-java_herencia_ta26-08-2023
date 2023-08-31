package Gerard_Fernandez_fe_gc_c4_ta26_M5_3;

public class Volunteer extends Empleado{
	private boolean ayudaGubernamental;
	
	//Por constructor se pasa si es true
	public Volunteer(String nombre, boolean ayudaGubernamental) {
	   super(nombre, 0);
	   this.ayudaGubernamental = ayudaGubernamental;
	   if (ayudaGubernamental) {
	       salarioBrutoMensual = 300;
	   }
	   calcularSalarios();
    }

	
    public boolean isAyudaGubernamental() {
		return ayudaGubernamental;
	}

    //Voluntario no tiene IRPF
	@Override
    protected double calcularPorcentajeIRPF() {
        return 0;
    }
	
	//Añade 300 si ayuda es true
    @Override
    public double calcularSueldo() {
    	if(ayudaGubernamental) {
    		return 300;
    	}else {
    		return 0;
    	}
    }
    
   
}
