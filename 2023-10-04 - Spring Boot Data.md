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
```sh
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
[32m :: Spring Boot :: [39m              [2m (v3.1.4)[0;39m

[2m2023-10-04T12:18:25.470+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36morg.java.app.Application                [0;39m [2m:[0;39m Starting Application using Java 20.0.2 with PID 53250 (/home/guybrush/Documents/Vaults/bool-exp-6-knowladge/Workspace/2023-10-04-spring-crud-1/target/classes started by guybrush in /home/guybrush/Documents/Vaults/bool-exp-6-knowladge/Workspace/2023-10-04-spring-crud-1)
[2m2023-10-04T12:18:25.472+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36morg.java.app.Application                [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2023-10-04T12:18:25.503+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36m.e.DevToolsPropertyDefaultsPostProcessor[0;39m [2m:[0;39m Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
[2m2023-10-04T12:18:25.503+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36m.e.DevToolsPropertyDefaultsPostProcessor[0;39m [2m:[0;39m For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
[2m2023-10-04T12:18:25.826+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36m.s.d.r.c.RepositoryConfigurationDelegate[0;39m [2m:[0;39m Bootstrapping Spring Data JPA repositories in DEFAULT mode.
[2m2023-10-04T12:18:25.864+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36m.s.d.r.c.RepositoryConfigurationDelegate[0;39m [2m:[0;39m Finished Spring Data repository scanning in 33 ms. Found 1 JPA repository interfaces.
[2m2023-10-04T12:18:26.173+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat initialized with port(s): 8080 (http)
[2m2023-10-04T12:18:26.180+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Starting service [Tomcat]
[2m2023-10-04T12:18:26.180+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mo.apache.catalina.core.StandardEngine   [0;39m [2m:[0;39m Starting Servlet engine: [Apache Tomcat/10.1.13]
[2m2023-10-04T12:18:26.208+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring embedded WebApplicationContext
[2m2023-10-04T12:18:26.208+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mw.s.c.ServletWebServerApplicationContext[0;39m [2m:[0;39m Root WebApplicationContext: initialization completed in 705 ms
[2m2023-10-04T12:18:26.305+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mo.hibernate.jpa.internal.util.LogHelper [0;39m [2m:[0;39m HHH000204: Processing PersistenceUnitInfo [name: default]
[2m2023-10-04T12:18:26.327+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36morg.hibernate.Version                   [0;39m [2m:[0;39m HHH000412: Hibernate ORM core version 6.2.9.Final
[2m2023-10-04T12:18:26.328+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36morg.hibernate.cfg.Environment           [0;39m [2m:[0;39m HHH000406: Using bytecode reflection optimizer
[2m2023-10-04T12:18:26.403+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mo.h.b.i.BytecodeProviderInitiator       [0;39m [2m:[0;39m HHH000021: Bytecode provider name : bytebuddy
[2m2023-10-04T12:18:26.472+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mo.s.o.j.p.SpringPersistenceUnitInfo     [0;39m [2m:[0;39m No LoadTimeWeaver setup: ignoring JPA class transformer
[2m2023-10-04T12:18:26.486+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mcom.zaxxer.hikari.HikariDataSource      [0;39m [2m:[0;39m HikariPool-1 - Starting...
[2m2023-10-04T12:18:26.546+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mcom.zaxxer.hikari.pool.HikariPool       [0;39m [2m:[0;39m HikariPool-1 - Added connection org.mariadb.jdbc.Connection@202f3ab2
[2m2023-10-04T12:18:26.548+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mcom.zaxxer.hikari.HikariDataSource      [0;39m [2m:[0;39m HikariPool-1 - Start completed.
[2m2023-10-04T12:18:26.672+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mo.h.b.i.BytecodeProviderInitiator       [0;39m [2m:[0;39m HHH000021: Bytecode provider name : bytebuddy
[2m2023-10-04T12:18:26.997+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mo.h.e.t.j.p.i.JtaPlatformInitiator      [0;39m [2m:[0;39m HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
[2m2023-10-04T12:18:27.042+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mj.LocalContainerEntityManagerFactoryBean[0;39m [2m:[0;39m Initialized JPA EntityManagerFactory for persistence unit 'default'
[2m2023-10-04T12:18:27.208+02:00[0;39m [33m WARN[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mJpaBaseConfiguration$JpaWebConfiguration[0;39m [2m:[0;39m spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
[2m2023-10-04T12:18:27.401+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mo.s.b.d.a.OptionalLiveReloadServer      [0;39m [2m:[0;39m LiveReload server is running on port 35729
[2m2023-10-04T12:18:27.419+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat started on port(s): 8080 (http) with context path ''
[2m2023-10-04T12:18:27.425+02:00[0;39m [32m INFO[0;39m [35m53250[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36morg.java.app.Application                [0;39m [2m:[0;39m Started Application in 2.144 seconds (process running for 2.496)
```