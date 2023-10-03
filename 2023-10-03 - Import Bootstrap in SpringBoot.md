# BootStrap in SpringBoot
## Install
Per includere `bootstrap` in `SpringBoot` basta importare la dipendenza relativa nel file `pom.xml`:
```xml
<dependency>
	<groupId>org.webjars</groupId>
	<artifactId>bootstrap</artifactId>
	<version>5.3.2</version>
</dependency>
```

> [!attention] Versione AGGIORNATA
> Si consiglia di importare l'ultima versione disponibile sui repository (vedi [MVNRepository](https://mvnrepository.com/artifact/org.webjars/bootstrap))

## Clean & Build
E' poi necessario ripulire e ricompilare il progetto. Per farlo in `Eclipse`, cliccare con il tasto dx del mouse sul progetto --> `Run as` --> `Maven build...` (**ATTENZIONE AI 3 PUNTINI**)