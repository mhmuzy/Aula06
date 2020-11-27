package Hitss.Treinamento.Repository;

import Hitss.Treinamento.Classe.ControleRemoto;
import Hitss.Treinamento.Infra.IControlador;

public class ControleRemotoRepository implements IControlador {

	// Métodos Abstratos
	@Override
	public void ligar(ControleRemoto controleRemoto) {
		controleRemoto.setLigado(true);
	}

	@Override
	public void desligar(ControleRemoto controleRemoto) {
		controleRemoto.setLigado(false);
	}

	@Override
	public void abrirMenu(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado()) {
		System.out.println("---- MENU ----");
		String RespostaLigado = controleRemoto.getLigado()? "Sim" : "Não";
		String RespostaTocando = controleRemoto.getTocando()? "Sim" : "Não";
		System.out.println("Está ligado? " + RespostaLigado);
		System.out.println("Está tocando? " + RespostaTocando);
		System.out.print("Volume: " + controleRemoto.getVolume());
		for (int i = 0; i <= controleRemoto.getVolume(); i+=10) {
			System.out.print("|");
		}
		} else {
			System.out.println("Não consegui abrir menu");
		}
		System.out.println("");
	}

	@Override
	public void fecharMenu(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado()) {
			System.out.println("Fechando Menu...");
		}

	}

	@Override
	public void maisVolume(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado()) {
			controleRemoto.setVolume(controleRemoto.getVolume() + 5);
		} else {
			System.out.println("Impossível aumentar volume");
		}
	}

	@Override
	public void menosVolume(ControleRemoto controleRemoto) {
			if (controleRemoto.getLigado()) {
				controleRemoto.setVolume(controleRemoto.getVolume() - 5);
			} else {
				System.out.println("Impossível diminuir volume");
			}
	}

	@Override
	public void ligarMudo(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado() && controleRemoto.getVolume() > 0) {
			controleRemoto.setVolume(0);
		}
	}

	@Override
	public void desligarMudo(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado() && controleRemoto.getVolume() == 0) {
			controleRemoto.setVolume(50);
		}
	}

	@Override
	public void play(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado() && (!controleRemoto.getTocando())) {
			controleRemoto.setTocando(true);
		} else {
			System.out.println("Não consegui reproduzir");
		}
	}

	@Override
	public void pause(ControleRemoto controleRemoto) {
		if (controleRemoto.getLigado() && controleRemoto.getTocando()) {
			controleRemoto.setTocando(false);
		} else {
			System.out.println("Não consegui pausar");
		}
	}

}
