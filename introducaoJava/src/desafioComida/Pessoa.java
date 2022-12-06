package desafioComida;


public class Pessoa {
	
	String nomePessoa;
	double pesoPessoa;
 	
	Pessoa () {
		
	}
	
	Pessoa (String nomePessoa, double pesoPessoa) {
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	double comerComida (double pesoComida) {
		return pesoPessoa + pesoComida;
	}
	
	double comerComida (double pesoComida, double pesoComida2) {
		return pesoPessoa + pesoComida + pesoComida2;
	}
	
	String apresentarPessoa () {
		return "Olá! Eu me chamo " + nomePessoa + "! e tenho " + pesoPessoa + " Kgs.\n";
	}
	
	
}
