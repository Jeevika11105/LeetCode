# Write your MySQL query statement below
SELECT p.product_id, ifnull(round((sum(p.price * u.units))/ sum(u.units),2),0) as average_price
FROM prices as p
LEFT JOIN UnitsSold as u
ON p.product_id = u.product_id
AND u.purchase_date between p.start_date AND p.end_date
GROUP BY product_id;