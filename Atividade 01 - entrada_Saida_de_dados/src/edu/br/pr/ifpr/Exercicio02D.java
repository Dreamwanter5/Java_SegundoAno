package edu.br.pr.ifpr;

import javax.swing.JOptionPane;

public class Exercicio02D {
	public static void main(String[] args) {
		double n1, n2, n3, n4, resu;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores do cálculo: x / x + x – x"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores do cálculo: "+n1+" / x + x² – x"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores do cálculo: "+n1+" / "+n2+" + x² – x"));
		n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores do cálculo: "+n1+" / "+n2+" + "+n3+"² – x"));
		System.out.println("Digite os valores do cálculo: "+n1+" / "+n2+" + "+n3+"² – "+n4);
		resu = n1/n2+Math.pow(n2,2)-n4;
		System.out.println("O resultado do cálculo é: "+resu);
		
		
		
		
	}
}
