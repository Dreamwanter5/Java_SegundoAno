package edu.br.pr.ifpr;

import java.util.Scanner;

public class SoftwareAcadêmico {
	public static void main(String[] args) {
		String nomeEstudante;
		String email;	
		String celular;
		String rg;
		String cpf; 
		double rendaFamilia;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite seu nome:");
		nomeEstudante = scanner.nextLine();
		System.out.println("Digite seu email: ");
		email = scanner.next();
		System.out.println("Digite o número do seu celular: ");
		celular = scanner.next();
		System.out.println("Digite seu RG (sem caractéres especiais): ");
		rg = scanner.next();
		System.out.println("Digite seu CPF (sem caractéres especiais): ");
		cpf = scanner.next();
		System.out.println("Digite sua renda familiar: ");
		rendaFamilia = scanner.nextDouble();
		
		System.out.println("nome: " + nomeEstudante);
		System.out.println("email: " + email);
		System.out.println("celular: " + celular);
		System.out.println("rg: " + rg);
		System.out.println("cpf: " + cpf);
		System.out.println("renda familiar: " + rendaFamilia);
		
		
		
		
		
	}	

}
