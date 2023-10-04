## Repo
`spring-la-mia-pizzeria-crud`

## Todo
### Giorno 1 - index, layout, spring jpa
Realizzare un gestionale per una pizzeria. 

Abbiamo bisogno di creare la prima pagina (`index`) dove mostriamo **tutte le pizze che prepariamo**.
Nei prossimi giorni implementeremo il resto dei metodi per le `CRUD`.

Una pizza avrà le seguenti informazioni :
- `nome`
- `descrizione`
- `foto` (url)
- `prezzo`

Creaimo il `database`, `model`, `repository` e l'entity per gestire le CRUD delle pizze.

Implementiamo  quindi il controller con il metodo index che restituisce una view per mostrare l’elenco delle pizze caricate dal database (possiamo creare una tabella con bootstrap o una qualche grafica a nostro piacimento che mostri questo elenco...un po’ di creatività se vogliamo!)

L’elenco potrebbe essere vuoto : in quel caso dobbiamo mostrare un messaggio che indichi all’utente che non ci sono pizze presenti nella nostra applicazione.

Gestiamo i componenti riutilizzabili con i fragments.

Buon lavoro!! 🙂
