# Spring Boot Data
## Fase 1: dipendenze e indirizzi
### MAMP
Far partire MAMP, in particolare il servizio riguardante il database (MySQL)

### DBEaver
Creare il database e annotare il nome in DBEaver

### `POM.XML`
Includere le dipendenze nel `pom.xml` per accedere al **database**:
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
	<version>8.0.32</version>
</dependency>
```

### `application.properties`
Definire le seguenti impostazioni nel file di configurazione `application.properties` avendo cura di modificare il **nome del database**:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nome_db
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=create-drop
```

### Risultato atteso
In console non dovrebbero apparire errori, e dovrebbero essere visibili dei log riguardanti il boot della connessione con il database
![[Pasted image 20231004122358.png]]

## Fase 2: Model
Generare una class in un package dedicato (es: `....db.pojo`) con annotation a livello di classe `@Entity`, la chiave primaria e le variabili di 