package tabuleiro;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca() {};
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	public void movimentosPossiveis() {
		
	}
	
	public boolean movimentoPossivel(Posicao posicao) {
		return true;
	}
	
	public boolean movimentoPadrao() {
		return false;
	}
	
}
