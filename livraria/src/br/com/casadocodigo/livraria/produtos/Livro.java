package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public  class Livro implements Produto {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	private boolean impresso;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrição() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn(String isbn) {
		return this.isbn = isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Livro() {
		System.out.println("novo livro criado");
	}

	public Livro(Autor autor) {
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";

	}

	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Nome: " + nome);
		System.out.println("Descricao: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);

		if (temAutor()) {
			autor.mostrarDetalhes();
		}

		System.out.println("--");

	}

	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.1) {
			return false;
		}

		this.valor -= this.valor * porcentagem;
		System.out.println("aplicando desconto no Livro");
		return true;
	}

	public boolean temAutor() {
		return this.autor != null;
	}

	public void setImpresso(boolean impresso) {
		this.impresso = impresso;
	}

	public boolean isImpresso() {
		return this.impresso;
	}
	
	
	
}
