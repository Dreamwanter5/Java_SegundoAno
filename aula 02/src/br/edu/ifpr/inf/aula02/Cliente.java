package br.edu.ifpr.inf.aula02;

public class Cliente {

	public static void main(String[] args) {
		String nomeCliente;
		String emailCliente;
		String numeroCliente;
		String cidadeCliente; 
		String cpfCliente;
		String ruaCliente;
		String bairroCliente;
		String paisCliente;
		
		nomeCliente = "David Harvey";
		emailCliente = "David.Harvey02@gmail.com";
		numeroCliente = "+7 43 996877150";
		cpfCliente = "731.644.773-76";
		cidadeCliente = "Gillingham";
		ruaCliente = "Rua Serra de Bragança"
				+ "\n Ronaldo fenomeno"; //Da para você usar "\n" para quebrar as linhas.
		bairroCliente = "Vila Gomes Cardim";
		paisCliente = "São Paulo";
		
		System.out.println("Nome: "+ nomeCliente);
		System.out.println("Email: "+ emailCliente);
		System.out.println("Numero: "+ numeroCliente);
		System.out.println("Cidade: "+ cidadeCliente);
		System.out.println("Rua: "+ ruaCliente);
		System.out.println("Bairro: "+ bairroCliente);
		System.out.println("Pais: "+ paisCliente);
		System.out.println("Numero: "+ numeroCliente);
		System.out.println("CPF: "+ cpfCliente);
		
				
		
	}

}
