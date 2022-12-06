package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA)); // mostrar o array tipo o laço for
		System.out.println(notasAlunoA[0]); // pegar primeira nota
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); // pegar ultima nota
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i]; // somando os Arrays
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length); // média arrays
		
		double totalAlunoB = 0;
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 }; // outra maneira de atribuir valores
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i]; 
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}

}
