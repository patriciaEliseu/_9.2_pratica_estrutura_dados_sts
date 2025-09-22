package fila_pilha;

import java.util.Stack;
import java.util.Scanner;

public class PilhaEstDados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		Stack<String> pilhaLivros = new Stack<String>();
        int opcao;
        
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    adicionarLivro(pilhaLivros, scanner);
                    break;
                case 2:
                    listarLivros(pilhaLivros);
                    break;
                case 3:
                    retirarLivro(pilhaLivros);
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
    
    private static void exibirMenu() {
        System.out.println("\n========================================");
        System.out.println("===============Menu=====================");
        System.out.println("===1: Adicionar livro na Pilha=========");
        System.out.println("===2: Listar todos os Livros==========");
        System.out.println("===3: Retirar livro da Pilha==========");
        System.out.println("===0: Sair============================");
        System.out.println("========================================");
        System.out.print("Digite uma opção: ");
    }
    
    private static void adicionarLivro(Stack<String> pilha, Scanner scanner) {
        System.out.print("Digite o nome do livro: ");
        String livro = scanner.nextLine();
        pilha.push(livro);
        System.out.println("\nPilha:");
        listarLivros(pilha);
        System.out.println("Livro adicionado!");
    }
    
    private static void listarLivros(Stack<String> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("A Pilha está vazia!");
            return;
        }
        
        System.out.println("\nLista de Livros na Pilha:");
        Stack<String> auxiliar = new Stack<>();
        while (!pilha.isEmpty()) {
            String livro = pilha.pop();
            System.out.println(livro);
            auxiliar.push(livro);
        }
        while (!auxiliar.isEmpty()) {
            pilha.push(auxiliar.pop());
        }
    }
    
    private static void retirarLivro(Stack<String> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("A Pilha está vazia!");
            return;
        }
        
        String livro = pilha.pop();
        System.out.println("\nPilha:");
        listarLivros(pilha);
        System.out.println("O livro '" + livro + "' foi retirado da pilha!");
    }

	}


