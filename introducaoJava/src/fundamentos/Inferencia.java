package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto"; // quando declarar já deve ser inicializada
		System.out.println(c);
		
		c = "OutroTexto";
		System.out.println(c);
		
		long pontosAcumulados = 3_134_845_223L;
		System.out.println(pontosAcumulados);
		
		float salario = 11_445.44F;
		System.out.println(salario);
		
		boolean estaDeFerias = false;
		System.out.println(estaDeFerias);
	}

}

// 	Tipos Primitivos: Byte (1) Short (2) Int (4) Long (8) -> inteiros
// 	Byte -128 até + 127
// 	Short -32.767 até +32.767
//	Float (4) e Double (8) = numeros reais
// 	Char (delimitado por aspas simples 'a') e Boolean (True or False)