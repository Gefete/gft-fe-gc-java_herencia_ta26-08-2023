package Gerard_Fernandez_fe_gc_c4_ta26_5;


public class Profesor extends Persona{
	
	
	private String[] MATERIAS_DEF= {"Matemáticas", "Filosofía", "Física"};
	
	private String materia;
	private boolean asistencia;
	
	
	
	public Profesor(String nombre, int edad, char sexo, String materia, double asistencia) {
		super(nombre, edad, sexo);
		this.materia = getMateriaSelected(materia);
		this.asistencia = asistPerson(asistencia,0.2);
	}

	//Setters
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}

	//Getters
	public String getMateria() {
		return materia;
	}
	public boolean isAsistencia() {
		return asistencia;
	}

	//Comprobar si el profesor ha faltado ese dia
    public boolean asisteClase() {
		int result = (int)Math.floor((Math.random() * 2));
		
		if (result == 1) {
			return true;
		} else {
			return false;
		}
	}

	//Comprobar la materia que se ha pasado como argumento
	private String getMateriaSelected(String materia) {
		for (int i = 0; i < MATERIAS_DEF.length; i++) {
			if(this.MATERIAS_DEF[i].equalsIgnoreCase(materia)) {
				return materia;
			}
		}
		return MATERIAS_DEF[0];
	}

	//Comprobar la asistencia general
	@Override
	protected boolean asistPerson(double asistencia, double procentaje) {
		return super.asistPerson(asistencia, procentaje);
	}


	
}
