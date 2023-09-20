## Repo
`abstract-animals`

## Todo
### Classi Astratte
Dobbiamo realizzare un programma che rappresenti il *regno animale*.

Creiamo quindi una classe *astratta* `Animale` e delle classi che la estendono: `Cane`, `Passerotto`, `Aquila`, `Delfino`

Vogliamo che gli animali abbiano i seguenti metodi:
- `void dormi()`: mostra a video “Zzz”
- `void verso()`: mostra a video il verso fatto dall'animale specifico
- `void mangia()`: mostra a video quello che mangia : erba, carne, ...?

Quali di questi metodi devono essere implementati nella classe astratta e quali devono essere lasciati astratti e implementati dalle classi che la estendono?

Una volta create le classi, nel programma istanziare alcuni animali e utilizzare i metodi implementati.

### Interfacce
Alcuni degli animali che abbiamo creato volano, altri nuotano.

Gli animali che volano hanno il seguente metodo:
- `void vola()`: mostra a video “**Sto volando!!!**”

Gli animali che nuotano hanno il seguente metodo :
- `void nuota()`: mostra a video “**Sto nuotando!!!**”

Definire 2 metodi **static** sotto il metodo `main`:
- `static void faiVolare(IVolante animale)`
- `void faiNuotare(INuotante animale)`

Questi metodi prendono come parametro un animale che può o volare o nuotare, e richiamano il corrispondente metodo vola() o nuota().

All'interno del `main` istanziare animali che volano e animali che nuotano. richiamare i metodi faiVolare / faiNuotare passandoglieli come parametro.

Buon lavoro! :)