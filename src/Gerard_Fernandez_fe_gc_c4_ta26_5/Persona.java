package Gerard_Fernandez_fe_gc_c4_ta26_5;

public class Persona {
	private final double HORAS_ASISTENCIA_DEF=360;
	
	private String nombre;
	private int edad;
	private char sexo;
	
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	
	 //  ===== SETTERS =====
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
    
	//  ===== GETTERS =====
    public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}


	public char getSexo() {
		return sexo;
	}

	
	protected boolean asistPerson(double noAsistencia, double procentaje) {
    	//Se calcula el porcentaje pasado por argumento de las horas del curso
    	double horasFaltantesPermitidas=HORAS_ASISTENCIA_DEF*procentaje;
    	
    	//Si los novillos superan el numero permitido se penaliza
        if(noAsistencia>horasFaltantesPermitidas) {
        	return false;
        }else {
        	return true;
        }
    }
	
    //  ===== tostring() =====
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
}


	
