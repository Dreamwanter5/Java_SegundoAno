package edu.br.pr.ifpr;

import java.util.Scanner;

public class AtividadeDemanda {
	public static void main(String[] args) {
		/*
		 * A demanda vai ser de um programa que sirva para armazenar mensagens e
		 * acessá-las depois. As variáveis do programa seriam String (para armazenar
		 * as mensagens) e int (para numerar as mensagens). 
		 */

		int nmsg;
		
		String[] listaMensagens = new String[10];
		Scanner scanner = new Scanner(System.in);
		// Criação de variável -> Condição para funcionamento de uma mecânica
		// de repetição do código. -> Soma da varíavel no começo + 1.
		for (int contador = 0; contador < listaMensagens.length; contador = contador + 1) {

			System.out.println("Escreva a " + (contador + 1) + "° mensagem.");
			String mensagem = scanner.nextLine();
			listaMensagens[contador] = mensagem;
		}
		
		for (int contador = 0; contador < listaMensagens.length; contador = contador + 1) {
			
			
			System.out.println("Escolha uma mensagem para ser lida novamente: ");
			nmsg = scanner.nextInt();
			System.out.println(listaMensagens[nmsg-1]);
			
		}

	}
}
