package sentencias;

public class Universidad {

	public static void imprimirNominas(Personal[] listaPersonal) {
		System.out.println("Listado de Nomina");
		System.out.println("-----------------");

		// Rellenar la funcion
		long plantilla = 0;
		for (Object personal : listaPersonal) {
			System.out.printf("%-30s--> ", ((Personal) personal).getNombre());

			if (personal instanceof Administrativo) {
				// Es administrativo
				System.out.printf("%6.1f\n", ((Administrativo) personal).getSalario());

			} else if (personal instanceof Informatico) {
				// Es Informatico
				System.out.printf("%6.1f\n", ((Informatico) personal).getSalario());

			} else if (personal instanceof Profesor) {
				// Es Profesor
				System.out.printf("%6.1f\n", ((Profesor) personal).getSalario());

			} else if (personal instanceof Investigador) {
				// Es Investigador
				System.out.printf("%6.1f\n", ((Investigador) personal).getSalario());
			}
			plantilla++;
		}
		System.out.println();
	}

	public static double obtenerPresupuestoTotal(Personal[] listaPersonal) {
		// Rellena la funcion
		double presupuestoTotal = 0.0;
		for (Object personal : listaPersonal) {
			if (personal instanceof Administrativo) {
				// Es administrativo
				presupuestoTotal += ((Administrativo) personal).getSalario();

			} else if (personal instanceof Informatico) {
				// Es Informatico
				presupuestoTotal += ((Informatico) personal).getSalario();

			} else if (personal instanceof Profesor) {
				// Es Profesor
				presupuestoTotal += ((Profesor) personal).getSalario();

			} else if (personal instanceof Investigador) {
				// Es Investigador
				presupuestoTotal += ((Investigador) personal).getSalario();
			}
		}

		return presupuestoTotal;
	}
}
