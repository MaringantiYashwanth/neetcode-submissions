-- Write your query below
SELECT 
    customer_id
FROM customers
WHERE revenue > 0
GROUP BY customer_id;