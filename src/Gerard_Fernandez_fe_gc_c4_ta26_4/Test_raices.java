package Gerard_Fernandez_fe_gc_c4_ta26_4;

public class Test_raices {

	public static void main(String[] args) {
		System.out.println();
		// Operacion con una sola solucion
		System.out.println("Operacion con una sola solucion");
		Raices operacion = new Raices(1, 2, 1);
		operacion.calcular();
		// Operacion con 2 soluciones
		System.out.println("Operacion con 2 soluciones");
		Raices operacion2 = new Raices(1, -5, 6);
		operacion2.calcular();
		// Operacion sin ninguna solucion
		System.out.println("Operacion sin ninguna solucion");
		Raices operacion3 = new Raices(1, 1, 1);
		operacion3.calcular();

	}

}
