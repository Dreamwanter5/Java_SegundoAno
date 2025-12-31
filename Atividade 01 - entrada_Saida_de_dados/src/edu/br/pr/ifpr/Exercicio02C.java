package edu.br.pr.ifpr;

import javax.swing.JOptionPane;

public class Exercicio02C {
     public static void main(String[] args) {
    	 double n1, n2, n3, n4, resultado;
    	 
    	 n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores do cálculo: x * x + x -x"));
    	 n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores do cálculo: "+n1+" * x + x -x"));
    	 n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores do cálculo: "+n1+" * "+n2+" + x -x"));
    	 n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores do cálculo: "+n1+" * "+n2+" + "+n3+" -x"));
    	 System.out.println(n1+" * "+n2+" + "+n3+" - "+n4);
    	 resultado = n1*n2+n3-n4;
    	 System.out.println("Resultado:"+resultado);
    	 
    	 
    	 
     }
}
