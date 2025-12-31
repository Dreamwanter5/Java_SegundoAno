package aula.Array;

import java.util.ArrayList;

public class CatalogoNEtflix {

	public static void main(String[] args) {

		ArrayList<String> Filmes = new ArrayList<>();
		
		Filmes.add("Hereditário");
		Filmes.add("Pearl");
		Filmes.add("The Lighthouse");
		Filmes.add("The Dead Bride");
		
		//Acessando algum elemento da lista
		
		System.out.println(Filmes.get(2));
		
		//Verificando o tamanho da lista
		
		System.out.println(Filmes.get(3));
		
		//Contar desde o começo da lista pode ser trabalhoso, então, a gente pode usar o seguinte comando:
		System.out.println(Filmes.indexOf("Harry Potter"));
	}

}
