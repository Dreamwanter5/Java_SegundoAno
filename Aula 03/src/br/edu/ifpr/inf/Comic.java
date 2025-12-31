package br.edu.ifpr.inf;

import java.util.Scanner;

public class Comic {
	public static void main(String[] args) {
		// Lembrar que os nomes de variável tem que começar com letra *minúscula*
		// Sring por questão de obrigação tem que começar com leta maiúscula
		String nomeQuadrinho;
		String generoQuadrinho;
		double preco;
		int quantidade;
		// Classe Java do pacote util usada para a leitura de dados

		Scanner scanner = new Scanner(System.in);
		Scanner rogerio = new Scanner(System.in); 
		// É precisso digitar "Scanner" como ferramenta, depois do "=" você coloca o nome do Scanner
		// "New Scanner" significa que você está colocando outro scanner no sistema.
		// "System IN" quer dizer que você ira inserir alguma coisa.
		System.out.println("Informe o nome do quadrinho: ");
		nomeQuadrinho = scanner.nextLine();
		/*
		 * Usar "next" salva apenas a próxima "STRING" digitada. Mas caso você queira
		 * salvar mais do que um String, é necessário usar "nextLine".
		 */
		System.out.println("Diga o gênero do quadrinho: ");
		generoQuadrinho = rogerio.next();
		System.out.println("Preço: ");
		preco = scanner.nextDouble();
		System.out.println("Quantidade: ");
		quantidade = scanner.nextInt();

		System.out.println(nomeQuadrinho); //"ln = Line"
		System.out.println(generoQuadrinho);
		System.out.println(preco);
		System.out.println(quantidade);
	}

}
