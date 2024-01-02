CREATE DATABASE IF NOT EXISTS medhead CHARACTER SET utf8;

CREATE TABLE IF NOT EXISTS medhead.user
(
    id       TINYINT(4) NOT NULL AUTO_INCREMENT,
    username VARCHAR(125),
    password VARCHAR(60),
    role     VARCHAR(125),
    PRIMARY KEY (id)
) ENGINE = InnoDB;