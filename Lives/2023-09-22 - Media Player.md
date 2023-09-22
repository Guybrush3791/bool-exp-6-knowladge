Progettare una classe Media che rappresenta un generico elemento multimediale
identificabile da una stringa non vuota, e gli elementi multimediali Image, Video e
Audio. Un elemento multimediale è riproducibile se implementa il metodo play.
● Un audio è riproducibile e ha associato anche un volume (un valore positivo di
tipo int compreso tra 0 e 10) e i metodi weaker e louder per regolarlo e il
metodo printVolume che stampa il valore corrente del volume. Di default il
volume è impostato a 5.
Se riprodotto, ripete per un numero di volte pari al volume corrente la stampa
del titolo
● Un video è riproducibile e ha associato un volume regolabile analogo a quello
delle registrazioni audio e anche una luminosità (un valore positivo di tipo
double compreso tra 0.0 e 0.9) e i metodi brighter e darker per regolarla e il
metodo printBrightness che stampa il valore corrente della luminosità. Di
default la luminosità è impostata a 0.5.
Se riprodotto, ripete per un numero di volte pari al valore corrente del volume
la stampa del titolo concatenato a una sequenza di asterischi di lunghezza
pari al valore corrente della luminosità
● Un’immagine non è riproducibile, ma ha una luminosità regolabile analoga a
quella dei filmati e un metodo show che stampa il titolo concatenato a una
sequenza di asterischi di lunghezza pari al valore corrente della luminosità.
Qualsiasi elemento multimediale può essere eseguito attraverso il metodo execute.
Eseguire un elemento multimediale significa invocarne il metodo show se è
un'immagine o il metodo play se è riproducibile.
Organizzare opportunamente con classi astratte, interfacce e classi concrete il
codice di un lettore multimediale Player che memorizza 5 elementi multimediali
(creati con valori letti da tastiera) in un array e poi chiede ripetutamente all'utente
quale oggetto eseguire (leggendo un intero da 1 a 5 oppure 0 per finire) e dopo ogni
esecuzione fornisce la possibilità di regolarne eventuali parametri (volume /
luminosità).

![[Pasted image 20230922102443.png]]