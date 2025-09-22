package fila_pilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaEstDados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();
		int opcao;

		do {
			System.out.println("========================================");
			System.out.println("===============Menu=====================");
			System.out.println("===1: Adicionar cliente na Fila=========");
			System.out.println("===2: Listar todos os Clientes==========");
			System.out.println("===3: Retirar Clientes da Fila==========");
			System.out.println("===0: Sair==============================");
			System.out.println("========================================");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();
			switch (opcao) {
			case 0:
				System.out.println("Programa Finalizado!");
				break;
			case 1:
				System.out.println("Digite o nome: ");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nFila:\n " + nome + "\nCliente Adicionado! ");
				break;

			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("\nLista de Clientes:\n");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Digite o nome: ");
					String nome3 = leia.nextLine();
					if(fila.remove(nome3)) {
						System.out.println("\nCliente " + nome3 + " foi removido!");
                        System.out.println("\nFila atual:");
                        for (String c : fila) {
                            System.out.println(c);
                        }
                    } else {
                        System.out.println("\nCliente não encontrado na fila!");
                    }
                }
                break;

			default:
				System.out.println("Opção inválida!");

			}

		} while (opcao != 0);

		leia.close();

	}

}
