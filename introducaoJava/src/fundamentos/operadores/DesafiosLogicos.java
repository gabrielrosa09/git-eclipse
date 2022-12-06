package fundamentos.operadores;

public class DesafiosLogicos {
	
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// se os dois derem ceerto TV de 50 pol
		// se apenas um dos dois derem ceerto TV de 32 pol
		// se não derem certo vão ficar em casa e sem sorvete
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		
		boolean comprouTV50 = trabalhoTerca && trabalhoQuinta;
		boolean comprouTV32 = trabalhoTerca ^ trabalhoQuinta;
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
		
		System.out.println("Comprou TV 50pol? " + comprouTV50);
		System.out.println("Comprou TV 32pol? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + !comprouSorvete);
		
	}
	
}
