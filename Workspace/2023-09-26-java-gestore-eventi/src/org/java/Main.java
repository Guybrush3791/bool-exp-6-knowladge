package org.java;

import java.math.BigDecimal;
import java.util.Scanner;

import org.java.eventi.Concerto;
import org.java.eventi.Evento;
import org.java.eventi.Spettacolo;
import org.java.eventi.manager.ProgrammEventi;

public class Main {

	public static void main(String[] args) {

		Scanner sc = null;

		try {

			Evento e1 = new Evento("mio titolo 1", "29/09/2023", 100);
			Evento e2 = new Evento("mio titolo 2", "29/09/2023", 100);
			Evento e3 = new Evento("mio titolo 3", "30/09/2023", 100);

			Concerto c1 = new Concerto("mio concerto 1", "29/09/2023", 100, "21:00", new BigDecimal(35));
			Concerto c2 = new Concerto("mio concerto 2", "30/09/2023", 100, "21:00", new BigDecimal(50));

			Spettacolo s1 = new Spettacolo("mio spettacolo 1", "29/09/2023", 100, new BigDecimal(40));
			Spettacolo s2 = new Spettacolo("mio spettacolo 2", "30/09/2023", 100, new BigDecimal(70.5));

			ProgrammEventi pe = new ProgrammEventi("Titolo serie");

			pe.addEvento(e1);
			pe.addEvento(e3);
			pe.addEvento(e2);

			pe.addEvento(c1);
			pe.addEvento(c2);

			pe.addEvento(s1);
			pe.addEvento(s2);

			System.out.println(pe);

			System.out.println("Media prezzo concerto: " + pe.mediaPrezzoConcerto());
			System.out.println("Media prezzo spettacolo: " + pe.mediaPrezzoSpettacolo());
			System.out.println("Media prezzo eventi: " + pe.mediaPrezzoEvento());

//			System.out.println("Numero eventi: " + pe.getNumeroEventi());

//			List<Evento> eventi29 = pe.getEventiByDate("29/09/2023");
//			System.out.println(eventi29);

//			Concerto c1 = new Concerto(
//					"mio titolo", "29/09/2023", 100,
//					LocalTime.parse("21:00"), new BigDecimal(35)
//			);
//
//			System.out.println(c1);
//			System.out.println("\n----------------------------------------------\n");
//
//			System.out.println("Prezzo: " + c1.getFormattedPrezzo());

//			sc = new Scanner(System.in);
//
//			System.out.println("Nuovo evento:");
//
//			System.out.print("titolo: ");
//			String title = sc.nextLine();
//
//			System.out.print("date: ");
//			String date = sc.nextLine();
//
//			System.out.print("numero posti totali: ");
//			int numeroPosti = Integer.valueOf(sc.nextLine());
//
//			Evento e1 = new Evento(title, date, numeroPosti);
//
//			System.out.println(e1);
//			System.out.println("\n----------------------------------------------\n");
//
//			System.out.print("prenotazioni da effettuare: ");
//			int prenotazioniDaEffettuare = Integer.valueOf(sc.nextLine());
//
//			for (int x=0;x<prenotazioniDaEffettuare;x++)
//				e1.prenota();
//
//			System.out.println("Posti totali: " + e1.getPostiTotali());
//			System.out.println("Posti prenotati: " + e1.getPostiPrenotati());
//			System.out.println("\n----------------------------------------------\n");
//
//			System.out.print("disdette da effettuare: ");
//			int disdetteDaEffettuare = Integer.valueOf(sc.nextLine());
//
//			for (int x=0;x<disdetteDaEffettuare;x++)
//				e1.disdici();
//
//			System.out.println("Posti totali: " + e1.getPostiTotali());
//			System.out.println("Posti prenotati: " + e1.getPostiPrenotati());
//			System.out.println("\n----------------------------------------------\n");

//			Evento e1 = new Evento("Mio evento", "2023-09-29", 100);
//			System.out.println(e1);
//			System.out.println("\n----------------------------------------------\n");
//
//			System.out.println("Posti totali: " + e1.getPostiTotali());
//			System.out.println("Posti prenotati: " + e1.getPostiPrenotati());
//			System.out.println("\n----------------------------------------------\n");
//
//			e1.prenota();
//
//			System.out.println("Posti totali: " + e1.getPostiTotali());
//			System.out.println("Posti prenotati: " + e1.getPostiPrenotati());
//			System.out.println("\n----------------------------------------------\n");
//
//			e1.disdici();
//
//			System.out.println("Posti totali: " + e1.getPostiTotali());
//			System.out.println("Posti prenotati: " + e1.getPostiPrenotati());
//			System.out.println("\n----------------------------------------------\n");
//
//			e1.disdici();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {

			if (sc != null)
				sc.close();
		}
	}
}
