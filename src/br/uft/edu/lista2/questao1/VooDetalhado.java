package br.uft.edu.lista2.questao1;

public class VooDetalhado extends Voo {
	int numAcentos;
	int numAcentosFumantes;
	public VooDetalhado(String numVoo, Data dataVoo, int numAcentos, int numAcentosFumantes) {
		super(numVoo, dataVoo);
		this.numAcentos = numAcentos;
		this.numAcentosFumantes = numAcentosFumantes;
		this.cadeiras = new boolean[numAcentos + numAcentosFumantes];
	}

	public int maxVagas() {
		return this.numAcentos + this.numAcentosFumantes;
	}

	public int cadeirasFumantes() {
		return this.numAcentosFumantes;
	}

	public String tipo(int numeroCadeira) {
		return numeroCadeira > this.numAcentos ? "F" : "N";
	}
}