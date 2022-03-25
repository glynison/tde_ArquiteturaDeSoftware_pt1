
public class ObserverCaseMain {

	public static void main(String[] args) {
		CarroPolicia carroPolicia = new CarroPolicia(); // Observador

		CarroRoubado carroRoubado = new CarroRoubado(); // Observado

		carroRoubado.addObserver(carroPolicia); // Adicionar observador ao observado

		carroRoubado.frente();
		carroRoubado.direita();
		carroRoubado.esquerda();
		carroRoubado.para();
	}
}

/**
 * Saída no terminal:
 * Carro roubado segue em frente.
 * Viatura segue em frente.
 * Carro roubado vira a direita.
 * Viatura segue a direita.
 * Carro roubado vira a esquerda.
 * Viatura segue a esquerda.
 * Carro roubado para.
 * Viatura para.
 */