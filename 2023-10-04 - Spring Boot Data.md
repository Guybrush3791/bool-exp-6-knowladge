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
Generare una class in un package dedicato (es: `....db.pojo`) con annotation a livello di classe `@Entity`, la chiave primaria e le variabili di istanza come mappa per le colonne della tabella in db
#### Code
```java
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 128, nullable = false)
	private String title;
	private String subTitle;
	
	private LocalDate releaseDate;
	@Column(unique = true)
	private String isbn;
	
	public Book() { }
	public Book(String title, String subTitle, LocalDate releaseDate, String isbn) {
	
		setTitle(title);
		setSubTitle(subTitle);
		setReleaseDate(releaseDate);
		setIsbn(isbn);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		
		return "[" + getId() + "] Book:\n"
					+ "title: " + getTitle() + "\n"
					+ "sub-title: " + getSubTitle() + "\n"
					+ "release date: " + getReleaseDate() + "\n"
					+ "ISBN: " + getIsbn();
	}
}
```
#### Risultato
Dopo aver creato la classe correttamente e' possibile compilare nuovamente il progetto e verificare in **DBEaver** che la tabella sia stata creata correttamente in db
![[Pasted image 20231004122752.png]]

## Fase 3: Insert
#### Repository
Generare l'interfaccia **repository** che estendera' `JpaRepository<E, T>` passandogli come parametri **generics** (tra le parentesi angolari) prima la classe **model**, poi il relativo tipo di dato della chiave primaria (quasi sempre `Integer`)
```java
import org.java.app.db.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
```

#### Service
Generare la classe **service** per esporre i metodi del **repository**. Dopo aver 