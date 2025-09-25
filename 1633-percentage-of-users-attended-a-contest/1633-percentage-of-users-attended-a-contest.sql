# Write your MySQL query statement below
SELECT
    r.contest_id,
    ROUND((COUNT(r.user_id) / num.uc) * 100 ,2) as percentage
FROM Register r
JOIN (
    SELECT COUNT(*) AS uc
    FROM Users u
) AS num
GROUP BY r.contest_id
ORDER BY percentage DESC, r.contest_id ASC;