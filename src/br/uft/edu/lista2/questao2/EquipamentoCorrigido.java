package br.uft.edu.lista2.questao2;

public class EquipamentoCorrigido extends Equipamento {
	private int mesCompra[];
	private int mesCorrente;

	public EquipamentoCorrigido(int numeroEquipamentos, int mesCorrente) {
		super(numeroEquipamentos);
		this.mesCompra = new int[numeroEquipamentos];
		this.mesCorrente = mesCorrente;
	}

	public int getMesCompra(int numero) {
		return this.mesCompra[numero];
	}

	public void setMesCompra(int numero, int mes) {
		this.mesCompra[numero] = mes;
	}

	public void corrige(int percentual) {
		for (int i = 0; i < mesCompra.length; i++) {
			if (this.mesCompra[i] == this.mesCorrente) {
				this.setValor(i, this.getValor(i) * percentual);
			}
		}
		this.mesCorrente++;
		if (this.mesCorrente > 11) {
			this.mesCorrente = 0;
		}
	}

	public void substitui(EquipamentoCorrigido outro) {
		if (this.getNumeroEquipamentos() == outro.getNumeroEquipamentos()) {
			for (int i = 0; i < mesCompra.length; i++) {
				this.setValor(i, outro.getValor(i));
				this.setMesCompra(i, outro.getMesCompra(i));
			}
		}
	}
}
