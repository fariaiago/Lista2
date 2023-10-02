package br.uft.edu.lista2.questao2;

public class Equipamento {
	private int valor[];

	public Equipamento(int numeroEquipamentos) {
		valor = new int[numeroEquipamentos];
	}

	public int getNumeroEquipamentos() {
		return this.valor.length;
	}

	public int getValor(int numero) {
		return this.valor[numero];
	}

	public void setValor(int numero, int valor) {
		this.valor[numero] = valor;
	}
}
