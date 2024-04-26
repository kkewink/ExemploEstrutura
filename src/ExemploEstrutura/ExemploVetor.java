package ExemploEstrutura;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ExemploVetor {

	public static void main(String[] args) {
//		int[] numeros = new int [3];
//		
//		numeros[0] = 2 ;
//		numeros[1] = 4;
//		numeros[2] = 3;
//		
//		for(int i = 0; numeros.length > i; i++) {
//			//numeros[0] => escreve 2
//			//numeros[1] => escreve 4
//			System.out.println(numeros[i]);
//		}
//		
//		int[][] bidimensional = new int[3][3];
//		
//		bidimensional[0][0] = 10;
//		bidimensional[2][2] = 100;
//		
//		System.out.println("Bidimensional");
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.println(bidimensional[i][j]);
//			}
//		}
//		
//		int [][][] terceiradimensao = new int [3][3][3];
//		int [][][][] quartadimensao = new int [3][3][3][3];
//		

		/*
		 * similar as duas coleções vista anteriomente (Vector e ArrayList), a diferença
		 * é que todos os elementos são ligados entre si
		 */

		ArrayList<Integer> listaA = new ArrayList<Integer>();
		listaA.add(11421);
		listaA.add(54756);
		listaA.add(425);
		listaA.add(31);
		listaA.add(67);
		listaA.add(4);
		listaA.add(321);
		listaA.add(8976);
		listaA.add(790);
		listaA.add(24398);
		listaA.add(002);

		System.out.println("----Lista Array----");
		for (int numbs : listaA) {
			System.out.println(numbs);
		}

		int[] listaV = new int[10];

		listaV[0] = 1231;
		listaV[1] = 1;
		listaV[2] = 11;
		listaV[3] = 3545;
		listaV[4] = 843;
		listaV[5] = 99;
		listaV[6] = 326;
		listaV[7] = 651;
		listaV[8] = 765;
		listaV[9] = 31;

		System.out.println("----Lista Vector----");
		for (int numbs : listaV) {
			System.out.println(numbs);
		}

		LinkedList<Integer> listaL = new LinkedList<Integer>();
		listaL.add(123);
		listaL.add(4576);
		listaL.add(54645);
		listaL.add(9);
		listaL.add(8674);
		listaL.add(87);
		listaL.add(666);
		listaL.add(778);
		listaL.add(1238);
		listaL.add(456);

		System.out.println("----Lista Linked----");
		for (int numbs : listaL) {
			System.out.println(numbs);
		}
		
		
		
		
		

	}

}
