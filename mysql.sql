create database inventory_db;
use inventory_db;

drop table manufacturer;
drop table manufacturer_facility;
drop table channel;
select * from manufacturer;
select * from manufacturer_facility;
-- Create Manufacturer table
CREATE TABLE manufacturer (
    manufacturer_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(99),
    manufacturer_name VARCHAR(99),
    manufacturer_facility_id BIGINT,
    FOREIGN KEY (manufacturer_facility_id) REFERENCES manufacturer_facility(manufacturer_facility_id)
);

-- Create ManufacturerFacility table
CREATE TABLE manufacturer_facility (
    manufacturer_facility_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    facility_name VARCHAR(99),
    facility_country ENUM('USA', 'CANADA', 'UK', 'GERMANY', 'FRANCE', 'CHINA', 'INDIA') NOT NULL
);
-- Create Channel table
CREATE TABLE channel (
    channel_id BIGINT NOT NULL AUTO_INCREMENT,
    channel_description VARCHAR(250),
    PRIMARY KEY (channel_id)
);
DESCRIBE manufacturer_facility;


CREATE TABLE manufacturer (
    manufacturer_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(99),
    manufacturer_name VARCHAR(99)
);
CREATE TABLE manufacturer_facility (
    manufacturer_facility_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    facility_name VARCHAR(99),
    facility_country ENUM('USA', 'CANADA', 'UK', 'GERMANY', 'FRANCE', 'CHINA', 'INDIA') NOT NULL,
    manufacturer_id BIGINT,
    FOREIGN KEY (manufacturer_id) REFERENCES manufacturer(manufacturer_id)
);

