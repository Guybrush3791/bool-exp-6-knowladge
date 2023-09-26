package org.java.eventi.manager;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.java.eventi.Concerto;
import org.java.eventi.Evento;
import org.java.eventi.Spettacolo;
import org.java.eventi.helper.DateTimeHelper;
import org.java.eventi.inter.Prezzabile;

public class ProgrammEventi {

	private String titolo;
	private List<Evento> eventi;
	public ProgrammEventi(String title) {

		setTitolo(title);
		setEventi(new ArrayList<>());
	}

	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public List<Evento> getEventi() {
		return eventi;
	}
	private void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}

	public void addEvento(Evento evento) {

		eventi.add(evento);
	}
	public List<Evento> getEventiByDate(LocalDate date) {

		return getEventi().stream()
					.filter(e -> e.getData().isEqual(date))
				.toList();

//		List<Evento> eventiByDate = new ArrayList<>();
//		for (int x=0;x<getEventi().size();x++) {
//
//			Evento e = getEventi().get(x);
//
//			if (e.getData().isEqual(date))
//				eventiByDate.add(e);
//		}
//
//		return eventiByDate;
	}
	public List<Evento> getEventiByDate(String date) {

		return getEventiByDate(LocalDate.parse(date, DateTimeHelper.DATE_FORMATTER));
	}
	public int getNumeroEventi() {

		return (int) getEventi().stream().count();

//		return getEventi().size();
	}
	public void svuotaEventi() {

		getEventi().clear();
	}

	public BigDecimal mediaPrezzoConcerto() {

		int elemCount = 0;
		BigDecimal avg = new BigDecimal(0);

		for (Evento e : getEventi()) {

			if (e instanceof Concerto) {

				elemCount++;
				avg = avg.add(((Concerto) e).getPrezzo());
			}
		}

		return avg.divide(new BigDecimal(elemCount));
	}
	public BigDecimal mediaPrezzoSpettacolo() {

		int elemCount = 0;
		BigDecimal avg = new BigDecimal(0);

		for (Evento e : getEventi()) {

			if (e instanceof Spettacolo) {

				elemCount++;
				avg = avg.add(((Spettacolo) e).getPrezzo());
			}
		}

		return avg.divide(new BigDecimal(elemCount));
	}
	public BigDecimal mediaPrezzoEvento() {

		int elemCount = 0;
		BigDecimal avg = new BigDecimal(0);

		for (Evento e : getEventi()) {

			if (e instanceof Concerto || e instanceof Spettacolo) {

				elemCount++;
				avg = avg.add(((Prezzabile) e).getPrezzo());
			}
		}

		return avg.divide(new BigDecimal(elemCount));
	}

	@Override
	public String toString() {

		return getEventi().stream()
					.sorted((e1, e2) -> e1.getData().compareTo(e2.getData()))
					.map(e -> e.getFormattedData() + " - " + e.getTitolo())
				.collect(Collectors.joining("\n"))
		;

//		List<Evento> eventiOrdinati = new ArrayList<>(getEventi());
//
//		eventiOrdinati.sort((e1, e2) -> e1.getData().compareTo(e2.getData()));
//
//		String res = "";
//		for (Evento e : eventiOrdinati)
//			res += e.getFormattedData() + " - " + e.getTitolo() + "\n";
//
//		return res;
	}
}
