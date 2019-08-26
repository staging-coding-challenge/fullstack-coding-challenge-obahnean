-- Create the user...

CREATE USER grocerydb IDENTIFIED BY p4ssw0rd;

GRANT CONNECT, RESOURCE TO grocerydb;
GRANT DBA TO grocerydb WITH ADMIN OPTION;


-- Create the tables...

CREATE TABLE grocery_list (
    listID int NOT NULL ,
    listName varchar(255),
    primary key (listID)
);

CREATE TABLE grocery_items (
    itemID int,
    itemName varchar(255),
    fromList int,
    primary key (itemId),
    foreign key (fromList) references grocery_list(listID)
    );
    
CREATE SEQUENCE seq_list
MINVALUE 1
START WITH 1
INCREMENT BY 1
CACHE 10;

CREATE SEQUENCE seq_item
MINVALUE 1
START WITH 1
INCREMENT BY 1
CACHE 10;

-- populate with dummy data...

INSERT INTO GROCERY_LIST (listID, listName) 
VALUES (seq_list.nextval, 'Food');

INSERT INTO GROCERY_LIST (listID, listName) 
VALUES (seq_list.nextval, 'Cosmetics');

Select * from grocery_list; 


INSERT INTO GROCERY_ITEMS (itemID, itemName, fromList) 
VALUES (seq_item.nextval, 'bread',1);

INSERT INTO GROCERY_ITEMS (itemID, itemName, fromList) 
VALUES (seq_item.nextval, 'sausage',1);

INSERT INTO GROCERY_ITEMS (itemID, itemName, fromList) 
VALUES (seq_item.nextval, 'cheese',1);

INSERT INTO GROCERY_ITEMS (itemID, itemName, fromList) 
VALUES (seq_item.nextval, 'deodorant',2);

INSERT INTO GROCERY_ITEMS (itemID, itemName, fromList) 
VALUES (seq_item.nextval, 'shave cream',2);

commit;

Select * from grocery_items;
