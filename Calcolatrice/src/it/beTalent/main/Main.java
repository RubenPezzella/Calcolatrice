package it.beTalent.main;

import it.beTalent.calcolatrice.Calcolatrice;

public class Main {

	public static void main(String[] args) {

		Calcolatrice calc = new Calcolatrice();
		int a = 5;
		int b = 6;
		int c = 7;

		int somma = calc.somma(a, b, c);
		System.out.println("La somma dei numeri è: " + somma);

		int prodotto = calc.moltiplica(a, b, c);
		System.out.println("Il prodotto dei numeri è: " + prodotto);
	}
}
