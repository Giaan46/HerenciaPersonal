package sentencias;

public class Main {

	public Main() {
		// Constructor, aqui en realidad no hara hada ya que
		// todo se realiza en el metodo estatico main()
	}

	public static void main(String[] args) {
		
		// Comienzo
		System.out.println("Gestion de Personal de Universidades");
		System.out.println("************************************");
		System.out.println();

		// Crear personal
		Personal[] listaPersonal = new Personal[4];  
		
		listaPersonal[0] = new Administrativo("Gianluca", "123456789Z", 22); // 22 horas extra
		listaPersonal[1] = new Informatico("Gabriel",     "987654321A", 30); // 30 horas extra
		listaPersonal[2] = new Profesor("Bianca",         "666888999R", 3);  //   3 sexenios
		listaPersonal[3] = new Investigador("Ivette",     "999888777K");     // No tiene ni horas extra ni sexenios
		
		// Imprimir las nominas
		Universidad.imprimirNominas(listaPersonal);

		
		// Ver el presupuesto total
		System.out.println("Presupuesto Total: " + Universidad.obtenerPresupuestoTotal(listaPersonal));
		
	}
}
