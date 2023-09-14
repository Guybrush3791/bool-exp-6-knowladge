# Es1
## Repo
`java-password-generator`

## Todo
- create un nuovo progetto java chiamato `java-password-generator`
- aggiungete una classe `PasswordGenerator` nel package `org.lessons.java.security` che contiene un metodo `main`

Il programma deve fare quanto segue:
salvare in opportune variabili il *nome*, *cognome*, *colore preferito* e *data di nascita* di un utente suddivisa in giorno, mese e anno in numero.
Generare (e stampare a video) una password  concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere `-`

### Esempio
Ho un utente che si chiama `Pinco Pallo`, nato il `12/05/1994`, il cui colore preferito è il `magenta`
La sua password sarà **`Pinco-Pallo-magenta-2011`**

# Es 2
## Repo
`java-biglietto-treno`
 
## Todo
Il programma dovrà chiedere all’utente il *numero di chilometri che vuole percorrere* e l’*età del passeggero*. Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
- il prezzo del biglietto è definito in base ai km (0.21 € al km)
- va applicato uno sconto del 20% per i minorenni
- va applicato uno sconto del 40% per gli over 65

Come sempre create un progetto java con lo stesso nome del repo (`java-biglietto-treno`), aggiungete  una classe `CalcolaBiglietto` nel package `org.lessons.java`. 
Il programma va implementato nel metodo `main` della classe `CalcolaBiglietto`.
Per acquisire l’input dell’utente usate la classe `Scanner`, come visto stamattina a lezione.

---

# Bonus

## Es 3
### Repo
`java-cibi-preferiti`

## Todo
- nel progetto `java-cibi-preferiti` aggiungete la classe `CibiPreferiti` nel package `org.lessons.java.array` col suo metodo `main`
- nel programma inizializzare un array (con i metodi visti a lezione) con la classifica dei vostri cibi preferiti (minimo 5, massimo 10 elementi)

Poi stampate a video:
- la lunghezza della classifica
- il vostro cibo top (prima posizione della classifica)
- il vostro cibo preferito ma non troppo (ultima posizione della classifica)

Stampate a video anche il cibo di mezza classifica, cioè che si trova nella posizione mediana
> [!attention] attenzione agli array di lunghezza pari