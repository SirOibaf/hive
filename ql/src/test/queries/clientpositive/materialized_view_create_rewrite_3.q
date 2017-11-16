set hive.strict.checks.cartesian.product=false;
set hive.materializedview.rewriting=true;
set hive.stats.column.autogather=true;

create table cmv_basetable (a int, b varchar(256), c decimal(10,2), d int);

insert into cmv_basetable values
 (1, 'alfred', 10.30, 2),
 (2, 'bob', 3.14, 3),
 (2, 'bonnie', 172342.2, 3),
 (3, 'calvin', 978.76, 3),
 (3, 'charlie', 9.8, 1);

create table cmv_basetable_2 (a int, b varchar(256), c decimal(10,2), d int);

insert into cmv_basetable_2 values
 (1, 'alfred', 10.30, 2),
 (3, 'calvin', 978.76, 3);

EXPLAIN
CREATE MATERIALIZED VIEW cmv_mat_view ENABLE REWRITE AS
  SELECT cmv_basetable.a, cmv_basetable_2.c
  FROM cmv_basetable JOIN cmv_basetable_2 ON (cmv_basetable.a = cmv_basetable_2.a)
  WHERE cmv_basetable_2.c > 10.0
  GROUP BY cmv_basetable.a, cmv_basetable_2.c;

CREATE MATERIALIZED VIEW cmv_mat_view ENABLE REWRITE AS
  SELECT cmv_basetable.a, cmv_basetable_2.c
  FROM cmv_basetable JOIN cmv_basetable_2 ON (cmv_basetable.a = cmv_basetable_2.a)
  WHERE cmv_basetable_2.c > 10.0
  GROUP BY cmv_basetable.a, cmv_basetable_2.c;

-- USE THE VIEW
EXPLAIN
SELECT cmv_basetable.a
FROM cmv_basetable join cmv_basetable_2 ON (cmv_basetable.a = cmv_basetable_2.a)
WHERE cmv_basetable_2.c > 10.10
GROUP BY cmv_basetable.a, cmv_basetable_2.c;

SELECT cmv_basetable.a
FROM cmv_basetable JOIN cmv_basetable_2 ON (cmv_basetable.a = cmv_basetable_2.a)
WHERE cmv_basetable_2.c > 10.10
GROUP BY cmv_basetable.a, cmv_basetable_2.c;

insert into cmv_basetable_2 values
 (3, 'charlie', 15.8, 1);

-- TODO: CANNOT USE THE VIEW, IT IS OUTDATED
EXPLAIN
SELECT cmv_basetable.a
FROM cmv_basetable join cmv_basetable_2 ON (cmv_basetable.a = cmv_basetable_2.a)
WHERE cmv_basetable_2.c > 10.10
GROUP BY cmv_basetable.a, cmv_basetable_2.c;

SELECT cmv_basetable.a
FROM cmv_basetable JOIN cmv_basetable_2 ON (cmv_basetable.a = cmv_basetable_2.a)
WHERE cmv_basetable_2.c > 10.10
GROUP BY cmv_basetable.a, cmv_basetable_2.c;

-- REBUILD
EXPLAIN
ALTER MATERIALIZED VIEW cmv_mat_view REBUILD;

ALTER MATERIALIZED VIEW cmv_mat_view REBUILD;

-- NOW IT CAN BE USED AGAIN
EXPLAIN
SELECT cmv_basetable.a
FROM cmv_basetable join cmv_basetable_2 ON (cmv_basetable.a = cmv_basetable_2.a)
WHERE cmv_basetable_2.c > 10.10
GROUP BY cmv_basetable.a, cmv_basetable_2.c;

SELECT cmv_basetable.a
FROM cmv_basetable JOIN cmv_basetable_2 ON (cmv_basetable.a = cmv_basetable_2.a)
WHERE cmv_basetable_2.c > 10.10
GROUP BY cmv_basetable.a, cmv_basetable_2.c;

drop materialized view cmv_mat_view;
