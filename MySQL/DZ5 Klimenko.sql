CREATE DATABASE my_db;
USE my_db;

CREATE TABLE Products (id INTEGER, name VARCHAR(15), date_p DATE, price DECIMAL(4, 2), 
info VARCHAR(20), zip_code INTEGER(10), sell VARCHAR(4), product_id INTEGER);
INSERT INTO products VALUES (1, 'Pepsi', '2016-10-24', 5.65, 'Pepsi Cola',1123182312, 'Yes', 1);
INSERT INTO products VALUES (2, 'Pepsi', '2016-11-14', 5.65, 'Pepsi cola',1546852147, 'No', 1);
INSERT INTO products VALUES (3, 'Sprite', '2017-01-25', 5.60, 'Drink more',1123182312, 'Yes', 14);
INSERT INTO products VALUES (4, 'Crisps', '2017-01-22', 56.65, 'Eat more', 1546852147, 'Yes', 2);
INSERT INTO products(id, name, date_p, price, sell, product_id) VALUES (5, 'Mars', '2016-12-12', 5.99, 'Yes', 7);
INSERT INTO products(id, name, date_p, price, sell, product_id) VALUES (15, 'Mars', '2016-12-12', 5.99, 'Yes', 7);
INSERT INTO products(id, name, date_p, price, sell, product_id) VALUES (16, 'Mars', '2016-12-12', 5.99, 'Yes', 7);
INSERT INTO products(id, name, date_p, price, sell, product_id) VALUES (17, 'Mars', '2016-12-12', 5.99, 'Yes', 7);
INSERT INTO products(id, name, date_p, price, sell, product_id) VALUES (18, 'Mars', '2016-12-12', 5.99, 'Yes', 7);
INSERT INTO products(id, name, date_p, price, sell, product_id) VALUES (19, 'Mars', '2016-12-12', 5.99, 'No', 7);
INSERT INTO products(id, name, date_p, price, sell, product_id) VALUES (20, 'Mars', '2016-12-12', 5.99, 'Yes', 7);
INSERT INTO products(id, name, date_p, price, sell, product_id) VALUES (21, 'Snickers', '2017-02-02', 7.75, 'No', 4);
INSERT INTO products(id, name, date_p, price, sell, product_id) VALUES (98, 'Snickers', '2017-02-02', 7.75, 'No', 4);
INSERT INTO products(id, name, date_p, price, sell, product_id) VALUES (256, 'Snickers', '2017-02-02', 7.75, 'No', 4);
INSERT INTO products(id, name, date_p, price, sell, product_id) VALUES (299, 'Snickers', '2017-02-02', 7.75, 'Yes', 4);
INSERT INTO products VALUES (56, 'Crisps', '2017-01-22', 56.65, 'Eat more', 1546852500, 'Yes', 2);
INSERT INTO products VALUES (46, 'Crisps', '2017-01-22', 56.65, 'Eat more',1546852100,'No', 2);
INSERT INTO products VALUES (7, 'Milk', '2016-10-22', 19.65, 'Tasty milk', 0265832105, 'No', 5);
INSERT INTO products VALUES (10, 'Milk', '2015-05-23', 19.65, 'Tasty milk', 026585331, 'No', 5);
INSERT INTO products VALUES (11, 'Milk', '2016-04-23', 19.65, 'Tasty milk', 0265833213, 'Yes', 5);
INSERT INTO products VALUES (12, 'Milk', '2017-05-13', 19.65, 'Tasty milk', 0265835500, 'Yes', 5);
INSERT INTO products VALUES (13, 'Milk', '2015-06-22', 19.65, 'Tasty milk', 0265832640, 'Yes', 5);
INSERT INTO products VALUES (14, 'Cigar', '2017-01-02', 56.00, 'Smoky', 256987140, 'No', 6);
INSERT INTO products VALUES (9, 'SUHI', '2017-01-05', 16.75, 'Watashi-wa sushi des',265412010, 'Yes', 7);
INSERT INTO products VALUES (22, 'Banana', '2017-01-25', 6.30, 'Tasty banana', 598741230, 'Yes', 8);
INSERT INTO products VALUES (23, 'Nacho', '2017-03-15', 2.50, 'Maybe hot food', 056987420, 'No', 9);
INSERT INTO products VALUES (24, 'Hamon', '2017-05-19', 50.00, 'Salty meat', 201358652, 'No', 10);
INSERT INTO products VALUES (25, 'Chicken', '2017-05-21', 12.99, 'Usual chicken', 03450, 'No', 15);
INSERT INTO products VALUES (26, 'Cannavas', '2016-12-12', 25.05, 'Unusual staf', 564212, 'No', 11);
INSERT INTO products VALUES (27, 'Chinnag', '2001-01-01', 34.00, 'Unusual staf', 231310, 'No', 12);
INSERT INTO products VALUES (28, 'Garnno', '2010-10-10', 45.10, 'Unusual staf', 5221220, 'No', 13);

CREATE TABLE Clients (id INTEGER, product_id INTEGER, product_count INTEGER);

INSERT INTO orders VALUES (1, 1, 2);
INSERT INTO orders VALUES (2, 2, 36);
INSERT INTO orders VALUES (3, 3, 7);
INSERT INTO orders VALUES (4, 4, 4);
INSERT INTO orders VALUES (5, 5, 0);
INSERT INTO orders VALUES (6, 6, 1);
INSERT INTO orders VALUES (7, 7, 1);
INSERT INTO orders VALUES (8, 8, 0);
INSERT INTO orders VALUES (9, 9, 1);
INSERT INTO orders VALUES (10, 10, 1);
INSERT INTO orders VALUES (11, 11, 1);
INSERT INTO orders VALUES (12, 12, 12);
INSERT INTO orders VALUES (13, 13, 34);
INSERT INTO orders VALUES (14, 14, 5);
INSERT INTO orders VALUES (15, 15, 0);

INSERT INTO Clients (id) 
SELECT id 
FROM Products
WHERE Products.id IS NULL;


