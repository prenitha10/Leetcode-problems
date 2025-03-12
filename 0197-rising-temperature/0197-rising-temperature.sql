# Write your MySQL query statement below
SELECT t.id FROM Weather t CROSS JOIN Weather y WHERE DATEDIFF(t.recordDate,y.recordDate)=1 AND t.temperature>y.temperature;