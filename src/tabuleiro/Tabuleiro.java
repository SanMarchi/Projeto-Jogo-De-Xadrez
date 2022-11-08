package tabuleiro;

public class Tabuleiro {
	
	private int linhas, colunas;
	private Peca[][] pecas;
	
	public Tabuleiro() {};
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}
	
	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
	
	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	public int getLinhas() {
		return linhas;
	} 
	
	public int getColunas() {
		return colunas;
	}
	
	public Peca peca(int linha, char coluna) {
		return null;
	}
	
	public Peca peca(Posicao posicao) {
		return null;
	}
	
	public void moverPeca(Peca peca, Posicao posicao) {
		
	}
	
	public void abaterPeca(Posicao posicao) {
		
	}
	
	public boolean posicaoLivre(Posicao posicao) {
		return true;
	}
	
	public boolean posicaoOcupada(Posicao posicao) {
		return false;
	}
	
}
