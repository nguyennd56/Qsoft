-- MySQL Script generated by MySQL Workbench
-- 04/08/14 14:26:38
-- Model: New Model    Version: 1.0
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema dealer
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dealer` DEFAULT CHARACTER SET latin1 ;
USE `dealer` ;

-- -----------------------------------------------------
-- Table `dealer`.`Products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`Products` (
  `ProductID` INT NOT NULL,
  `Serial` INT(11) NOT NULL,
  `Manufacturer` VARCHAR(45) NOT NULL,
  `Model` VARCHAR(45) NOT NULL,
  `Year` YEAR NOT NULL,
  `Price` FLOAT NOT NULL,
  PRIMARY KEY (`ProductID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dealer`.`Orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`Orders` (
  `OrderID` INT NOT NULL,
  `OrderNumber` VARCHAR(45) NOT NULL,
  `Status` VARCHAR(45) NOT NULL,
  `CreationDate` DATE NOT NULL,
  `UpdatedDate` DATE NOT NULL,
  PRIMARY KEY (`OrderID`),
  UNIQUE INDEX `OrderNumber_UNIQUE` (`OrderNumber` ASC),
  UNIQUE INDEX `OrderID_UNIQUE` (`OrderID` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dealer`.`ProductOrder`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`ProductOrder` (
  `ProductOrderID` INT NOT NULL,
  `OrderID` INT NOT NULL,
  `ProductID` INT NOT NULL,
  PRIMARY KEY (`ProductOrderID`),
  UNIQUE INDEX `ProductOrderID_UNIQUE` (`ProductOrderID` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dealer`.`Contact`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`Contact` (
  `ContactID` INT NOT NULL,
  `Name` VARCHAR(45) NOT NULL,
  `Tel` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `JobTitle` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ContactID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dealer`.`Customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`Customer` (
  `CustomerID` INT NOT NULL,
  `Name` VARCHAR(45) NOT NULL,
  `Address` VARCHAR(45) NOT NULL,
  `Tel` VARCHAR(45) NOT NULL,
  `Fax` VARCHAR(45) NOT NULL,
  `ContactID` VARCHAR(45) NOT NULL,
  `Avatar` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`CustomerID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dealer`.`CustomerContact`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`CustomerContact` (
  `CustomerContactID` INT NOT NULL,
  `CustomerID` INT NULL,
  `ContactID` INT NULL,
  PRIMARY KEY (`CustomerContactID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dealer`.`CustomerOrder`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`CustomerOrder` (
  `CustomerOrderID` INT NOT NULL,
  `CustomerID` INT NOT NULL,
  `OrderID` INT NOT NULL,
  PRIMARY KEY (`CustomerOrderID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dealer`.`CustomerProduct`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`CustomerProduct` (
  `CustomerProductID` INT NOT NULL,
  `CustomerID` INT NOT NULL,
  `ProductID` INT NOT NULL,
  PRIMARY KEY (`CustomerProductID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dealer`.`contact`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`contact` (
  `ContactID` INT(11) NOT NULL,
  `Name` VARCHAR(45) NOT NULL,
  `Tel` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `JobTitle` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ContactID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `dealer`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`customer` (
  `CustomerID` INT(11) NOT NULL,
  `Name` VARCHAR(45) NOT NULL,
  `Address` VARCHAR(45) NOT NULL,
  `Tel` VARCHAR(45) NOT NULL,
  `Fax` VARCHAR(45) NOT NULL,
  `MainContactID` INT NOT NULL,
  `Avatar` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`CustomerID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `dealer`.`customercontact`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`customercontact` (
  `CustomerID` INT(11) NOT NULL,
  `ContactID` INT(11) NOT NULL,
  PRIMARY KEY (`CustomerID`, `ContactID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `dealer`.`customerorder`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`customerorder` (
  `CustomerID` INT(11) NOT NULL,
  `OrderID` INT(11) NOT NULL,
  PRIMARY KEY (`CustomerID`, `OrderID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `dealer`.`customerproduct`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`customerproduct` (
  `CustomerID` INT(11) NOT NULL,
  `ProductID` INT(11) NOT NULL,
  PRIMARY KEY (`CustomerID`, `ProductID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `dealer`.`orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`orders` (
  `OrderID` INT(11) NOT NULL,
  `OrderNumber` VARCHAR(45) NOT NULL,
  `Status` VARCHAR(45) NOT NULL,
  `CreationDate` DATE NOT NULL,
  `UpdatedDate` DATE NOT NULL,
  PRIMARY KEY (`OrderID`),
  UNIQUE INDEX `OrderNumber_UNIQUE` (`OrderNumber` ASC),
  UNIQUE INDEX `OrderID_UNIQUE` (`OrderID` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `dealer`.`productorder`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`productorder` (
  `OrderID` INT(11) NOT NULL,
  `ProductID` INT(11) NOT NULL,
  PRIMARY KEY (`OrderID`, `ProductID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `dealer`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`products` (
  `ProductID` INT(11) NOT NULL,
  `Serial` INT(11) NOT NULL,
  `Manufacturer` VARCHAR(45) NOT NULL,
  `Model` VARCHAR(45) NOT NULL,
  `Year` YEAR NOT NULL,
  `Price` FLOAT NOT NULL,
  PRIMARY KEY (`ProductID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `dealer`.`ContactOrder`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`ContactOrder` (
  `ContactID` VARCHAR(45) NOT NULL,
  `OrderID` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ContactID`, `OrderID`))
ENGINE = InnoDB;

USE `dealer` ;

-- -----------------------------------------------------
-- Placeholder table for view `dealer`.`view1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dealer`.`view1` (`id` INT);

-- -----------------------------------------------------
-- View `dealer`.`view1`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dealer`.`view1`;
USE `dealer`;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
