package EstudosDeJava3;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro("Fiat", "Ducato", 10, 100, 0.2);
		van.setMarca("Fiat");
		System.out.println(van.getMarca());
		van.setModelo("Ducato");
		System.out.println(van.getModelo());
		van.setNumPassageiros(10);
		System.out.println(van.getNumPassageiros());
		van.setCapCombustiveis(100);
		System.out.println(van.getCapCombustiveis());
		van.setConsumoCombustiveis(0.2);
		System.out.println(van.getConsumoCombustiveis());

	}

}
