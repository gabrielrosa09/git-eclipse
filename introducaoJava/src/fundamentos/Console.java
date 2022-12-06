package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite o sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Nome: " + nome + " " + sobrenome);
		System.out.println("Idade: " + idade);
		
		System.out.printf("%s %s tem %d anos.\n", nome, sobrenome, idade);
		
		entrada.close();
	}	

}

// O nextInt(); e nextDouble(); podem ter problemas de buffer entao, logo apos
// devem ser adicionados um nextLine(); para esse problema não ocorrer.