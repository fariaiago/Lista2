package br.uft.edu.lista2.questao1;

public class Voo {
	
	boolean cadeiras[] = new boolean[100];
	String numVoo;
	Data dataVoo;
	
	public Voo(String numVoo, Data dataVoo) {
		this.numVoo = numVoo;
		this.dataVoo = dataVoo;
	}
	
	int proximoLivre() {
		for (int n = 0; n < cadeiras.length; n++) {
			if(cadeiras[n]) {
				return (n + 1);
			}
		}
		return -1;
	}
	
	public boolean verifica(int numCadeira) {
		return cadeiras[numCadeira];
	}
	
	public boolean ocupa(int numCadeira) {
		if (!cadeiras[numCadeira]) {
			return false;
		}
		cadeiras[numCadeira] = false;
		return true;
	}
	
	public int vagas() {
		int soma = 0;
		for (int n = 0; n < cadeiras.length; n++) {
			if(cadeiras[n]) {
				soma++;
			}
		}
		return soma;
	}
	
	public String getVoo() {
		return numVoo;
	}
	
	public Data getData() {
		return dataVoo;
	}
	
	@Override
	public Voo clone() {
		return new Voo(numVoo, dataVoo.clone());
	}
}















