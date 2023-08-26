package Gerard_Fernandez_fe_gc_c4_ta26_3;

public class Test_libro {

	public static void main(String[] args) {
		Libro libro1 = new Libro("9788497593793", "IT", "Stephen King", 1503);
		Libro libro2 = new Libro("9788419260024", "YUMI Y EL PINTOR DE PESADILLAS", "BRANDON SANDERSON", 560);
		
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		//Comparacion de cantidad de hojas entre libros
		Libro compareLibro=libro1.compareLibro(libro2);
		
		System.out.println();
		
		System.out.println("El libro con mas hojas es: "+compareLibro.getTitulo()+" con "
		+compareLibro.getNumPaginas()+" hojas");

	}

}
