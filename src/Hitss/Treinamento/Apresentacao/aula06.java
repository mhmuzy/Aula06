package Hitss.Treinamento.Apresentacao;

import Hitss.Treinamento.Classe.ControleRemoto;
import Hitss.Treinamento.Repository.ControleRemotoRepository;

public class aula06 {

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		ControleRemotoRepository cr = new ControleRemotoRepository();
		//cr.ligar(c);
		cr.maisVolume(c);
		cr.play(c);
		cr.abrirMenu(c);
		cr.fecharMenu(c);
	}
}
