package Gerard_Fernandez_fe_gc_c4_ta26_5;

public class Test_aula {
	public static void main(String[] args) {

		// estudiantes
		Estudiante estudiantes[] = new Estudiante[10];

		estudiantes[0] = new Estudiante("Jose", 21, 'H', 9, 20);
		estudiantes[1] = new Estudiante("Nuria", 22, 'M', 10, 280);
		estudiantes[2] = new Estudiante("Manuel", 23, 'H', 2, 0);
		estudiantes[3] = new Estudiante("Richard", 23, 'H', 3, 12);
		estudiantes[4] = new Estudiante("Maria", 25, 'M', 5, 0);
		estudiantes[5] = new Estudiante("Pedro", 24, 'H', 6, 22);
		estudiantes[6] = new Estudiante("Javier", 22, 'H', 8, 9);
		estudiantes[7] = new Estudiante("Roberto", 21, 'H', 5, 9);
		estudiantes[8] = new Estudiante("Rosa", 20, 'M', 5, 9);
		estudiantes[9] = new Estudiante("Alfredo", 19, 'H', 6, 9);

		// profesor
		Profesor profesor = new Profesor("Maria Cruz", 40, 'M', "matemáticas", 30);

		// aula
		Aula aula = new Aula(9, 10, "matemáticas", profesor, estudiantes);

		// Miramos si se puede dar clase, y si es así, mostramos cuantos alumnos y alumnas estan aprobados
		if (aula.canTeach()) {

			System.out.println("El profesor realiza la clase");

			int alumnasAprobadas = 0;
			int alumnosAprobados = 0;

			for (Estudiante estudiante : estudiantes) {
				if (estudiante.getCalificacion() >= 5) {
					if (estudiante.getSexo() == 'M') {
						alumnasAprobadas++;
					}else{

						alumnosAprobados++;
					}
				}
			}
			
			System.out.println("Alumnas aprobadas: " + alumnasAprobadas);
			System.out.println("Alumnos aprobados: " + alumnosAprobados);

		} else {
			System.out.println("No se puede dar clase");
		}
	}
}
