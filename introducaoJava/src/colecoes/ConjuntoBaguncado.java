package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); 
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é: " + conjunto.size()); // Qtd de elementos no set
		
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste")); // Remover elementos do set
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.contains("Teste")); // Se contém tal palavra no set
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums); // União entre dois conjuntos
		conjunto.retainAll(nums); // Interseçao entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}
