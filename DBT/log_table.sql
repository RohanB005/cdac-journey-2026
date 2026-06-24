USE startersql;

CREATE TABLE user_log(
id INT auto_increment PRIMARY KEY,
user_id INT, 
name VARCHAR(100),
created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
);





