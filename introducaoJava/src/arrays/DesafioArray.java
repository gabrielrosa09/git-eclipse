package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas deseja adicionar?");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d nota: \n", i + 1);
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		
		double somaNotas = 0;
		
		for (double nota: notas) {
			somaNotas += nota;
		}
		
		System.out.println("Média Notas: " + somaNotas / notas.length);
		

		entrada.close();
		
	}

}
