package livraria;

public class CadastroDeLivros {

	public static void main(String[] args) {

		Livro livroComDesconto = new Livro();
		livroComDesconto.valor = 59.90;

		System.out.println("Valor atual:  " + livroComDesconto.valor);

		livroComDesconto.valor -= livroComDesconto.valor * 0.1;

		System.out.println("Valor com desconto:   " + livroComDesconto.valor);

		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789.10";

		Livro livro = new Livro();
		livro.nome = "Java 8 Prático";
		livro.descricao = "Novos recursos da linguagem";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6";

		livro.autor = autor;

		livro.mostrarDetalhes();

		Autor outroAutor = new Autor();
		outroAutor.nome = "Paulo Silveira";
		outroAutor.email = "paulo.silveira@caelum.com.br";
		outroAutor.cpf = "123.456.789.10";

		Livro outroLivro = new Livro();
		outroLivro.nome = "Lógica de Programação";
		outroLivro.descricao = "Crie seus primeiros programas";
		outroLivro.valor = 59.90;
		outroLivro.isbn = "978-85-66250-22-0";

		outroLivro.autor = outroAutor;

		outroLivro.mostrarDetalhes();

		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		Livro livro4 = new Livro();

	}
}
