package aula.repeticao;
import java.util.Scanner;
public class Exercicio06Nota {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] nota = new double[7];
		double resultado = 0;
		for (int cont = 1; cont < 7; cont++) {
			System.out.println("Diga sua "+cont+" nota:");
			nota[cont] = scanner.nextDouble();
		}
		for (int cont = 1;cont < 7; cont++) {
			resultado = (resultado + nota[cont]);
		}
			resultado = resultado/6;
			
		System.out.println("Sua média é de "+ resultado+"!");
	}

}
