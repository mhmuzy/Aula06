package Hitss.Treinamento.Classe;

public class ControleRemoto {
	/// *** Declaração da Classe Controle Remoto
	// Atributos
	private int volume;
	/// *** Atributo Volume 
	private boolean ligado;
	/// *** Atributo Ligado
	private boolean tocando;
	/// *** Atributo Tocando
	//Métodos Especiais
	
	public ControleRemoto() {
		/// *** Declaração do Método Construtor
		 this.volume = 50;
		 /// *** Atributo Volume Recebe 50
		 this.ligado = true;
		 this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	
}
