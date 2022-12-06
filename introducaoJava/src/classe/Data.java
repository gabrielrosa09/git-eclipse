package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data () {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
	}
	
	Data (int dia, int mes, int ano) {
		this.dia = dia; // this -> referenciar um objeto atual e
		this.mes = mes; // para resolver conflitos de nomes
		this.ano = ano;
	}
	
	String obterDataFormatada (){ // USAR SEMPRE ESSA AQUI!
		final String formato = "%d/%d/%d"; // Variável local
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada(){ // Essa só será usada no TERMINAL!
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}
	
}
