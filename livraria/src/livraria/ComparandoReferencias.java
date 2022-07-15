package livraria;

public class ComparandoReferencias {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigoturini@caelum.combr";
		autor.cpf = "123.456.789.10";

		Autor autor2 = new Autor();
		autor2.nome = "Rodrigo Turini";
		autor2.email = "rodrigoturini@caelum.combr";
		autor2.cpf = "123.456.789.10";

		if (autor == autor2) {
			System.out.println("Iguais,mesmo autor!");
		} else {
			System.out.println("hein!? Por que diferentes?");
		}

	}
}
