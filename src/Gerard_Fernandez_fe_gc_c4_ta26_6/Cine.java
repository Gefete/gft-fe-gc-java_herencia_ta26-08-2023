package Gerard_Fernandez_fe_gc_c4_ta26_6;

public class Cine {
	private Pelicula peliculaActual;
    private double precioEntrada;
    private Asiento[][] asientos;

    
    
    public Cine(Pelicula peliculaActual, double precioEntrada) {
        this.peliculaActual = peliculaActual;
        this.precioEntrada = precioEntrada;
        this.asientos = new Asiento[8][9];
        inicializarAsientos();
    }
    
    public Pelicula getPeliculaActual() {
		return peliculaActual;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	private void inicializarAsientos() {
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                asientos[fila][columna] = new Asiento(8 - fila, (char) ('A' + columna));
            }
        }
    }
    
    public Asiento[][] getAsientos() {
        return asientos;
    }

    public Asiento getAsientoDisponible() {
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                if (!asientos[fila][columna].estaOcupado()) {
                    return asientos[fila][columna];
                }
            }
        }
        return null;
    }
}
