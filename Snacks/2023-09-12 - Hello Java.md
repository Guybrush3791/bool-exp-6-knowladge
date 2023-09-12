## Repo
`hello-java`

## Todo
### Progetto Java - Hello World
1. creare il primo progetto *Java* chiamato `hello-java`
2. creare una classe `StampaSaluto` all'interno del **package** `org.lessons.java`
3. aggiungere il metodo `main`
4. nel metodo `main` aggiungere l’espressione per stampare in console un messaggio di saluto

### Push progetto
Per condividere il repo su *GitHub* iniziamo ad usare il terminale:
1. posizionarsi col terminale nella directory del progetto java (e' possibile utilizzare la funzion dall’IDE cliccando col destro sul progetto a selezionando `Show in` -> `Terminal`)
2. inizializzare git
3. settare il branch `main`
4. creare il repo su GitHub col nome `hello-java`
5. aggiungere il repo remoto al repo locale 
6. usare i comandi `git add`, `git commit` e `git push` per **mandare in staging**, **committare** e **pushare**

## Hint
### Progetto nuovo su Eclipse
Dal menu in alto `File` -> `Nuovo` -> `Other`, cercare `java project`
![[Pasted image 20230912150926.png]]

Definire il nome del progetto in alto e eliminare la spunta da `Create module-info.java file`
![[Pasted image 20230912151013.png]]
Premere su `Finish`
### Nuova classe su Eclipse
Tasto dx del mouse su cartella `src` nel progetto, `New` -> `Class`

### Comandi da terminale per il Git
Comandi per il push di cartella su progetto nuovo da terminale:
```sh
git init
git add -A
git commit -m "_message_"
git branch -M main
git remote add origin $URL // vedi url su pagina di gitHub
git push -u origin main
```
![[Pasted image 20230912150732.png]]