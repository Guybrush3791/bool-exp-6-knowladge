## Repo
`spring-il-mio-fotoalbum`

## Todo
Ciao ragazzi,
ci hanno commissionato un lavoro: un fotografo vuole mostrare agli utenti le foto più belle che ha scattato e ci chiede di **realizzare una webapp** che permetta questo.

Ha bisogno di **un’area di amministrazione** per gestire le foto, quindi:
- vedere **tutte quelle inserite** (*filtrabili*)
- vedere **i dettagli di una singola foto**
- **aggiungerne di nuove** (con *validazione*)
- **modificarle** (con *validazione*)
- **cancellarle**

Ovviamente queste operazioni può svolgerle solo lui, quindi l’accesso alle pagine deve essere **protetto da autenticazione**.

Una foto contiene almeno le seguenti informazioni:
- `titolo`
- `descrizione`
- `url`
- `visibile`
- `categorie`

**Una foto può essere collegata a più categorie, e una categoria può essere collegata a più foto.**
Prevedere quindi anche delle semplici pagine di **lista**, **creazione** e **cancellazione categorie**.

Deve essere presente anche una *homepage pubblica*, nella quale le foto (*visibili*) sono mostrate agli utenti, dando la possibilita' all'utente di **filtrarle per titolo**.

Prevedere sempre nell’homepage pubblica un **semplice form di contatto** avente i campi email e messaggio.

Il click sul tasto invia farà partire una richiesta a una nuova api che **salverà sul database il messaggio inviato**.

L’area di amministrazione va realizzata sfruttando `Thymeleaf` + *controller MVC*.
La pagina pubblica e l’invio dei messaggi di contatto devono essere gestiti tramite `VueJS` + **webapi**.

### Bonus
La webapp originariamente progettata per un fotografo che vuole mostrare le sue foto, è stata evoluta in una piattaforma multiutente che consente a diversi utenti, come altri fotografi, di utilizzarla per condividere le loro foto. 
Per fare queste operazioni gli utenti avranno il ruolo di **amministratori**, ma soltanto **delle loro foto**, non di quelle degli altri. E’ importante quindi poter gestire un livello di protezione adeguato.
È stata inoltre introdotta la figura del superadmin, che ha il potere di nascondere qualsiasi foto presente nella piattaforma per aumentare la sicurezza e la moderazione delle foto. 
Il superadmin quindi potrà agire sulla visibilità pubblica delle foto e nasconderle a tutti gli utenti.

Buon lavoro!! 🙂
>