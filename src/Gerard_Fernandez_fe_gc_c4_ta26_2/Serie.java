package Gerard_Fernandez_fe_gc_c4_ta26_2;

public class Serie implements Entregable{
	private final int DEF_TEMPORADAS = 3;
    private final boolean DEF_ENTREGADO = false;
    
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.numTemporadas = DEF_TEMPORADAS;
		this.entregado = DEF_ENTREGADO;
		this.genero = "";
		this.creador = "";
	}

	//Constructor solo con titulo y creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = DEF_TEMPORADAS;
		this.entregado = DEF_ENTREGADO;
		this.genero = "";
		this.creador = creador;
	}

	//Constructor con todo excepto entregado
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = DEF_ENTREGADO;
		this.genero = genero;
		this.creador = creador;
	}

	//Getters
	public String getTitulo() {
		return titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}
	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}
	
	//Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
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

	
	public Object compareTo(Object serieCompare) {
		Serie compare= (Serie)serieCompare;
		
		//Compara el numero de horasy devuelve el objeto que mas tiene
		if(compare.getNumTemporadas()>this.numTemporadas) {
			return compare;
		}else {
			return this;
		}
	}

	
	

	
	
	
	
}
