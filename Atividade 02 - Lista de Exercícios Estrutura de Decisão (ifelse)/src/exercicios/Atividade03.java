package exercicios;

import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {
		double A, B, C, D, soma1, op2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Diga o valor de A");
		A = scanner.nextDouble();
		System.out.println("Diga o valor de B");
		B = scanner.nextDouble();
		System.out.println("Diga o valor de C");
		C = scanner.nextDouble();
		System.out.println("Diga o valor de D");
		D = scanner.nextDouble();
		soma1 = A + B;
		op2 = C * D;
		
		System.out.println("Valor de A+B: "+soma1);
		System.out.println("Valor de C*D: "+op2);
		System.out.println("-----------------------------------------------------------");
		if (soma1 > op2) {
			System.out.println(soma1 + " é maior do que " + op2);
		} else if (op2 > soma1) {
			System.out.println(op2 + " é maior do que " + soma1);
		} else {
			System.out.println(soma1+" é igual à "+op2);
		}
	}
}
