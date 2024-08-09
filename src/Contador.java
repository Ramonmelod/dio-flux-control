
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
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		int contagem = parametroDois - parametroUm;

		if (contagem <= 0) {
			System.out.println("segundo número precisa ser maior que o primeiro");
		} else {
			for (int i = 0; i <= contagem; i++) {
				System.out.println(i);
			}
		}

		// realizar o for para imprimir os números com base na variável contagem
	}
}