package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		double total = 0, media = 0, contNotas = 0;
		
		while (nota != -1) {
			System.out.println("Digite a nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10) {
				total += nota;
				contNotas++;
			}
			while (nota < -1 || nota > 10) {
				if (nota < -1 || nota > 10) {
					System.out.println("Nota Inválida!");
					nota = entrada.nextDouble();
					total += nota;
					contNotas++;
				}
			}
			media = total / contNotas;
		}
		
		System.out.println("Média do Aluno: " + media);

		entrada.close();
		
	}

}
