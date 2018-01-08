CREATE DATABASE my_db;
USE my_db;
CREATE TABLE products (id INTEGER, name VARCHAR(15), date_p DATE, price DECIMAL(4, 2), info VARCHAR(20), zip_code INTEGER(10));
INSERT INTO products VALUES (1, 'Pepsi', '2016-10-24', 5.65, 'Pepsi Cola',1123182312);
INSERT INTO products VALUES (2, 'Pepsi', '2016-11-14', 5.65, 'Pepsi cola',1546852147);
INSERT INTO products VALUES (3, 'Sprite', '2017-01-25', 5.60, 'Drink more',1123182312);
INSERT INTO products VALUES (4, 'Crisps', '2017-01-22', 56.65, 'Eat more', 1546852147);
INSERT INTO products(id, name, date_p, price) VALUES (5, 'Mars', '2016-12-12', 5.99);
INSERT INTO products(id, name, date_p, price) VALUES (15, 'Mars', '2016-12-12', 5.99);
INSERT INTO products(id, name, date_p, price) VALUES (16, 'Mars', '2016-12-12', 5.99);
INSERT INTO products(id, name, date_p, price) VALUES (17, 'Mars', '2016-12-12', 5.99);
INSERT INTO products(id, name, date_p, price) VALUES (18, 'Mars', '2016-12-12', 5.99);
INSERT INTO products(id, name, date_p, price) VALUES (19, 'Mars', '2016-12-12', 5.99);
INSERT INTO products(id, name, date_p, price) VALUES (20, 'Mars', '2016-12-12', 5.99);
INSERT INTO products(id, name, date_p, price) VALUES (21, 'Snickers', '2017-02-02', 7.75);
INSERT INTO products(id, name, date_p, price) VALUES (98, 'Snickers', '2017-02-02', 7.75);
INSERT INTO products(id, name, date_p, price) VALUES (256, 'Snickers', '2017-02-02', 7.75);
INSERT INTO products(id, name, date_p, price) VALUES (299, 'Snickers', '2017-02-02', 7.75);
INSERT INTO products VALUES (56, 'Crisps', '2017-01-22', 56.65, 'Eat more', 1546852500);
INSERT INTO products VALUES (46, 'Crisps', '2017-01-22', 56.65, 'Eat more',1546852100);
INSERT INTO products VALUES (7, 'Milk', '2016-10-22', 19.65, 'Tasty milk', 0265832105);
INSERT INTO products VALUES (10, 'Milk', '2015-05-23', 19.65, 'Tasty milk', 026585331);
INSERT INTO products VALUES (11, 'Milk', '2016-04-23', 19.65, 'Tasty milk', 0265833213);
INSERT INTO products VALUES (12, 'Milk', '2017-05-13', 19.65, 'Tasty milk', 0265835500);
INSERT INTO products VALUES (13, 'Milk', '2015-06-22', 19.65, 'Tasty milk', 0265832640);
INSERT INTO products VALUES (14, 'Cigar', '2017-01-02', 56.00, 'Smoky', 256987140);
INSERT INTO products VALUES (9, 'SUHI', '2017-01-05', 16.75, 'Watashi-wa sushi des',265412010);


SELECT id, name, date_p, price, info, zip_code
FROM products
GROUP BY id ASC, name DESC, date_p ASC, price ASC, info DESC, zip_code ASC;

SELECT name, price, price - (price*0.2) AS discount_price
FROM products LIMIT 10;

SELECT id, name
FROM products
WHERE id%2 = 0;

DELETE FROM products
WHERE date_p LIKE '%-04-%';
DELETE FROM products
WHERE date_p LIKE '%-05-%';
DELETE FROM products
WHERE date_p LIKE '%-06-%';
SELECT * FROM products;


SELECT info, name, MAX(DISTINCT price) AS max_price
FROM products
WHERE info IS NOT NULL
GROUP BY  price DESC;


SELECT  date_p, name, COUNT(date_p) AS amount_of_products
FROM products
GROUP BY date_p ASC
HAVING amount_of_products < 5;

SELECT name, zip_code,
CASE 'countries'
WHEN zip_code LIKE '1%' THEN 'Nigeria'
WHEN zip_code LIKE '2%' THEN 'China'
WHEN zip_code LIKE '3%' THEN 'Italy'
WHEN zip_code LIKE '4%' THEN 'Englang'
WHEN zip_code LIKE '5%' THEN 'Irland'
WHEN zip_code LIKE '6%' THEN 'Poland'
WHEN zip_code LIKE '7%' THEN 'Greece'
WHEN zip_code LIKE '8%' THEN 'Japan'
WHEN zip_code LIKE '9%' THEN 'USA'
ELSE 'Kameroon'
END as countries
FROM products
ORDER BY name DESC;

