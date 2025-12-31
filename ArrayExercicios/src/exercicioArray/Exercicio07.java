package exercicioArray;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio07 {
	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<>();
		int alun = 0, num = 0, opcao = 0;
		String proc;
		alun = Integer.parseInt(JOptionPane.showInputDialog("Quantos Alunos você quer registrar?"));
		for (int cont = 0; cont < alun; cont++) {
			alunos.add(JOptionPane.showInputDialog("Diga o nome do Aluno"));
		}
		while (opcao != 4) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU" + "\n 1 = Ver A lista de alunos"
					+ "\n 2 = Remover Aluno da Lista" + "\n 3 = Procurar aluno" + "\n 4 = Encerrar"));

			if (opcao == 1) {
				System.out.println("------------------------");
				for (int cont = 0; cont < alunos.size(); cont++) {
					System.out.println(cont + ". " + alunos.get(cont));
				}
			}
			
			if (opcao == 2) {
				num = Integer.parseInt(JOptionPane.showInputDialog("Qual aluno você deseja remover da lista?"));
				alunos.remove(num);
				
			}
			
			if (opcao == 3) {
				proc = JOptionPane.showInputDialog("Qual aluno você procura?");
				System.out.println("-----------------------"+"\nO aluno que você procura é: "+alunos.indexOf(proc));
			}
		}

	}
}
