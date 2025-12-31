package exercicioArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		double a, b, c, d, e;
		ArrayList<Double> lista1 = new ArrayList<>();
		ArrayList<Double> lista2 = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for (int cont = 0; cont < 5; cont++) {
			System.out.println("Diga um número");
			lista1.add(scanner.nextDouble());
		}

		for (int cont = 0; cont < 5; cont++) {
			System.out.println("Diga um número");
			lista2.add(scanner.nextDouble());
		}
		a = (lista1.get(3) + lista2.get(4));
		System.out.println("Soma 1:" + a);

		b = (lista1.get(2) + lista2.get(0));
		System.out.println("Soma 2:" + b);

		c = (lista1.get(0) + lista2.get(2));
		System.out.println("Soma 3:" + c);

		d = (lista1.get(1) + lista2.get(2));
		System.out.println("Soma 4:" + d);

		e = ((lista1.get(0)+lista1.get(1)+lista1.get(2)+lista1.get(3)+lista1.get(4))) + (lista2.get(0)+lista2.get(1)+lista2.get(2)+lista2.get(3)+lista2.get(4));
		System.out.println("Soma 5:" + e);
	}
}
