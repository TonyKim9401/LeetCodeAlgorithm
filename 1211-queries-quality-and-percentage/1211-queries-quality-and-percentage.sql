# Write your MySQL query statement below
SELECT 
    q.query_name,
    ROUND(SUM(q.rating / q.position) / COUNT(1),2) AS quality,
    IF(RATE.less_rate IS NULL, 0, ROUND((RATE.less_rate / COUNT(1)) * 100,2)) AS poor_query_percentage
FROM Queries q
LEFT JOIN (
    SELECT 
        query_name,
        COUNT(*) AS less_rate
    FROM Queries
    WHERE rating < 3 AND query_name IS NOT NULL
    GROUP BY query_name
) RATE
ON q.query_name = RATE.query_name
WHERE q.query_name IS NOT NULL
GROUP BY q.query_name;