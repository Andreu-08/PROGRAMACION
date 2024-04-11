package SeleccionFutbol;

import java.util.ArrayList;

public class PruebaSeleccion {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
		public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

		public static void main(String[] args) {
			
			SeleccionFutbol luisEnrique = new Entrenador(1, "Luis Enrique", "Martinez", 48, 28489);
			SeleccionFutbol pedri = new Futbolista(2, "Pedro", "Gonz�lez", 18, 8, "Mediapunta");
			SeleccionFutbol raulMartinez = new Masajista(3, "Ra�l", "Martinez", 41, "Licenciado en Fisioterapia", 18);

			integrantes.add(luisEnrique);
			integrantes.add(pedri);
			integrantes.add(raulMartinez);

			// CONCENTRACION
			System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo m�todo)");
			for (SeleccionFutbol integrante : integrantes) {
				System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
				integrante.concentrarse();
			}

			// VIAJE
			System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo m�todo)");
			for (SeleccionFutbol integrante : integrantes) {
				System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
				integrante.viajar();
			}

			// ENTRENAMIENTO
			System.out.println("\nEntrenamiento: Todos los integrantes tienen su funci�n en un entrenamiento (Especializaci�n)");
			for (SeleccionFutbol integrante : integrantes) {
				System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
				integrante.entrenamiento();
			}

			// PARTIDO DE FUTBOL
			System.out.println("\nPartido de F�tbol: Todos los integrantes tienen su funci�n en un partido (Especializaci�n)");
			for (SeleccionFutbol integrante : integrantes) {
				System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
				integrante.partidoFutbol();
			}

			// PLANIFICAR ENTRENAMIENTO
			System.out.println("\nPlanificar Entrenamiento: Solo el entrenador tiene el m�todo para planificar un entrenamiento:");
			System.out.print(luisEnrique.getNombre() + " " + luisEnrique.getApellidos() + " -> ");
			((Entrenador) luisEnrique).planificarEntrenamiento();

			// ENTREVISTA
			System.out.println("\nEntrevista: Solo el futbolista tiene el m�todo para dar una entrevista:");
			System.out.print(pedri.getNombre() + " " + pedri.getApellidos() + " -> ");
			((Futbolista) pedri).entrevista();

			// MASAJE
			System.out.println("\nMasaje: Solo el masajista tiene el m�todo para dar un masaje:");
			System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
			((Masajista) raulMartinez).darMasaje();

		}
			
	
}
