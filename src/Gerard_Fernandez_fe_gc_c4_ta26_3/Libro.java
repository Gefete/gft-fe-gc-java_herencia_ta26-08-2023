package Gerard_Fernandez_fe_gc_c4_ta26_3;

public class Libro {
	private String ISBN;
	private String titulo;
	private String autor;
	private int numPaginas;
	
	
	public Libro(String iSBN, String titulo, String autor, int numPaginas) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	//Getters
	public String getISBN() {
		return ISBN;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}


	public int getNumPaginas() {
		return numPaginas;
	}
	
	//Setters
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	//Metodo comparar hojas
	public Libro compareLibro(Libro libroCompare) {
		if(this.numPaginas>libroCompare.getNumPaginas()) {
			return this;
		}else {
			return libroCompare;
		}
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "El libro con ISBN: " + ISBN + " creado por el autor: " + autor + " tiene " + numPaginas + " páginas";
	}
	
	
	
	
	
	
}
