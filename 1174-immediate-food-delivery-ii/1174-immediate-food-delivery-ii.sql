# Write your MySQL query statement below
SELECT 
    ROUND(SUM(IF(d.order_date = d.customer_pref_delivery_date, 1, 0)) * 100.0 / COUNT(DISTINCT d.customer_id), 2) AS immediate_percentage
FROM Delivery d
WHERE (customer_id, order_date) IN (
    SELECT customer_id, MIN(order_date) AS order_date
    FROM Delivery
    GROUP BY customer_id
);