package exercicios;

import java.util.Scanner;

public class Atividade07 {
	public static void main(String[] args) {
		double peso, altura, imc;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe seu peso");
		peso = scanner.nextDouble();
		System.out.println("Informe sua altura");
		altura = scanner.nextDouble();
		imc = peso/(altura*altura);
		System.out.println("Seu indice de massa corporal é: "+ imc);
		if (imc <= 18.4) {
			System.out.println("Você está abaixo do peso");
			} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Seu peso está normal.");
				} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Você está em sobrepeso.");
			}	else if (imc >= 30 && imc <= 34.9) {
				System.out.println("Você está com grau 1 em obesidade.");
				} else if (imc >= 35 && imc <= 39.9) {
					System.out.println("Você está com grau 2 em obesidade.");
				} else {
					System.out.println("Você está com grau 3 em obesidade.");
				} 
	}
	}
