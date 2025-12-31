                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       package ifpr.edu.br.pr;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		String metodo;
		double temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual conversão deseja realizar?");
		System.out.println("1 para Kelvin -> Celsiu" + "\n2 para Kelvin -> Farenheit"
				+ "\n3 para Celsiu -> Kelvin" + "\n4 para Celsius -> Farenheit" + "\n5 para Farenheit -> Celsius"
				+ "\n6 para Farenheit -> Kelvin");
		metodo = scanner.next();
		System.out.println("Quantos de temperatura?");
		temp = scanner.nextDouble();
		switch (metodo) {
		case "1" -> System.out.println("Kelvin -> Celsius: C = " + (temp - 273));
		case "2" -> System.out.println("Kelvin -> Farenheit: F = " + ((temp - 273) * 1.8 + 32));
		case "3" -> System.out.println("Celsius -> Kelvin: K =" + (temp + 273));
		case "4" -> System.out.println("Kelvin -> Celsius: F =" + (temp * 1.8 + 32));
		case "5" -> System.out.println("Kelvin -> Celsius: C =" + ((temp - 32) / 1.8));
		case "6" -> System.out.println("Kelvin -> Celsius: K =" + ((temp - 32) * 5 / 9 + 273));

		}
	}
}
