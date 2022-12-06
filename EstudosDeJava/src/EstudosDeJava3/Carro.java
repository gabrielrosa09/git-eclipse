package EstudosDeJava3;

public class Carro {
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustiveis;
	private double consumoCombustiveis;
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustiveis, double consumoCombustiveis) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustiveis = capCombustiveis;
		this.consumoCombustiveis = consumoCombustiveis;
	}
	
	public Carro() {
		
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public double getCapCombustiveis() {
		return capCombustiveis;
	}

	public void setCapCombustiveis(double capCombustiveis) {
		this.capCombustiveis = capCombustiveis;
	}

	public double getConsumoCombustiveis() {
		return consumoCombustiveis;
	}

	public void setConsumoCombustiveis(double consumoCombustiveis) {
		this.consumoCombustiveis = consumoCombustiveis;
	}

	void exibirAutonomia () {
		System.out.println("A autonomia do carro é " + this.capCombustiveis * this.consumoCombustiveis + "km");
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obter autonomia ativado");
		
		return this.capCombustiveis * this.consumoCombustiveis;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/this.consumoCombustiveis;
		
		return qtdCombustivel;
	}
}
