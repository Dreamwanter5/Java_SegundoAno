package aula.repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nNum;
		for (int contador = 0; contador < 6; contador++) {
			System.out.println("Informe um número: ");
			nNum = scanner.nextInt();
			if (nNum >= 50 && nNum <= 100) {
				System.out.println(nNum + ", O número esta entre 50 e 100."+"\n");
			} else
				System.out.println(nNum + ",O número não esta entre 50 e 100."+"\n");
		}

	}

}
