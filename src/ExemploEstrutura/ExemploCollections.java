package ExemploEstrutura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploCollections {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Atletico Mineiro");
		arrayList.add("Mirasol");
		arrayList.add("Novo Horizontino");
		arrayList.add("Ituano Futebol Club");
		
		// Ordenar
		Collections.sort(arrayList);
		
		
		// Desordenar
		Collections.shuffle(arrayList);
		
		
		// imprimindo o resultado
		System.out.println(arrayList);
		

	}

}
