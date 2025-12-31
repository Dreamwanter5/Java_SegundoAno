package edu.br.pr.ifpr;

import java.util.Scanner;

public class Exercicio02A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n1, n2, n3, resultado;
		System.out.println("Para a operação matemática 'x / x + x' digite os valores: ");
		n1 = scanner.nextDouble();
		System.out.println("Para a operação matemática " + n1 + "x + x' digite os valores: ");
		n2 = scanner.nextDouble();
		System.out.println("Para a operação matemática"+n1+" / "+n2+" + x' digite os valores: ");
		n3 = scanner.nextDouble();
		
		resultado = n1/n2+n3;
		System.out.println(n1+"/"+n2+"+"+n3);
		System.out.println(resultado);
		
		
	}
	

}
