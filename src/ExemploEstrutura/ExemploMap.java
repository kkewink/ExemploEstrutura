package ExemploEstrutura;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "São paulo");
		map.put(2, "Palmeiras");
		map.put(343, "Corinthians");

		map.forEach((key, valor) -> {
			System.out.println("Posicao no Rankiong: " + key);
			System.out.println("Nome: " + valor);
		});

		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("Key: " + entry.getKey() + " Nome: " + entry.getValue());
		}

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		}
		map.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		});

		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(133, "Corinthians");
		table.put(116, "São Paulo");
		table.put(116, "Palmeiras");

		Enumeration<Integer> keys = table.keys();
		while (keys.hasMoreElements()) {
			int key = keys.nextElement();
			String value = table.get(key);
			System.out.println(key + " = " + value);
		}

		for (Map.Entry<Integer, String> entry : table.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		map.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + " ==============" + "= " + entry.getValue());
		});
		
		
		LinkedHashMap<Integer, String > maplink = new LinkedHashMap();
		

		
		TreeMap<Integer, String> treemap = new TreeMap();
		
		treemap.put(1, " um");
		treemap.put(2, " dois");
		treemap.put(3, " tres");
	}

}
