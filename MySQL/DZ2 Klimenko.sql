CREATE DATABASE my_db;
USE my_db;
CREATE TABLE products (id INTEGER, name VARCHAR(15), date_p DATE, price DECIMAL(4, 2), info VARCHAR(20),zip_code INTEGER(10));
INSERT INTO products VALUES (1, 'Pepsi', '2016-10-24', 5.65, 'Pepsi Cola',1123182312);
INSERT INTO products VALUES (2, 'Pepsi', '2016-11-14', 5.65, 'Pepsi cola',1546852147);
INSERT INTO products VALUES (3, 'Sprite', '2017-01-25', 5.60, 'Drink more',1123182312);
INSERT INTO products VALUES (4, 'Crisps', '2017-01-22', 56.65, 'Eat more', 1546852147);
INSERT INTO products(id, name, date_p, price) VALUES (5, 'Mars', '2016-12-12', 5.99);
INSERT INTO products(id, name, date_p, price) VALUES (6, 'Snickers', '2017-02-02', 7.75);
INSERT INTO products(id, name, date_p, price) VALUES (98, 'Snickers', '2017-02-02', 7.75);
INSERT INTO products(id, name, date_p, price) VALUES (256, 'Snickers', '2017-02-02', 7.75);
INSERT INTO products(id, name, date_p, price) VALUES (299, 'Snickers', '2017-02-02', 7.75);
INSERT INTO products VALUES (56, 'Crisps', '2017-01-22', 56.65, 'Eat more', 1546852500);
INSERT INTO products VALUES (46, 'Crisps', '2017-01-22', 56.65, 'Eat more',1546852100);
INSERT INTO products VALUES (7, 'Milk', '2016-10-22', 19.65, 'Tasty milk', 0265832105);
INSERT INTO products VALUES (8, 'Cigar', '2017-01-02', 56.00, 'Smoky', 2569871450);
INSERT INTO products VALUES (9, 'SUHI', '2017-01-05', 16.75, 'Watashi-wa sushi des',2365412010);


SELECT zip_code AS code 
FROM products 
WHERE zip_code IS NOT NULL;


SELECT DISTINCT name, price 
FROM products 
ORDER BY price DESC;


SELECT name, date_p
FROM products
WHERE id < 100 OR id BETWEEN 200 AND 300;

UPDATE products SET price = 19.99 WHERE id IN (1, 3, 5, 7, 9);
SELECT price, id 
FROM products 
ORDER BY price ASC;

SELECT zip_code 
FROM products WHERE zip_code LIKE '%0';

SELECT MAX(id) AS max_id, MIN(date_p) AS min_date, AVG(price), SUM( info IS NOT NULL) AS info_count
FROM products; 













SHOW TABLES;
SHOW COLUMNS FROM products;


