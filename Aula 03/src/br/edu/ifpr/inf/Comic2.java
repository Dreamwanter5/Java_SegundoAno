package br.edu.ifpr.inf;

import javax.swing.JOptionPane;

public class Comic2 {
	
	public static void main(String[] args) {
		String nomeQuadrinho;
		String generoQuadrinho;
		double preco;
		int quantidade;
		//JoptionPane é literalmente o Scanner só que melhor/mais bonito
		nomeQuadrinho = JOptionPane.showInputDialog ("Informe o nome do quadrinho: ");
		quantidade = Integer.parseInt(JOptionPane.showInputDialog ("Informe a quantidade de quadrinhos: ")); 
		//Usando um componente gráfico de texto, é necessario que haja uma conversão.
		//POr isso deve ser usado o Integer para poder converter
	}
}
