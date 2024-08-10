
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        terminal.close();

		try {
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {

			System.out.println(e);
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		int contagem = parametroDois - parametroUm;

		if (contagem <= 0) {
			throw new ParametrosInvalidosException("segundo número precisa ser maior que o primeiro");
		} else {
			for (int i = 0; i <= contagem; i++) {
				System.out.println("Printing number: " + i);
			}
		}


	}
}