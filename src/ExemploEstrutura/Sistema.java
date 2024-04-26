package ExemploEstrutura;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Sistema {

	public static void main(String[] args) {
		System.out.println(new String("Pedro") == new String("Pedro"));// Imprime false

		System.out.println(new String("Pedro").equals(new String("Pedro")));// Imprime true

		String palavra = "123";

		String numero = "000";

		System.out.println(palavra.hashCode());
		System.out.println(numero.hashCode());

		HashSet<String> set = new HashSet<>();
		// set.add adicona

		set.add("1");

		System.out.println("Elementos no HashSet");
		for (String veiculo : set) {
			System.out.println(veiculo);
		}

		Iterator<String> iterator = set.iterator();

		LinkedHashSet<String> lkHash = new LinkedHashSet<String>();
		Iterator<String> iteratorLkHash = lkHash.iterator();

		Set<String> setMap = new TreeSet<String>();
		Iterator<String> setMapIterator = setMap.iterator();

		System.out.println("Listarndo elementos");
		while (iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}

		// LinkedHashSet não aceita duplicatas
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

		
		
		LinkedHashSet<Integer> linkednumbs = new LinkedHashSet<>();
		HashSet<Integer> numbs = new HashSet<>();

		for (int i = 0; i < 20; i++) {
			numbs.add(i);
			linkednumbs.add(i);
		}
		System.out.println("Numeros HashSet");
		for (int numeros : numbs) {

			System.out.println(numeros);
		}
		System.out.println("Numeros Linked");
		for (int oNumeros : linkednumbs) {
			System.out.println(oNumeros);
		}
	}

}
