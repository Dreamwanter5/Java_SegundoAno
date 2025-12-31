package edu.br.pr.ifpr;

import java.util.Scanner;

public class SoftwareParaControleDeEstoque {
	public static void main(String[] args) {
		String descricaoProd;
		String categoriaProd;
		double valorProd;
		String fornecedorProd;
		int quantProd;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Descrição do produto:");
		descricaoProd = scanner.nextLine();
		System.out.println("Categoria do Produto: ");
		categoriaProd = scanner.nextLine();
		System.out.println("Valor do Produto: ");
		valorProd = scanner.nextDouble();
		System.out.println("Fornecedor do Produto: ");
		fornecedorProd = scanner.next();
		System.out.println("Quantida de Produtos no estoque: ");
		quantProd = scanner.nextInt();

		System.out.println("Descrição: " + descricaoProd);
		System.out.println("Categoria do Produto:" + categoriaProd);
		System.out.println("valor do produto: " + valorProd);
		System.out.println("Fornecedor do produto: " + fornecedorProd);
		System.out.println("Quantidade do produto: " + quantProd);

	}

}
