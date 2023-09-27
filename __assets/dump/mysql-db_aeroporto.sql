SELECT *
FROM airlines a 
	JOIN airline_employee ae 
		ON a.id = ae.airline_id
	JOIN employees e 
		ON ae.employee_id = e.id
	JOIN roles r 
		ON e.role_id = r.id
WHERE a.name LIKE 'Maldivian (Q2)'