package Gerard_Fernandez_fe_gc_c4_ta26_5;

public class Estudiante extends Persona{
	
	private double calificacion;
	private boolean asistencia;
	
	// ===== CONSTRUCTOR ======
	public Estudiante(String nombre, int edad, char sexo, double calificacion, double novillos) {
		super(nombre, edad, sexo);
		this.calificacion = calificationRange(calificacion);
        this.asistencia = this.asistPerson(novillos, 0.5);
	}
	
    // ===== SETTERS ======
    public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
    
    public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}

	// ===== GETTERS ======
    public double getCalificacion() {
		return calificacion;
	}
    
    public boolean isAsistencia() {
		return asistencia;
	}
    
    
    //Metodo para comprobaar que no salga del rango 0-10
    private double calificationRange(double calificacion) {
    	if(calificacion<0) {
    		return 0;
    	}else if(calificacion>10) {
    		return 10;
    	}else {
    		return calificacion;
    	}
    }
    
    //Comprobar si ha hecho novillos el dia en que se ejecuta el metodo
    public boolean asisteClase() {
		int result = (int)Math.floor((Math.random() * 2));
		
		if (result == 1) {
			return true;
		} else {
			return false;
		}
	}

    //Metodo para comprobar que no salga del porcentaje de asistencia
	@Override
	protected boolean asistPerson(double asistencia, double procentaje) {
		return super.asistPerson(asistencia, procentaje);
	}
    
	


	
}
