package exercicioArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int idd, vs=0,vn=0;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> idades = new ArrayList<>(Arrays.asList());

		for (int cont = 0; cont < 10; cont++) {
			
			System.out.println("Informe sua idade.");
			idades.add(scanner.nextInt());

		} 
		
		for (int cont = 0; cont < 10; cont++) 
		{
			if (idades.get(cont)>= 16) {
				vs++;
			} else {
				vn++;
			}
			
		} System.out.println("Pessoas aptas para votar: "+vs+"\nPessoas não aptas para votar: "+vn);
	}
}
