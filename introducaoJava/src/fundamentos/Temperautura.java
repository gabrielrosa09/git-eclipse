package fundamentos;

public class Temperautura {

	public static void main(String[] args) {
		
		final double FATOR = 5.0/9.0;
		final int AJUSTE = 32;
		
		double fahrenheit = 79;
		double celcius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("A temperatura em °C é: " + celcius);
		
		fahrenheit = 0;
		celcius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("A temperatura em °C é: " + celcius);
		
	}

}
