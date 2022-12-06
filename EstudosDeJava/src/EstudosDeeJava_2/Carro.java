package EstudosDeeJava_2;

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
	
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustiveis_, double consumoCombustiveis_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustiveis = capCombustiveis_;
		consumoCombustiveis = consumoCombustiveis_;
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
