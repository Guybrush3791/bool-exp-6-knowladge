## Repo
`spring-la-mia-pizzeria-webapi`

> [!attention] ATTENZIONE
> E' necessario **continuare con l'esercizio delle pizze** ma su **NUOVA REPO**.
> 
> Si consiglia quindi di eliminare la cartella nascosta `.git` e di procedere nuovamente con la fase di `init` su **nuova repo**.

## Todo
### Day 1
Ciao ragazzi,
vogliamo dare accesso alla nostra applicazione anche all’esterno!

Implementiamo quindi i metodi **CRUD** tramite `RestController`.

Diamo la possibilità di:
- ottenere la **lista di pizze** (dobbiamo anche poterle **filtrare per titolo**)
- leggere i **dettagli di una singola pizza**
- creare una **nuova pizza**
- **modificare una pizza esistente**
- **cancellare una pizza**

Queste operazioni devono poter essere eseguite tramite `PostMan`, non preoccupiamoci quindi della parte di **front-end** per ora.

### Day 2
Ciao ragazzi,
abbiamo implementato le *Api REST*, e le possiamo interrogare con `PostMan`.

Creiamo ora un semplice progetto *frontend* che le richiami e tramite *VueJS* mostri in pagina i dati.

Vogliamo una pagina per la **lista delle pizze** (**filtrabili per titolo**), una per la **creazione di una nuova pizza**, **una per la modifica di una pizza esistente** e il pulsante per la **cancellazione di un elemento**.