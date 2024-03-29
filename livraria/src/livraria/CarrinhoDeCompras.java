package livraria;

import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.Produto;
import br.com.casadocodigo.livraria.produtos.Revista;

public class CarrinhoDeCompras {
	private double total;

	public void adiciona(Livro livro) {
		System.out.println("Adicionando:  " + livro);
		livro.aplicaDescontoDe(0.05);
		total += livro.getValor();

	}

	public void adiciona(Revista revista) {
		System.out.println("Adicionando:   " + revista);
		revista.aplicaDescontoDe(0.05);
		total += revista.getValor();
	}

	public void adiciona(Produto produto) {
		System.out.println("Adicionando:   " + produto);
		total += produto.getValor();

	}

	public double getTotal() {
		return total;
	}
}
