# Write your MySQL query statement below
# 1. Select the "Low Salary" category
SELECT 
    'Low Salary' AS category, 
    COUNT(*) AS accounts_count
FROM Accounts
WHERE income < 20000

UNION

# 2. Select the "Average Salary" category
SELECT 
    'Average Salary' AS category, 
    COUNT(*) AS accounts_count
FROM Accounts
WHERE income >= 20000 AND income <= 50000

UNION

# 3. Select the "High Salary" category
SELECT 
    'High Salary' AS category, 
    COUNT(*) AS accounts_count
FROM Accounts
WHERE income > 50000;