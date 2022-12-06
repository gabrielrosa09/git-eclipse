package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89); // construtor
		// p1.nome = "Notebook";
		// p1.preco = 4356.89;
		// p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		
		System.out.printf("Desconto 1: %.2f\nDesconto2: %.2f", precoFinal1, precoFinal2);

	}
}
