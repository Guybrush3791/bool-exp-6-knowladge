## Repo
`java-wish-list`

## Todo
### Es 1
Siamo a dicembre, è tempo di pensare alla lista dei regali di Natale e vogliamo creare un programma che memorizzi la nostra lista.

Il programma deve chiedere il nome del regalo da inserire in lista e salvarlo in un `ArrayList` (finchè l’utente non decide di fermarsi).

Ad ogni iterazione mostrare la lunghezza della lista e chiedere all’utente se vuole continuare aggiungendo un nuovo regalo.

Al termine dell’inserimento stampare la lista.


#### Bonus
- ogni elemento salvato in lista non deve avere solo il nome ma anche a chi è destinato (mamma, papà, cugino,  …)

### Es 2
Data una parola definita dall'utente stampare per ogni carattere della parola il numero delle occorrenze.

#### Esempio
La parola è `programma`
Stampare a schermo:
```log
p:1
r:2
o:1
g:1
a:2
m:2
```

### Es 3
Vogliamo realizzare una classe che contenga un elenco di interi e che ci permetta di ciclarli (dal primo all’ultimo).

La classe dovrà offrire due metodi:
- `int getElementoSuccessivo()`: che restituisce il prossimo elemento rispetto all’ultima volta che è stato invocato (la prima volta restituisce il primo elemento, la seconda volta il secondo, e cosi' via)
- `boolean hasAncoraElementi()`: che deve restituire `true` se ci sono ancora elementi da restituire, `false` altrimenti

La classe deve avere **un costruttore** che prende come parametro un array di interi (che sarà l’elenco che viene gestito internamente)

Internamente alla classe vogliamo mantenere l’elenco di interi come `array`, non come `ArrayList` o altre strutture dati.

#### Bonus
Prevedere anche un **costruttore che non prenda parametri** e un metodo `addElemento` che permetta di aggiungere un nuovo intero all’elenco da ciclare