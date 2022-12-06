package desafioComida;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Gabriel", 52);
		
		System.out.printf(p1.apresentarPessoa());
	
		Comida c1 = new Comida("Arroz", 0.3);
		
		Comida c2 = new Comida("Feijão", 0.5);
		
		System.out.printf("Peso da Pessoa após comer: %.2f", p1.comerComida(c1.pesoComida, c2.pesoComida));
	
		
	}

}
