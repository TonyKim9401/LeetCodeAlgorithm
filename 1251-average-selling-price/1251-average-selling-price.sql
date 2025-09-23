# Write your MySQL query statement below
SELECT
    p.product_id,
    IF(u.units IS NOT NULL, ROUND(SUM(p.price * u.units) / SUM(u.units), 2), 0) AS average_price
FROM Prices p
LEFT JOIN UnitsSold u
ON p.product_id = u.producT_id
WHERE (u.purchase_date >= p.start_date AND u.purchase_date <= p.end_date) OR u.purchase_date IS NULL
GROUP BY p.product_id;