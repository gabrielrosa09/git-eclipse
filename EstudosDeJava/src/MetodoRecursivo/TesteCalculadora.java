package MetodoRecursivo;
import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = ler.nextInt();
		
		int fatorialR = Calculadora.fatorial(num);
		System.out.print(fatorialR);
	}

}
