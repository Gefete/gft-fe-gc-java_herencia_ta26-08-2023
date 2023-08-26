package Gerard_Fernandez_fe_gc_c4_ta26_2;

public class Videojuego implements Entregable {
	private final int DEF_HORAS_ESTIMADAS = 10;
    private final boolean DEF_ENTREGADO = false;
    
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String companya;
	
	//Constructor por defecto
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = DEF_HORAS_ESTIMADAS;
		this.entregado = DEF_ENTREGADO;
		this.genero = "";
		this.companya = "";
	}

	//Constructor solo con titulo y creador
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = DEF_ENTREGADO;
		this.genero = "";
		this.companya = "";
	}

	//Constructor con todo excepto entregado
	public Videojuego(String titulo, int horasEstimadas, String genero, String companya) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = DEF_ENTREGADO;
		this.genero = genero;
		this.companya = companya;
	}

	//Getters
	public String getTitulo() {
		return titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return companya;
	}
	
	//Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.companya = creador;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", companya=" + companya + "]";
	}

	
	public void entregar() {
		this.entregado=true;
		
	}

	
	public void devolver() {
		this.entregado=false;
		
	}

	
	public boolean isEntregado() {
		return this.entregado;
	}

	
	public Object compareTo(Object vidojuegoCompare) {
		Videojuego compare= (Videojuego)vidojuegoCompare;
		
		//Compara el numero de horasy devuelve el objeto que mas tiene
		if(compare.getHorasEstimadas()>this.horasEstimadas) {
			return compare;
		}else {
			return this;
		}
	}
	
}
