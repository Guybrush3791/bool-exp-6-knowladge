## DB
![[2023-09-27 - DB Aeroporto]]

## Todo
## Query da eseguire

### Query su singola tabella

1. Selezionare tutti i passeggeri (1000)
```sql
SELECT *
FROM passengers;
```

2. Selezionare tutti i nomi degli aeroporti, ordinati per nome (100)
```sql

```

3. Selezionare tutti i passeggeri che hanno come cognome 'Bartell' (2)
```sql

```

4. Selezionare tutti i passeggeri minorenni (considerando solo l'anno di nascita) (117 . nel 2022)
```sql

```

5. Selezionare tutti gli aerei che hanno piu' di 200 posti (84)
```sql

```

6. Selezionare tutti gli aerei che hanno un numero di posti compreso tra 350 e 700 (30)
```sql

```

7. Selezionare tutti gli ID dei dipendenti che hanno lasciato almeno una compagnia aerea (31077)
```sql

```

8. Selezionare tutti gli ID dei dipendenti che hanno lasciato almeno una compagnia aerea prima del 2006 (493)
```sql

```

9. Selezionare tutti i passeggeri il cui nome inizia con 'Al' (26)
```sql

```

10. Selezionare tutti i passeggeri nati nel 1960 (11)
```sql

```

*********** BONUS ***********

11. contare tutti gli aeroporti la cui città inizia per 'East' (7)
```sql

```

12. Contare quanti voli sono partiti il 4 luglio 2019 (3)
```sql

```


### Query con group by

1. Contare quanti lavori di manutenzione ha eseguito ogni impiegato (dell'impiegato vogliamo solo l'ID) (1136)
```sql

```

2. Contare quante volte ogni impiegato ha lasciato una compagnia aerea (non mostrare quelli che non hanno mai lasciato; dell'impiegato vogliamo solo l'ID) (8939)
```sql

```

3. Contare per ogni volo il numero di passeggeri (del volo vogliamo solo l'ID) (1000)
```sql

```

4. Ordinare gli aerei per numero di manutenzioni ricevute (da quello che ne ha di piu'; dell'aereo vogliamo solo l'ID) (100)
```sql

```

5. Contare quanti passeggeri sono nati nello stesso anno (61)
```sql

```

6. Contare quanti voli ci sono stati ogni anno (tenendo conto della data di partenza) (11)
```sql

```

*********** BONUS ***********

7. Per ogni manufacturer, trovare l'aereo con maggior numero di posti a sedere (8)
```sql

```

8. Contare quante manutenzioni ha ricevuto ciascun aereo nel 2021 (dell'aereo vogliamo solo l'ID) (36)
```sql

```

9. Selezionare gli impiegati che non hanno mai cambiato compagnia aerea per cui lavorano (1061)
```sql

```

### Query con join

1. Selezionare tutti i passeggeri del volo 70021493-2 (85)
```sql

```

2. Selezionare i voli presi da 'Shirley Stokes' (61)
```sql

```

3. Selezionare tutti i passeggeri che hanno usato come documento 'Passport'(775)
```sql

```

4. Selezionare tutti i voli con i relativi passeggeri (65296)
```sql

```

5. Selezionare tutti i voli che partono da 'Charleneland' e arrivano a 'Mauricestad' (3)
```sql

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

*********** BONUS ***********

11. Selezionare i dati di tutti i passeggeri che hanno volato su un qualche aereo riparato da 'Aaliyah Leannon' (590)
```sql

```

12. Contare quanti piloti ha la compagnia 'Maldivian (Q2)' (10)
```sql

```

13. Contare quanti dipendenti ha ogni compagnia aerea (286)
```sql

```