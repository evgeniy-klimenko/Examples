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
INSERT INTO products VALUES (22, 'Banana', '2017-01-25', 6.30, 'Tasty banana', 598741230);
INSERT INTO products VALUES (23, 'Nacho', '2017-03-15', 2.50, 'Maybe hot food', 056987420);
INSERT INTO products VALUES (24, 'Hamon', '2017-05-19', 50.00, 'Salty meat', 201358652);
INSERT INTO products VALUES (25, 'Chicken', '2017-05-21', 12.99, 'Usual chicken', 03450);
INSERT INTO products VALUES (26, 'Cannavas', '2016-12-12', 25.05, 'Unusual staf', 564212);
INSERT INTO products VALUES (27, 'Chinnag', '2001-01-01', 34.00, 'Unusual staf', 231310);
INSERT INTO products VALUES (28, 'Garnno', '2010-10-10', 45.10, 'Unusual staf', 5221220);




SELECT UPPER(name), LOWER(info)
FROM products;

SELECT TRIM(TRAILING '.' FROM (TRIM(LEADING FROM CONCAT(id,' ', info)))) AS trim_Begin
FROM products
ORDER BY CONCAT(id,' ', info) DESC;

DELETE FROM products
WHERE CHARACTER_LENGTH(name) < 4;
SELECT * FROM products;


SELECT name AS 2_n, (REPLACE(name, 'nn', 'n')) AS 1_n
FROM products
WHERE name LIKE '%nn%'
GROUP BY name ASC;


SELECT CONCAT(SUBSTRING(name FROM 1 FOR 1), '.') AS name
FROM products;

CREATE TABLE buyer(name VARCHAR(15) DEFAULT 'Hi', surame VARCHAR(15) NOT NULL,id INTEGER UNIQUE);
INSERT INTO buyer VALUES ('Preston', 'Garvey', 1);
INSERT INTO buyer(id, surame) VALUES (1, 'Johanson');
INSERT INTO buyer(id, name) VALUES ('Peter', 3);