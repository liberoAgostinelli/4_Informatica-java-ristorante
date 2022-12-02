package myPkg;

import java.util.List;

public class Ristorante {
	
	private Tavolo[] listaTavoli;
	public static int MAX_ELEMENTS_TAVOLI = 40;
	private static int contatoreTavoli =0;
	
	private Cameriere[] listaCameriere;
	public static int MAX_ELEMENTS_CAMERIERE = 100;
	private static int contatoreCameriere =0;
	
	public Ristorante() {
		listaTavoli = new Tavolo[MAX_ELEMENTS_TAVOLI];
		listaCameriere = new Cameriere[MAX_ELEMENTS_CAMERIERE];
	}
	
	public void aggiungiTavolo(Tavolo tavolo) {
	
		if(this.contatoreTavoli < MAX_ELEMENTS_TAVOLI)
			listaTavoli[contatoreTavoli++] = tavolo;
	}
	
	public void aggiungiCameriere(Cameriere cameriere) {
		if(this.contatoreCameriere < MAX_ELEMENTS_CAMERIERE)
			listaCameriere[contatoreCameriere++] = cameriere;
	}
	
	public int getMax_ELEMENTS_TAVOLI() {
		return MAX_ELEMENTS_TAVOLI;
	}
	
	public int getMax_ELEMENTS_CAMERIERE() {
		return MAX_ELEMENTS_CAMERIERE;
	}
	
	public Tavolo[] getListaTavoli() {
		return listaTavoli;
	}
	public Cameriere[] getListaCameriere() {
		return listaCameriere;
	}
	
	
	public int getContatoreTavolo() {
		return contatoreTavoli;
	}
	public int getContatoreCameriere() {
		return contatoreCameriere;
	}
}
