1. Just configure database properties on application.properties
2. if some problem occurs on running like (relational user_tb doesnt exists) =>
 create database on your own on db. This will fix the problem.
----------------------------------------
DROP TABLE book_tb;
CREATE TABLE public.book_tb
(
  id integer,
  bookname character varying DEFAULT 'bookname'
);

----------------------------------------
DROP TABLE boot_tb;
CREATE TABLE public.boot_tb
(
  id integer,
  username character varying DEFAULT 'username'
);

Followed Link:
https://www.youtube.com/watch?v=iDogrHEo4x0&t=506s

Thanks
