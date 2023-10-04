# Spring Boot Data
## Fase 1: dipendenze e indirizzi
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
