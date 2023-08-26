package Gerard_Fernandez_fe_gc_c4_ta26_6;

public class Asiento {
 
	private int fila;
    private char columna;
    private boolean ocupado;

    public Asiento(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = false;
    }

    // Métodos para marcar como ocupado y desocupar el asiento
    public void ocupar() {
        this.ocupado = true;
    }

    public void desocupar() {
        this.ocupado = false;
    }

    // Getter para el estado de ocupación del asiento
    public boolean estaOcupado() {
        return ocupado;
    }

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		this.columna = columna;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
    
    
}
