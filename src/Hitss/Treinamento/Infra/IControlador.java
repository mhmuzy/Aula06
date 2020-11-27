package Hitss.Treinamento.Infra;

import Hitss.Treinamento.Classe.ControleRemoto;

public interface IControlador {
	public abstract void ligar(ControleRemoto controleRemoto);
	public abstract void desligar(ControleRemoto controleRemoto);
	public abstract void abrirMenu(ControleRemoto controleRemoto);
	public abstract void fecharMenu(ControleRemoto controleRemoto);
	public abstract void maisVolume(ControleRemoto controleRemoto);
	public abstract void menosVolume(ControleRemoto controleRemoto);
	public abstract void ligarMudo(ControleRemoto controleRemoto);
	public abstract void desligarMudo(ControleRemoto controleRemoto);
	public abstract void play(ControleRemoto controleRemoto);
	public abstract void pause(ControleRemoto controleRemoto);
}
