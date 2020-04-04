package calculadorapagamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraFolhaMensal {

	public static void main(String[] args) {
		System.out.println("----------- Aplicação calculo folha mensal       -----------\n\n");
		int opcao = 0;
		List<calculadorapagamentos.Funcionario> funcionarioList = new ArrayList<>();
		while (opcao != 9) {
			imprimeMenu();
			opcao = lerInteiro();
			if (opcao == 1) {
				// Cadastra Engenheiro
//				Engenheiro eng = new ();
			} else if (opcao == 2) {
				// Cadastra Programador
			} else if (opcao == 3) {
				// Cadastra Gerente
			} else {
				System.out.println("----------- Opção invalida               -----------");
			}
		}
		// Calculo da folha mensal

	}

	private static int lerInteiro() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	private static void imprimeMenu() {
		System.out.println("----------- 1 - Cadastro Engenheiro              -----------");
		System.out.println("----------- 2 - Cadastro Programador             -----------");
		System.out.println("----------- 3 - Cadastro Gerente                 -----------");
		System.out.println("----------- 9 - Calcular e imprimir folha mensal -----------");
	}
}
