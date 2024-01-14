package sentencias;

public class Profesor extends PDI {

	private int sexenios = 0;

	// Atributos

	public Profesor(String nombre, String dni, int sexenios) {
		// Rellena el constructor
		super(nombre, dni, 37.0, 8.0); // horasXContrato --> 37.0   pagaXHora --> 8.0
		this.sexenios = sexenios;
	}

	// Metodos
    public double getSalario()
    {
    	return this.getHorasXContrato() * 4 * this.getPagaXHora() + this.sexenios * 100  ;
    }

}
