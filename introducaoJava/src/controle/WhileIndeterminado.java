package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String text = "";
	
		while (!text.equalsIgnoreCase("sair")) {
			System.out.print("Voc� diz: ");
			text = entrada.nextLine();
		}
		
		entrada.close();

	}

}
