DROP TABLE IF EXISTS client;
DROP TABLE IF EXISTS vehicle;
DROP TABLE IF EXISTS repair;

CREATE TABLE client (
    id INT AUTO_INCREMENT PRIMARY KEY,
    names VARCHAR(250) NOT NULL
);

CREATE TABLE vehicle (
    id INT AUTO_INCREMENT PRIMARY KEY,
    plate VARCHAR(250) NOT NULL,
    model VARCHAR(250),
    client_id INT
);

CREATE TABLE repair (
    id INT AUTO_INCREMENT PRIMARY KEY,
    vehicle_id INT,
    comments VARCHAR(250),
    date timestamp
);