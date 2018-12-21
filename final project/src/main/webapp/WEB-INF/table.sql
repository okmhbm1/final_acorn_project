CREATE TABLE mysql. board_review  (		
num INT NOT NULL AUTO_INCREMENT,
writer VARCHAR(30),
title VARCHAR(100),
content BLOB,      					
viewCount INT,
recommend INT,
regdate DATETIME,
PRIMARY KEY(num)
);
									// 한글이 안되면 longtext 로 해보라?

CREATE TABLE board_review_comment (	
num INT NOT NULL AUTO_INCREMENT,
writer VARCHAR(30),
content TEXT,
target_id VARCHAR(30),
ref_group VARCHAR(30),
comment_group INT,
deleted  CHAR(5) DEFAULT 'no',    
regdate DATETIME,
PRIMARY KEY(num)
);

CREATE TABLE mysql. board_anonymous  (		
num INT NOT NULL AUTO_INCREMENT,
writer VARCHAR(30),
title VARCHAR(100),
content LONGTEXT,      					
viewCount INT,
recommend INT,
regdate DATETIME,
PRIMARY KEY(num)
);

CREATE TABLE mysql. board_anonymous_comment (	
num INT NOT NULL AUTO_INCREMENT,
writer VARCHAR(30),
content TEXT,
target_id VARCHAR(30),
ref_group VARCHAR(30),
comment_group INT,
deleted  CHAR(5) DEFAULT 'no',    
regdate DATETIME,
PRIMARY KEY(num)
);


