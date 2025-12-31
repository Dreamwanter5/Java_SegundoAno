package aula.repeticao;
import java.util.Scanner;
public class Exercicio07Pessoas {

	public static void main(String[] args) {
		double[] altHomens = new double[20];
		double mediaAltHomens=0;
		double[] altMulher= new double[20];
		double mediaAltMulher=0;
		double[] pesoHomens = new double[20];
		double mediaPesoHomens=0;
		double[] pesoMulher = new double[20];
		double mediaPesoMulher = 0;
		double[] iddHomens= new double[20];
		double mediaIddHomens=0;
		double[] iddMulher = new double[20];
		double mediaiddMulher=0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int cont = 1;cont < 20; cont++) {
			System.out.println("Homem, diga sua altura:");
			altHomens[cont] = scanner.nextDouble();
			System.out.println("Homem, diga seu peso:");
			pesoHomens[cont] = scanner.nextDouble();
			System.out.println("Homem, diga sua idade:");
			iddHomens[cont] = scanner.nextDouble();
			
			System.out.println("Mulher, diga sua altura:");
			altMulher[cont] = scanner.nextDouble();
			System.out.println("Mulher, diga seu peso:");
			pesoMulher[cont] = scanner.nextDouble();
			System.out.println("Mulher, diga sua idade:");
			iddMulher[cont] = scanner.nextDouble();
			
		}
		for (int cont = 1;cont < 20; cont++) {
			mediaAltHomens = mediaAltHomens + altHomens[cont];
			mediaPesoHomens = mediaPesoHomens + altHomens[cont];
			mediaIddHomens = mediaIddHomens + altHomens[cont];
			mediaAltMulher= mediaAltMulher + altHomens[cont];
			mediaPesoMulher = mediaPesoMulher + altHomens[cont];
			mediaiddMulher = mediaiddMulher + altHomens[cont];
		}
		System.out.println("Media de altura de homens:"+(mediaAltHomens/20));
		System.out.println("Media de peso de homens:"+(mediaPesoHomens/20));
		System.out.println("Media de idade de homens:"+(mediaIddHomens/20));
		System.out.println("Media de altura de mulheres:"+(mediaAltMulher/20));
		System.out.println("Media de peso de mulheres:"+(mediaPesoMulher/20));
		System.out.println("Media de alutra de mulheres:" + (mediaiddMulher / 20));
	}

}
