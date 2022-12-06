package EstudosDeJava;

public class TesteCarro {

	public static void main(String[] args) {
		 Carro van = new Carro();
		 van.marca = "Fiat";
		 van.modelo = "Ducato";
		 // van.numPassageiros = 10;
		 van.capCombustiveis = 100;
		 van.consumoCombustiveis = 0.2;
		 
		 System.out.println(van.marca);
		 System.out.println(van.numPassageiros);
		 
		 van.exibirAutonomia();  // void exibirAutonomia VAN
		 double autonomiaVan = van.obterAutonomia(); // function obterAutonomia VAN
		 System.out.println("A autonomia do carro é: " + autonomiaVan);
		 
		 double qtdCombustivel10 = van.calcularCombustivel(10);
		 double qtdCombustivel15 = van.calcularCombustivel(15);
		 System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		 System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
		 
		 /*
		 Carro fusca = new Carro();
		 fusca.marca = "Volkswagen";
		 fusca.modelo = "Fusca";
		 fusca.numPassageiros = 4;
		 fusca.capCombustiveis = 30;
		 fusca.consumoCombustiveis = 0.15;
		 
		 System.out.println(fusca.marca);
		 System.out.println(fusca.modelo);
		 
		 fusca.exibirAutonomia(); // void exibirAutonomia FUSCA
		 double autonomiaFusca = fusca.obterAutonomia(); // function obterAutonomia FUSCA
		 System.out.println("A autonomia do carro é: " + autonomiaFusca);
		 */

	}

}
