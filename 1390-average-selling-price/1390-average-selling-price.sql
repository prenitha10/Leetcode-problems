# Write your MySQL query statement below
SELECT p.product_id,ifnull( ROUND(SUM(p.price*u.units)/SUM(u.units),2),0) as average_price FROM
Prices p left JOIN UnitsSold u ON p.product_id=u.product_id
and u.purchase_date between p.start_date and p.end_date
group by p.product_id;