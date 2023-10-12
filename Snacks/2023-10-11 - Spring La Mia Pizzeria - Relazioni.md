## Repo
`spring-la-mia-pizzeria-relazioni`

> [!attention] ATTENZIONE
> E' necessario **continuare con l'esercizio delle pizze** ma su **NUOVA REPO**.
> 
> Si consiglia quindi di eliminare la cartella nascosta `.git` e di procedere nuovamente con la fase di `init` su **nuova repo**.

## Continuazione
Vedi [[2023-10-04 - Spring La Mia Pizzeria]]

## Todo
### Day 1
Nuova importante funzionalità: le offerte speciali!

In alcuni momenti potremmo voler vendere le nostre pizze a un prezzo scontato.

Dobbiamo quindi predisporre tutto il codice necessario per poter **collegare un’offerta speciale a una pizza** (in una relazione *1 a molti*, cioè un’offerta speciale può essere collegata a una sola pizza, e una pizza può essere collegata a più offerte speciali).

L’offerta speciale avrà :
- `data di inizio`
- `data di fine`
- `titolo`

La pagina di dettaglio della *singola pizza* mostrerà *l’elenco delle offerte collegate* e avrà un bottone `Crea nuova offerta speciale` per aggiungerne una nuova.

Accanto ad ogni offerta speciale è previsto un bottone che mi porterà a una pagina per modificarla.

### Day 2
Ciao ragazzi,
nuovo pezzettino per la nostra pizzeria : gli ingredienti!

Ogni pizza può avere più **ingredienti**, e **ogni ingrediente può essere collegato a più pizze**.

Prevediamo quindi una pagina per mostrare l’elenco di **tutti gli ingredienti** che utilizziamo nella nostra pizzeria che permetta anche di** crearne di nuovi**, e di **cancellarli**.

Nella pagina di **creazione** e **modifica** della singola pizza dobbiamo dare la possibilità di **collegare uno o più ingredienti**.