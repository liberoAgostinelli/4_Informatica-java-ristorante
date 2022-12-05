package myPkg;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Ristorante ristorante = new Ristorante(); // Creazione Ristorante

		Menu menu = new Menu();					  // Creazione Classe Menu
		Scanner scanner = new Scanner(System.in); // Creazione classe Scanner per l'input  dell'Utente

		int contatoreCamerieri = 0;


		int scelta = 0;
		do {
			menu.ShowTitle();
			menu.showMenu();
			System.out.print("Scegli-> ");
			scelta = scanner.nextInt(); 

			if(scelta == 1) {

				Cameriere c = new Cameriere();
				System.out.println("\n*** Crea Cameriere ***\n");
				System.out.print("Inserisci nome-> "); c.setNome(scanner.next());
				System.out.print("Inserisci cognome-> "); c.setCognome(scanner.next());
				ristorante.aggiungiCameriere(c);   
			}
			if(scelta == 2) { 

				System.out.println("\n*** Crea Tavolo ***\n");
				Tavolo t = new Tavolo();
				System.out.println("Tavolo N." + t.getNumeroTavolo());
				System.out.print("Inserisci Numero Posti -> ");
				t.setNumeroPosti(scanner.nextInt());
				t.setConto(0);
				t.setStato(true);
				ristorante.aggiungiTavolo(t);


			}

			if(scelta == 3) {
				System.out.println("\n*** LISTA CAMERIERI ***\n");
				Cameriere[] cameriere = ristorante.getListaCameriere();

				for(int i =0; i<ristorante.getContatoreCameriere(); i++) {
					System.out.println("Cameriere N." + i);
					System.out.println("Nome: " + cameriere[i].getNome());
					System.out.println("Cognome: " + cameriere[i].getCognome() + "\n");
				}
			}

			if(scelta == 4) {
				System.out.println("\n*** LISTA TAVOLI ***\n");
				Tavolo[] tavolo = ristorante.getListaTavoli();

				for(int i = 0; i<ristorante.getContatoreTavolo(); i++) {
					System.out.println("Tavolo N." + tavolo[i].getNumeroTavolo());
					System.out.println("Numero Posti: " + tavolo[i].getNumeroPosti());
					System.out.println("E libero?: " + tavolo[i].isStato());
					System.out.println("Conto: " + tavolo[i].getConto());
					if(tavolo[i].getCameriere() != null) {
						System.out.println("Cameriere Assegnato: " + tavolo[i].getCameriere().toString() + "\n");
					}else System.out.println("Cameriere Assegnato: " + tavolo[i].getCameriere() + "\n");
				}

			}

			if(scelta == 5) {
				System.out.println("\n*** ASSEGNA CAMERIERI AI TAVOLI ***\n");
				Scanner scanner2 = new Scanner(System.in);
				
				System.out.println("\n*** LISTA CAMERIERI ***\n");
				Cameriere[] cameriere = ristorante.getListaCameriere();

				for(int i =0; i<ristorante.getContatoreCameriere(); i++) {
					System.out.println("Cameriere N." + i);
					System.out.println("Nome: " + cameriere[i].getNome());
					System.out.println("Cognome: " + cameriere[i].getCognome() + "\n");
				}
				
				System.out.println("\n*** LISTA TAVOLI ***\n");
				Tavolo[] tavolo = ristorante.getListaTavoli();

				for(int i = 0; i<ristorante.getContatoreTavolo(); i++) {
					System.out.println("Numero Tavolo: " + tavolo[i].getNumeroTavolo());
					System.out.println("Numero Posti: " + tavolo[i].getNumeroPosti());
					System.out.println("E libero?: " + tavolo[i].isStato());
					System.out.println("Conto: " + tavolo[i].getConto());
					if(tavolo[i].getCameriere() != null) {
						System.out.println("Cameriere Assegnato: " + tavolo[i].getCameriere().toString() + "\n");
					}else System.out.println("Cameriere Assegnato: " + tavolo[i].getCameriere() + "\n");
				}
				
				for(int i = 0; i<ristorante.getContatoreTavolo(); i++) {
					int s;
					System.out.println("\n**************ASSEGNA***************\n");
					if(tavolo[i].getCameriere() != null) continue;
					System.out.println("Tavolo N." + tavolo[i].getNumeroTavolo());
					do {
						System.out.print("Inserisci Numero Cameriere-> ");
						s = scanner2.nextInt();
						if(s < 0 || s > ristorante.getContatoreCameriere())
							System.out.println("Errore devi digitare un numero compreso tra: 0-" + (ristorante.getContatoreCameriere()-1));
					}while(s < 0 || s > ristorante.getContatoreCameriere());
					
					tavolo[i].setCameriere(cameriere[s]);
				}
				
			}
		}while(scelta != 9);

	}

}
