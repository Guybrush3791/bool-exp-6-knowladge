## Repo
`java-inheritance-shop`

## Todo
Creare la classe `Prodotto` che gestisce i prodotti dello shop. 

Un prodotto è caratterizzato da:
- `codice` (stringa)
- `nome`
- `marca`
- `prezzo`
- `iva`

Usate opportunamente i livelli di accesso (`public`, `private`), i `costruttori`, i metodi `getter` e `setter` ed eventuali altri metodi di “utilità” per fare in modo che:
- il `codice prodotto` sia accessibile *solo in lettura*
- gli `altri attributi` siano accessibili *sia in lettura che in scrittura*
- il prodotto esponga sia un `metodo` per avere *il prezzo base* che uno per avere il *prezzo comprensivo di iva formattato*

Lo shop gestisce diversi tipi di prodotto: 
- `Smarphone`, caratterizzati anche dal codice `IMEI` e dalla `quantità di memoria`
- `Televisori`, caratterizzati dalle `dimensioni` e dalla proprietà di `essere smart (si'/no)`
- `Cuffie`, caratterizzate dal `colore` e se sono `wireless o cablate`

Utilizzate l’ereditarietà per riutilizzare il codice di `Prodotto` nella stesura delle classi che gestiscono i *vari sotto tipi di prodotto*.

Create una classe `Carrello` con metodo `main`, in cui chiedete all’utente di valorizzare un *carrello di prodotti* con dati inseriti tramite `scanner`. 
Durante la richiesta chiedete all’utente se sta inserendo uno `Smarphone` o un `Televisore` o un paio di `Cuffie` e in base alla scelta dell’utente *utilizzate il costruttore opportuno*.

Al termine dell’inserimento stampate il carrello (fate l’`override` del metodo `toString` per restituire le informazioni da stampare per ogni classe)
> 
> 
> BONUS : Aggiungete alla classe Prodotto un metodo per il calcolo del prezzo scontato per clienti con tessera fedeltà, che applica al prezzo uno sconto del 2%.
> Per gli Smartphone, lo sconto è del 5% se la quantità di memoria è inferiore a 32GB, altrimenti rimane del 2%.
> Per i Televisori lo sconto è del 10% se la televisione non è smart, altrimenti rimane del 2%.
> Per le Cuffie lo sconto è del 7% se sono cablate, altrimenti rimane del 2%.
> Nella classe carrello chiedere all’utente se possiede una carta fedeltà
> In base alla risposta, calcolare il totale del carrello come somma dei prezzi base o dei prezzi scontati.
> 
> Buon lavoro!
>