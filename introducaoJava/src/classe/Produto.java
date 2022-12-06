package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto () {
		// Construtor Padrão
	}
	
	Produto (String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		// Inicialização dos Objetos
	}
	
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto (double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}
	
}
