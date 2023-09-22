Progettare una classe astratta `Media` che rappresenta un generico elemento multimediale identificabile da una stringa non vuota (`titolo`), e gli elementi multimediali *Image*, *Video* e *Audio*. 
Un elemento multimediale è riproducibile se implementa il metodo `play`.
Qualsiasi elemento multimediale può essere eseguito attraverso il metodo `execute`.
Eseguire un elemento multimediale significa invocarne il metodo `show` se è
un'*immagine* o il metodo `play` se è *riproducibile*.

## Classi
### Audio
Un audio è *riproducibile* e ha associato anche un *volume*  che e' un valore positivo di
tipo `int` compreso tra `0` e `10`. Di default il volume è impostato a `5`.

#### Metodi
- `weaker` + `louder`: regolare il volume
- `printVolume`: stampa il valore corrente del volume 
- `play`: ripete per un numero di volte pari al volume corrente la stampa del *titolo*

### Video
Un video è *riproducibile* e ha associato un *volume* regolabile analogo a quello
delle registrazioni audio e anche una *luminosità*, che e' un valore positivo di tipo
`double` compreso tra `0.0` e `1.0`. Di default la luminosità è impostata a `0.5`.

#### Metodi
- `brighter` + `darker`: regolarla la luminosità
- `printBrightness`: stampa la luminosità
- `play`: stampare il *titolo* concatenato ad una sequenza di asterischi di lunghezza pari al *volume* e una sequenza di asterischi per la *luminosità*

### Immagine
Un’immagine **non è riproducibile**, ma ha una *luminosità* regolabile analoga a
quella dei `filmati`.

#### Metodi
- `show`: stampa il *titolo* concatenato a una *sequenza di asterischi* di lunghezza pari al valore corrente della *luminosità*


## Sinossi
Organizzare opportunamente con classi astratte, interfacce e classi concrete il
codice di un lettore multimediale `Player` che memorizza 5 elementi multimediali
(creati con valori letti da tastiera) in un array e poi chiede ripetutamente all'utente
quale oggetto eseguire (leggendo un intero da 1 a 5 oppure 0 per finire) e dopo ogni
esecuzione fornisce la possibilità di regolarne eventuali parametri (volume /
luminosità).

## UML
### Versione 1
![[Pasted image 20230922102443.png]]
### Versione 2
![[media-uml.drawio.png]]