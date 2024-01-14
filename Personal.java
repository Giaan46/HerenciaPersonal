package sentencias;

public class Personal {

	//Atributos
	private String nombre;
    private String dni;
    private double horasTrabajadas = 0.0;
    private double horasXContrato = 0.0;
    private double pagaXHora = 0.0;

	
	// Constructor
    public Personal(String nombre, String dni, double horasXContrato, double pagaXHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasXContrato = horasXContrato;
        this.pagaXHora = pagaXHora;
    }

    //Metodos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setHorasXContrato(int horasXContrato) {
        this.horasXContrato = horasXContrato;
    }

    public void setPagaXHora(double pagaXHora) {
        this.pagaXHora = pagaXHora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public double getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public double getHorasXContrato() {
        return this.horasXContrato;
    }

    public double getPagaXHora() {
        return this.pagaXHora;
    }
}
