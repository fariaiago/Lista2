package br.uft.edu.lista2.questao1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Data {
	LocalDate data;
	public Data(int dia, int mes, int ano) {
		try {
			this.data = LocalDate.of(ano, mes, dia);
		} catch (DateTimeException e) {
			this.data = LocalDate.of(0001, 01, 01);
		}
	}
	
	public int compara(Data outra) {
		int resultado = outra.data.compareTo(this.data);
		return resultado < 0 ? -1 : resultado > 0 ? 1 : 0;
	}
	
	public int getDia() {
		return this.data.getDayOfMonth();
	}
	
	public int getMes() {
		return this.data.getMonthValue();
	}
	
	public String getMesExtenso() {
		return this.data.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
	}
	
	public int getAno() {
		return this.data.getYear();
	}
	
	public boolean isBissexto() {
		return this.data.isLeapYear();
	}
	
	@Override
	public Data clone() {
		return new Data(this.getDia(), this.getMes(), this.getAno());
	}
}