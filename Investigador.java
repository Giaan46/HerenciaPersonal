package sentencias;

public class Investigador extends PDI{
	
	// Atributos?

    public Investigador(String nombre, String dni) {
		// Rellena el constructor
		super(nombre, dni, 35, 7.0); // horasXContrato --> 35   pagaXHora --> 7.0
	}

    // Metodos

    public double getSalario()
    {
    	return this.getHorasXContrato() * 4 * this.getPagaXHora()  ;
    }
}
