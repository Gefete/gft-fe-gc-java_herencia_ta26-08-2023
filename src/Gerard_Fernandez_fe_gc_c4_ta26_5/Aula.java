package Gerard_Fernandez_fe_gc_c4_ta26_5;

public class Aula {
	private String[] MATERIAS_DEF= {"Matemáticas", "Filosofía", "Física"};
	
	private int id;
	private int maxEstudiantes;
	private String destinada;
	private Profesor profesor;
	private Estudiante[] estudiantes;
	
	//Constructor 1
	public Aula( int maxEstudiantes, String destinada, Profesor profesor, Estudiante[] estudiantes) {
		this.id = generarIdentificador();
		this.maxEstudiantes = maxEstudiantes;
		this.destinada = materiaDestinada(destinada);
		this.profesor = profesor;
		this.estudiantes = estudiantes;
	}
	
	//Constructor 2
	public Aula(int id, int maxEstudiantes, String destinada, Profesor profesor, Estudiante[] estudiantes) {
		this.id = id;
		this.maxEstudiantes = maxEstudiantes;
		this.destinada = destinada;
		this.profesor = profesor;
		this.estudiantes = estudiantes;
	}

    // ===== SETTERS ======
    public void setId(int newIdentificador) {
        this.id = newIdentificador;
    }
    public void setMaxEstudiantes(int newMax) {
        this.maxEstudiantes = newMax;
    }
    public void setDestinada(String newMateria) {
        this.destinada = newMateria;
    }
    // ===== GETTERS ======
    public int getId() {
        return this.id;
    }
    public int getMaxEstudiantes() {
        return this.maxEstudiantes;
    }
    public String getMateria() {
        return this.destinada;
    }
    
 // Metodo para saber si puede dar clase
 	public boolean canTeach() {
 		
 		//Asistencia profesor
 		if (profesor.isAsistencia() && profesor.asisteClase()) {
 			System.out.println("El profesor no ha asistido");
 			return false;
 		}

 		//Materia profesor
 		if (!profesor.getMateria().equalsIgnoreCase(this.destinada)) {
 			System.out.println("El profesor se equivoco de clase");
 			return false;
 		}

 		//Alumnos presentes
 		
 		int numPresentes = 0;
 		
 		for (Estudiante estudiante : this.estudiantes) {
 			
 			if (estudiante.asisteClase() && estudiante.isAsistencia()) {
 				numPresentes++;
 			}
 		}

 		double asistentesProcentaje=this.estudiantes.length*0.5;
 		
 		if ((double) numPresentes < asistentesProcentaje) {
 			System.out.println("Falta la mitad de los alumnos");
             return false;
        }
 		
 		return true;
	}
 		
    //Comprueba la materia
    private String materiaDestinada(String materia) {
    	for (int i = 0; i < MATERIAS_DEF.length; i++) {
			if(this.MATERIAS_DEF[i].equalsIgnoreCase(materia)) {
				return materia;
			}
		}
		return MATERIAS_DEF[0];
    }
    
    public int generarIdentificador() {
    	int id;
        id = (int) Math.floor(Math.random() * (9999 - 1000 + 1) * 1000);
        return id;
    }
}
