## DB
![[2023-09-27 - DB Aeroporto]]

## Todo
## Query da eseguire

### Query su singola tabella

1. Selezionare tutti i passeggeri (1000)
```sql
SELECT *
FROM passengers p;
```

2. Selezionare tutti i nomi degli aeroporti, ordinati per nome (100)
```sql
SELECT *
FROM airports a
ORDER BY name;
```

3. Selezionare tutti i passeggeri che hanno come cognome 'Bartell' (2)
```sql
SELECT *
FROM passengers p
WHERE lastname LIKE 'Bartell';
```

4. Selezionare tutti i passeggeri minorenni
```sql
SELECT *
FROM passengers p 
WHERE YEAR(date_of_birth) > YEAR(NOW()) - 18;
```

5. Selezionare tutti gli aerei che hanno piu' di 200 posti (84)
```sql
SELECT *
FROM airplanes a 
WHERE a.seating_capacity > 200;
```

6. Selezionare tutti gli aerei che hanno un numero di posti compreso tra 350 e 700 (30)
```sql
SELECT *
FROM airplanes a 
WHERE a.seating_capacity >= 350
	AND a.seating_capacity <= 700; 
```

7. Selezionare tutti gli ID dei dipendenti che hanno lasciato almeno una compagnia aerea (31077)
```sql
SELECT *
FROM airline_employee ae 
WHERE ae.layoff_date IS NOT NULL;
```

8. Selezionare tutti gli ID dei dipendenti che hanno lasciato almeno una compagnia aerea prima del 2006 (493)
```sql
-- VER 1
SELECT *
FROM airline_employee ae 
WHERE ae.layoff_date IS NOT NULL
	AND YEAR(ae.layoff_date) < 2006;

-- VER 2
SELECT *
FROM airline_employee ae 
WHERE YEAR(ae.layoff_date) < 2006;
```

9. Selezionare tutti i passeggeri il cui nome inizia con 'Al' (26)
```sql
SELECT *
FROM passengers p 
WHERE p.name LIKE 'Al%';
```

10. Selezionare tutti i passeggeri nati nel 1960 (11)
```sql
SELECT *
FROM passengers p 
WHERE YEAR(p.date_of_birth) = 1960;
```

#### BONUS 

11. contare tutti gli aeroporti la cui città inizia per 'East' (7)
```sql
SELECT COUNT(*) 
FROM airports a 
WHERE a.city LIKE 'east%';
```

12. Contare quanti voli sono partiti il 4 luglio 2019 (3)
```sql
SELECT COUNT(*)
FROM flights f 
WHERE DATE(f.departure_datetime) = '2019-07-04';
```


### Query con group by

1. Contare quanti lavori di manutenzione ha eseguito ogni impiegato (dell'impiegato vogliamo solo l'ID) (1136)
```sql
SELECT emw.employee_id, COUNT(*)
FROM employee_maintenance_work emw 
GROUP BY emw.employee_id;
```

2. Contare quante volte ogni impiegato ha lasciato una compagnia aerea (non mostrare quelli che non hanno mai lasciato; dell'impiegato vogliamo solo l'ID) (8939)
```sql
SELECT ae.employee_id, COUNT(*) 
FROM airline_employee ae 
WHERE ae.layoff_date IS NOT NULL
GROUP BY ae.employee_id;
```

