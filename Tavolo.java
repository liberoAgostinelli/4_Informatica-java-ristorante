package myPkg;

public class Tavolo {

	private static int numeroTavolo = 0;
	private int numeroPosti;
	private double conto;
	private boolean libero;
	
	private Cameriere cameriere;
	
	public Tavolo() {
		numeroTavolo++;
	}
	
	public void setNumeroTavolo(int n) {
		 this.numeroTavolo = n;
	}
	
	public int getNumeroTavolo() {
		return numeroTavolo;
	}


	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	public double getConto() {
		return conto;
	}

	public void setConto(double conto) {
		this.conto = conto;
	}

	public boolean isStato() {
		return libero;
	}

	public void setStato(boolean stato) {
		this.libero = stato;
	}

	public Cameriere getCameriere() {
		return cameriere;
	}

	public void setCameriere(Cameriere cameriere) {
		this.cameriere = cameriere;
	}

	
	
	
}
