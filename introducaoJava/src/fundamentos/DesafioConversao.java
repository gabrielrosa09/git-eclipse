package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String sal1, sal2, sal3;
		
		System.out.println("Digite seu primeiro salario: ");
		sal1 = entrada.nextLine().replace(",",".");
		System.out.println("Digite seu segundo salario: ");
		sal2 = entrada.nextLine().replace(",",".");;
		System.out.println("Digite seu terceiro salario: ");
		sal3 = entrada.nextLine().replace(",",".");;
		
		double salario1 = Double.parseDouble(sal1);
		double salario2 = Double.parseDouble(sal2);
		double salario3 = Double.parseDouble(sal3);
		
		double media = (salario1 + salario2 + salario3) / 3; 
		System.out.println(media);
		
		entrada.close();
		
	}

}
