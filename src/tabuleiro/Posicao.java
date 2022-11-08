package tabuleiro;

public class Posicao {
	
	private int linha;
	private char coluna;
	
	public Posicao() {}
	
	public Posicao(int linha, char coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	public void setColuna(char coluna) {
		this.coluna = coluna;
	}
	
	public int getLinha() {
		return linha;
	}
	
	public int getColuna() {
		return coluna;
	}
	
	public void setMovimento(int linha, char coluna) {
		
	}
	
	@Override
	public String toString() {
		return "Movimento: " + coluna+linha; 
	}
	
}
