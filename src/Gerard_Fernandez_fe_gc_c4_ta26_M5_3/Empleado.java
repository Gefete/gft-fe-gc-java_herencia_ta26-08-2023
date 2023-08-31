package Gerard_Fernandez_fe_gc_c4_ta26_M5_3;

public class Empleado {
	private String nombre;
    protected double salarioBrutoMensual;
    private double salarioNetoMensual;
    private double salarioBrutoAnual;
    private double salarioNetoAnual;

    public Empleado(String nombre, double salarioBrutoMensual) {
        this.nombre = nombre;
        this.salarioBrutoMensual = validarSalario(salarioBrutoMensual);
        this.calcularSalarios();
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBrutoMensual() {
        return salarioBrutoMensual;
    }

    public double getSalarioNetoMensual() {
        return salarioNetoMensual;
    }

    public double getSalarioBrutoAnual() {
        return salarioBrutoAnual;
    }

    public double getSalarioNetoAnual() {
        return salarioNetoAnual;
    }

    public double calcularSueldo() {
        return salarioNetoMensual;
    }

    //Calcula los margenes de ganancia medios de cada tipo de usuario
    protected double validarSalario(double salario) {
        return salario;  
    }

    //Realiza los calculos de salarios 
    //llama a otro metodo para obtener los porcentajes de IRPF 
    protected void calcularSalarios() {
        salarioNetoMensual = salarioBrutoMensual * (1 - calcularPorcentajeIRPF());
        salarioBrutoAnual = salarioBrutoMensual * 12;
        salarioNetoAnual = salarioNetoMensual * 12;
    }

    protected double calcularPorcentajeIRPF() {
        return 0;  
    }

    //Emite bonus a los trabajadores exceptuando voluntarios
    public void emitirBonus() {
    	//el bonus es un incremento de 10% del sueldo del trabajador
        if (!(this instanceof Volunteer)) {
            double bonus = salarioBrutoAnual * 0.10;
            salarioBrutoAnual += bonus;
            calcularSalarios();
            System.out.println("Se ha emitido un bonus del 10% a " + nombre);
        } else {
            System.out.println(nombre + " es un voluntario y no recibe bonus.");
        }
    }
}
