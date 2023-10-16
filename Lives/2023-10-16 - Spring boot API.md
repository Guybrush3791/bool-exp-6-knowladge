## Giorno 1
Implementato un `RestController` per esporre le `CRUD` (non autenticate) di `Book`.

Quello che dobbiamo fare è creare il `RestController` e inserire lo stesso codice presente in `BookController`, adattandolo per farlo funzionare con le **webapi**.

Modifiche rispetto alla terza parte:
- aggiunti due controller `BookRestController` e `BookRestAdvancedController` in package `controller.api`. Il primo controller è una versione semplice, non ci sono controlli particolari (es. validazione). Iniziamo a implementare le **webapi** sfruttando quel codice. In seguito facciamo vedere una versione più avanzata con la gestione della **validazione**, sfruttando il codice presente in `BookRestAdvancedController`
- aggiunta annotation `@JsonBackReference` nelle proprietà collegate al libro delle classi `Category` e `Borrowing` per evitare ricorsione infinita
- **disabilitato il `csrf`** in SecurityConfiguration per testare le `api` con `PostMan`
- aggiunto il metodo `findById` in `BookService` che restituisce un `Optional<Book>`, così possiamo verificare se l’`id` fornito è valido e in caso contrario gestire una risposta adeguata in `BookRestAdvancedController` (nei giorni prima per semplicità abbiamo usato il metodo `getById` che restituisce il `Book` e non l’`Optional`)

In caso di eccezione in fase di serializzazione `POJO` nelle chiamate `REST` (es. classe non serializzabile o classe vuota)

Esempio:
"*No serializer found for ... (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)*"

oppure

"*org.springframework.web.HttpMediaTypeNotAcceptableException: Could not find acceptable representation*"

aggiungere in application properties.