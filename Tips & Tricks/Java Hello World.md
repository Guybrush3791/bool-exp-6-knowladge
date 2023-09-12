### Progetto nuovo su Eclipse
Dal menu in alto `File` -> `Nuovo` -> `Other`, cercare `java project`
![[Pasted image 20230912150926.png]]

Definire il nome del progetto in alto e eliminare la spunta da `Create module-info.java file`
![[Pasted image 20230912151013.png]]
Premere su `Finish`
### Nuova classe su Eclipse
Tasto dx del mouse su cartella `src` nel progetto, `New` -> `Class`.
Definire `nome` e `package` della classe
![[Pasted image 20230912151226.png]]
Premere su `Finish`

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

### MacOS `Content Assistant` fix
In **MacOs** lo shortscut di Eclipse `CTRL` + `SPACE` potrebbe andare in conflitto con *Spotlight*. In questo caso e' possibile cambiare la combinazione di tasti per il menu di Eclipse attraverso il menu in alto `Eclipse` -> `Settings`, ricercare la parola `keys`, selezionare `General` -> `Keys` nel menu sulla sinistra.
Nel menu degli shortscut di `Eclipse`, cercare il comando `Content Assistant` e modificare con una combinazione di tasti che sia libera sul proprio sistema operativo (es: `Z` + `SPACE`)