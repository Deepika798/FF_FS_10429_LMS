mysql>CREATE DATABASE LMS;
mysql> use lms;
Database changed
mysql> select * from category;
+----+---------------+
| id | category_name |
+----+---------------+
|  1 | Software      |
|  2 | Software|
|  3 | Electronics   |
+----+---------------+
3 rows in set (0.01 sec)

mysql> select * from book;
+----+------------------+-------------+---------------------------------------+
| id | author           | category_id | title                                 |
+----+------------------+-------------+---------------------------------------+
|  1 | BalaGuruSwamy    |           1 | C                                     |
|  2 |  James           |           2 |Java                                   |
|  3 |  Bakshu          |           3 | Network Analysis                      |
+----+------------------+-------------+---------------------------------------+
3 rows in set (0.00 sec)
