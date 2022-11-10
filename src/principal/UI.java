package principal;

import xadrez.PecaXadrez;

public class UI {

	public static void mostraTabuleiro(PecaXadrez[][] pecas) {
		for(int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i + " "));
			for(int j = 0; j < pecas.length; j++) {
				mostraPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	public static void mostraPeca(PecaXadrez peca) {
		System.out.print(peca == null ? "-" : peca);
		System.out.print(" ");
	}
}
