package edu.br.pr.ifpr;

import java.util.Scanner;

public class Exercicio02B {
	public static void main(String[] args) {
		double n1, n2, n3, n4, n5, resultado;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Para o cálculo: ((x+x-x)*x)/x, diga os valores:");
		n1 = scanner.nextDouble();
		System.out.println("Para o cálculo: (("+n1+"+X-X)*X)/ X, diga os valores:");
		n2 = scanner.nextDouble();
		System.out.println("Para o cálculo:(("+n1+"+"+n2+"-x)*x)/x, diga os valores:");
		n3 = scanner.nextDouble();
		System.out.println("Para o cálculo:(("+n1+"+"+n2+"-"+n3+")* x)/ x, diga os valores:");
		n4 = scanner.nextDouble();
		System.out.println("Para o cálculo:(("+n1+"+"+n2+"-"+n3+")*"+n4+")/ x, diga os valores:");
		n5 = scanner.nextDouble();
		System.out.println(n1+"+"+n2+"-"+n3+")*"+n4+")/"+n5);
		resultado = ((n1+n2-n3)*n4)/n5;
		System.out.println(resultado);
		
		
		
		
		
		
		
	}
}
