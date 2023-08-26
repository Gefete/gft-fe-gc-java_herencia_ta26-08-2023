package Gerard_Fernandez_fe_gc_c4_ta26_6;

public class Espectador {
	
	private String nombre;
	private String apellido;
	private int edad;
	private double dinero;

   // Constructor con metodos que autorellenan la informacion
	public Espectador() {
		this.nombre=generateName();
		this.apellido=generateLastName();
		this.edad=generateYearOld();
		this.dinero=generateCash();
	}
	
	//Constructor normal donde hay que meter todos los datos a mano
	public Espectador(String nombre, String apellido, int edad, double dinero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dinero = dinero;
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public double getDinero() {
		return dinero;
	}

	// ================ Metodos =======================
	// Metodo que genera nombre aleatorio
	private String generateName() {
        final String[] namesList = {"Pedro", "Sofia", "Oscar", "Nuria", "Fernando", "Laura",
            "Sergio", "Gonzalo", "Claudia", "Esther", "Roberto", "Andrés", "Jhon", "Gerard",
            "Ana", "Eva", "Juan", "Sara"};
        int namePosition = (int)Math.floor(Math.random() * namesList.length);
        return namesList[namePosition];
    }
	
    // Metodo que genera apellido aleatorio
    private String generateLastName() {
        final String[] lastNameList = {"Muñoz", "Soto", "Martinez", "Vizcaya", "Linares", "Garcia",
            "Lopez", "Perez", "Hernandez", "Rodrigez", "Gonzalez", "Fernandez", "Sanchez",
            "Gomez", "Martin", "Duarte", "Villalba", "Rojas", "Ortiz"};
        int lastNamePosition =(int) Math.floor(Math.random() * lastNameList.length);
        return lastNameList[lastNamePosition];
    }
    
    // Metodo que genera edad aleatoria
    private int generateYearOld() {
    	 return (int)Math.floor(Math.random() * 70) + 4;
    }
    
    // Metodo que genera dinero aleatorio
    private double generateCash() {
    	return Math.floor(Math.random() * 50);
    }
}
