# Spring Boot Data
## Fase 1: dipendenze e indirizzi
### MAMP
Far partire MAMP, in particolare il servizio riguardante il database (MySQL)

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
Definire le seguenti impostazioni nel file di configurazione `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/db_library
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=create-drop
```

### Risultato atteso
In console non dovrebbero apparire errori, e dovrebbero essere visibili dei log riguardanti il boot della connessione con il database: