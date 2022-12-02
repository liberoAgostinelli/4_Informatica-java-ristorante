package myPkg;

import java.util.List;

public class Cameriere {
	
	private String nome, cognome;
	private List<Tavolo> listaTavoliAssegnati;
	
	public Cameriere() {
		
	}
	
	public Cameriere(String nome, String cogmome) {
		this.nome = nome; this.cognome = cogmome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
}
