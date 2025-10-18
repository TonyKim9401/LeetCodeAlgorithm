# Write your MySQL query statement below
(SELECT
    u.name AS results
FROM Users u
LEFT JOIN MovieRating m
ON u.user_id = m.user_id
GROUP BY u.user_id
ORDER BY COUNT(u.user_id) DESC , u.name
LIMIT 1)

UNION ALL 

(SELECT
    m.title
FROM MovieRating mr
LEFT JOIN Movies m
ON m.movie_id = mr.movie_id
WHERE mr.created_at >= '2020-02-01' AND mr.created_at < '2020-03-01'
GROUP BY m.movie_id
ORDER BY AVG(mr.rating) DESC, m.title
LIMIT 1)