3. Contare per ogni volo il numero di passeggeri (del volo vogliamo solo l'ID) (1000)
```sql
SELECT fp.flight_id, COUNT(*)
FROM flight_passenger fp 
GROUP BY fp.flight_id;
```

4. Ordinare gli aerei per numero di manutenzioni ricevute (da quello che ne ha di piu'; dell'aereo vogliamo solo l'ID) (100)
```sql
SELECT mw.airplane_id, COUNT(*) AS 'maintCount'
FROM maintenance_works mw 
GROUP BY mw.airplane_id
ORDER BY maintCount DESC;
```

5. Contare quanti passeggeri sono nati nello stesso anno (61)
```sql
SELECT YEAR(p.date_of_birth), COUNT(*)
FROM passengers p 
GROUP BY YEAR(p.date_of_birth);
```

6. Contare quanti voli ci sono stati ogni anno (tenendo conto della data di partenza) (11)
```sql
SELECT YEAR(f.departure_datetime), COUNT(*)
FROM flights f 
GROUP BY YEAR(f.departure_datetime);
```

#### BONUS 

7. Per ogni manufacturer, trovare l'aereo con maggior numero di posti a sedere (8)
```sql
-- VER BASE
SELECT a.manufacturer, MAX(a.seating_capacity) 
FROM airplanes a
GROUP BY a.manufacturer;

-- VER ADV
SELECT a.manufacturer, a.model, a.seating_capacity
FROM airplanes a
WHERE a.seating_capacity = (
	SELECT MAX(subA.seating_capacity)
	FROM airplanes subA
	WHERE subA.manufacturer = a.manufacturer
);
```

8. Contare quante manutenzioni ha ricevuto ciascun aereo nel 2021 (dell'aereo vogliamo solo l'ID) (36)
```sql
SELECT mw.airplane_id, COUNT(*) 
FROM maintenance_works mw
WHERE YEAR(mw.datetime) = 2021
GROUP BY mw.airplane_id;
```

9. Selezionare gli impiegati che non hanno mai cambiato compagnia aerea per cui lavorano (1061)
```sql
SELECT ae.employee_id 
FROM airline_employee ae
WHERE ae.layoff_date IS NULL;
```

### Query con join

1. Selezionare tutti i passeggeri del volo `70021493-2` (85)
```sql
SELECT DISTINCT p.name, p.lastname
FROM passengers p 
	JOIN flight_passenger fp 
		ON p.id = fp.passenger_id
	JOIN flights f 
		ON fp.flight_id = f.id
WHERE f.number LIKE '70021493-2'
```

2. Selezionare i voli presi da 'Shirley Stokes' (61)
```sql
SELECT f.*
FROM passengers p 
	JOIN flight_passenger fp 
		ON p.id = fp.passenger_id
	JOIN flights f
		ON fp.flight_id = f.id
WHERE p.name LIKE 'Shirley'
	AND p.lastname LIKE 'Stokes'
```

3. Selezionare tutti i passeggeri che hanno usato come documento 'Passport'(775)
```sql
SELECT DISTINCT p.name, p.lastname
FROM document_types dt 
	JOIN document_type_passenger dtp 
		ON dt.id = dtp.document_type_id
	JOIN passengers p 
		ON dtp.passenger_id = p.id
WHERE dt.name LIKE 'passport';
```

4. Selezionare tutti i voli con i relativi passeggeri (65296)
```sql
SELECT *
FROM flights f 
	JOIN flight_passenger fp 
		ON f.id = fp.flight_id
	JOIN passengers p 
		ON fp.passenger_id = p.id;
```

5. Selezionare tutti i voli che partono da `Charleneland` e arrivano a `Mauricestad` (3)
```sql
SELECT f.number, depA.city 'departure', arrA.city 'arrival'
FROM flights f 
	JOIN airports depA 
		ON f.departure_airport_id = depA.id
	JOIN airports arrA
		ON f.arrival_airport_id = arrA.id
WHERE depA.city = 'Charleneland'
	AND arrA.city = 'Mauricestad';
```

6. Selezionare tutti gli id dei voli che hanno almeno un passeggero il cui cognome inizia con 'L' (966)
```sql

```

7. Selezionare i dati delle compagnie dove almeno un impiegato si è stato licenziato (286)
```sql

```

8. Selezionare tutti gli aerei che sono partiti almeno una volta dalla città di 'Domingochester' (12)
```sql

```

9. Selezionare i dati dei tecnici e gli aerei ai quali questi hanno fatto almeno un intervento di manutenzione (1506)
```sql

```

10. Selezionare tutti i piloti che hanno viaggiato nel 2021 verso l'aeroporto di 'Abshireland' (4)
```sql

```

#### BONUS 

11. Selezionare i dati di tutti i passeggeri che hanno volato su un qualche aereo riparato da 'Aaliyah Leannon' (590)
```sql

```

12. Contare quanti piloti ha la compagnia 'Maldivian (Q2)' (10)
```sql

```

13. Contare quanti dipendenti ha ogni compagnia aerea (286)
```sql

```