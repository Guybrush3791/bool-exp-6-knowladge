## Repo
`spring-la-mia-pizzeria-crud`

## Todo
### Giorno 1 - index, layout, spring jpa
Realizzare un gestionale per una pizzeria. 

Abbiamo bisogno di creare la prima pagina (`index`) dove mostriamo **tutte le pizze che prepariamo**.

Una **pizza** avrà le seguenti informazioni:
- `nome`
- `descrizione`
- `foto` (url)
- `prezzo`

Creaimo il `database`, `model`, `repository` e `service` per gestire le **CRUD** delle pizze.

Implementare inoltre il `CommandLineRunner` come visto a lezione per caricare alcuni **dati fake**.

Implementiamo  quindi il **controller** con il metodo `index` che restituisce una **view** per mostrare **l’elenco delle pizze caricate dal database**.

L’elenco potrebbe essere vuoto: in quel caso dobbiamo mostrare un messaggio che indichi all’utente che non ci sono pizze presenti nella nostra applicazione. Testare anche questa eventualita' commentando gli inserimenti nel `CommandLineRunner`.

Gestiamo i componenti riutilizzabili con i `fragments`.
