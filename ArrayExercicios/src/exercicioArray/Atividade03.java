package exercicioArray;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Atividade03 {
	public static void main(String[] args) {
		ArrayList<String> uni = new ArrayList<>();
		for (int cont = 0; cont < 10; cont++) {
			uni.add(JOptionPane.showInputDialog("Digite o nome de uma universidade"));
		}
		for (int cont = 0; cont < 10; cont++) {
			System.out.println(cont+". "+uni.get(cont));
		}
}
}