package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;

public class ComparandoReferencias {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigoturini@caelum.combr");
		autor.setCpf("123.456.789.10");

		Autor autor2 = new Autor();
		autor2.setNome("Rodrigo Turini");
		autor2.setEmail("rodrigoturini@caelum.combr");
		autor2.setCpf("123.456.789.10");

		if (autor == autor2) {
			System.out.println("Iguais,mesmo autor!");
		} else {
			System.out.println("hein!? Por que diferentes?");
		}

	}
}
