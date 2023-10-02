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

In ognuno di questi *metodi* aggiungere al `model` un attributo stringa con una lista di titoli di migliori film o canzoni (in base al metodo che stiamo implementando) separati da virgole.
Utilizzare i due metodi getBest… per recuperare i film e le canzoni.

Creare i rispettivi template Thymeleaf.

Creare due metodi
- “/movies/{id}”
- “/songs/{id}”
che dato il parametro id passato tramite il path, mostri in pagina il titolo relativo al film / canzone.

Testare chiamando dal browser i diversi url.

Buon lavoro!