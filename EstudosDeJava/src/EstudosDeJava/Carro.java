package EstudosDeJava;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustiveis;
	double consumoCombustiveis;
	
	Carro(){
		System.out.println("Classe Carro foi instanciada!");
		numPassageiros = 4;
	}
	
	void exibirAutonomia () {
		System.out.println("A autonomia do carro é " + capCombustiveis * consumoCombustiveis + "km");
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obter autonomia ativado");
		
		return capCombustiveis * consumoCombustiveis;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustiveis;
		
		return qtdCombustivel;
	}
	
}
