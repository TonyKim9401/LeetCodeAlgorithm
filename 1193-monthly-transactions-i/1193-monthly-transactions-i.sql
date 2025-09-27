# Write your MySQL query statement below
SELECT 
    DATE_FORMAT(t.trans_date, '%Y-%m') AS month,
    t.country,
    COUNT(1) AS trans_count,
    SUM(IF(t.state = 'approved', 1, 0)) AS approved_count,
    SUM(t.amount) AS trans_total_amount,
    SUM(IF(t.state = 'approved', t.amount, 0)) AS approved_total_amount
FROM Transactions t
GROUP BY month, t.country;