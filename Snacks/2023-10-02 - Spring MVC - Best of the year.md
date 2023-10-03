## Repo 
`best-of-the-year`

## Todo
### Day 1
#### Step 1 
Creare un nuovo progetto **Spring Boot MVC + Thymeleaf** (vedi tutorial sulle slide). 
Il nome del progetto è `best-of-the-year` (stesso nome del repo).

Nel progetto aggiungere un `controller` che risponde alla *root dell’applicazione*, con un `metodo` che restituisce una *view fatta con `Thymeleaf`* in cui viene stampato un titolo: `Best of the year by …` (al posto dei puntini deve apparire il **vostro nome**, **passato come attributo** dal controller attraverso il `model`).

#### Step 2 
Creare all’interno del controller due *metodi privati*:
- `getBestMovies()`: restituisce una lista di oggetti di tipo `Movie`
- `getBestSongs()`: restituisce una lista di oggetti di tipo `Song`

Creare le classi `Movie` e `Song` aventi almeno:
- `id`
- `titolo`

Aggiungere al controller altri due metodi, che rispondono agli url:
- `/movies`
- `/songs`

In ognuno di questi *metodi* aggiungere al `model` un attributo di tipo stringa che rappresentera' la lista di `movie`/`song` seaprati da virgola (utilizzare i `metodi privati` dello [[#Step 2]] per recuperare la lista di `movie`/`song`).

Creare i rispettivi template Thymeleaf per rappresentare le due rotte.
#### Step 3 - Bonus
Creare due metodi:
- `/movies/{id}`
- `/songs/{id}`

I due metodi dovranno restituire il titolo del `movie`/`song` all'indice indicato dalla rotta.
### Day 2
Ciao!

Continuiamo a lavorare sul nostro progetto Best of the year (anche stessa repo).

Includere Bootstrap e fare il refactoring del layout come da allegato, cercando di creare componenti riutilizzabili con i fragments.

Modificare i metodi che rispondono agli url
- “/movies”
- “/songs”
in modo che i Model restituiscano una lista di oggetti (Movie o Song) invece di una stringa.
Modificare anche le rispettive view.

Ogni elemento mostrato nella lista (film o canzone) deve essere un link che punta alla rispettiva pagina di dettaglio (e anche in questo caso restituire il Model al posto della stringa col titolo).

Nella pagina home (quella che risponde alla root dell’applicazione) aggiungere due link che portano agli url /movies e /songs.

Nelle pagine con le liste aggiungere un link che riporta alla home page.

Testare navigando l’applicazione.

Buon lavoro!

![[Pasted image 20231003115542.png]]