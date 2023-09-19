## Repo
`java-exceptions-books`

## Todo
Vogliamo gestire il catalogo di libri di una biblioteca.

La class `Libro` è composta da:
- `titolo`
- `numero pagine`
- `autore`
- `editore`

Scrivere un programma che inserisce `n` libri in un array, dove `n` e' definito dall'utente.

Chiedere i dati per ogni libro (`titolo`, `numero pagine`, `autore`, `editore`), istanzia un nuovo oggetto della classe `Book` e *lo inserisce nell’array*.

Quando vengono inseriti i dati, in caso di violazione dei vincoli di integrita' (es. **non accettare titolo o autore o editore vuoto**, **numero pagine ≤ 0**), scatenare un'eccezione, informare l'utente del problema, e chiedere nuovamente il set di dati.

Al termine dell’inserimento scrivere tutti i titoli dei libri in un file (uno per riga) e in seguito rileggerli dal file mostradoli a video.