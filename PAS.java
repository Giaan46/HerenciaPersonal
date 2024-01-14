package sentencias;

public class PAS extends Personal {

	// Atributos
	int horasExtra = 0;

	// Constructor

	PAS(String nombre, String dni, double horasXContrato, double pagaXHora, int horasExtra) {
		super(nombre, dni, horasXContrato, pagaXHora);
		this.horasExtra = horasExtra;

	}

	// Metodos
	public int getHorasExtra() {
		return this.horasExtra;
	}

	public void resetHorasExtra() {
		this.horasExtra = 0;
	}
	
	
    public double getSalario()
    {
    	return this.getHorasXContrato() * 4 * this.getPagaXHora() + this.horasExtra * 6;
    }

}
