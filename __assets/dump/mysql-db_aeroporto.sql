SELECT YEAR(f.departure_datetime), COUNT(*)
FROM flights f 
GROUP BY YEAR(f.departure_datetime);