package aula.revisão;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio02 {
	public static void main(String[] args) {
		String senha;
		String usuario;
		
		Scanner scanner = new Scanner(System.in);
		usuario = JOptionPane.showInputDialog ("Usuário: ");
		senha = JOptionPane.showInputDialog("Senha: ");
		
		if (usuario.equals("user") && senha.equals("admin")) {
			System.out.println("Acesso permitido");
		} 
	}
}
