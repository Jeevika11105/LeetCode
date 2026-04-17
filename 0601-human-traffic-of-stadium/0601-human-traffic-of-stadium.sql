# Write your MySQL query statement below
WITH GroupedStadium AS (
    SELECT *, id - ROW_NUMBER() OVER (ORDER BY id) AS id_diff
    FROM Stadium
    WHERE people >= 100
),
Counts AS (SELECT *, COUNT(*) OVER (PARTITION BY id_diff) AS group_len
    FROM GroupedStadium
)
SELECT id, visit_date, people
FROM Counts
WHERE group_len >= 3
ORDER BY visit_date;