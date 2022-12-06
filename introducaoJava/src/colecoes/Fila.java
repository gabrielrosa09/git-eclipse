package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adiconam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!
		
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // filas que tem restrição de tamanho
		fila.add("Carlos"); 
		fila.offer("Daniel"); // um exception
		fila.add("Rafaela"); 
		fila.offer("Gui"); 
		
		System.out.println(fila.peek()); // se tiver ninguem na fila retorna um erro
		System.out.println(fila.element()); // se tiver ninguem dar um erro.
		
		// Poll e Remove -> obtem o proximo elemento
		// e remove da fila.
		
		System.out.println(fila.poll());  // retorna null
		System.out.println(fila.remove()); 
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // Lança uma exceção
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty(); -> se está ou não vazia
		// fila.contains();
	
	}

}
