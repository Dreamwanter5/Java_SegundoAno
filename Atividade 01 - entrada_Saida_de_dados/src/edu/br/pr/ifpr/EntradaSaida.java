package edu.br.pr.ifpr;

import javax.swing.JOptionPane;

public class EntradaSaida {
	public static void main(String[] args) {

		double n1, n2, n3, resultado;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Para a operação matemática 'x/x+x' digite os valores: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Para a operação matemática " + n1 + "x+x' digite os valores: "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Para a operação matemática '" + n1 + "/" + n2 + "+x' digite os valores: "));
		
		
		System.out.println(+n1 + "/" + n2 + "+" + n3);
		resultado = n1/n2+n3;
		System.out.println(resultado);
		
		

		/*
		 * Professor, tive complicações tentando usar JOptionPane, infelizmente não sei
		 * como prosseguir com a resolução do problema, pois não entendo o problema de
		 * importação do Joption pane.
		 */
	}
}