# company
Spring MVC 4 + Spring Sercurity 3 + MyBatis 3

# sql
--- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Account` (
  `AccountId` INT NOT NULL AUTO_INCREMENT,
  `UserName` VARCHAR(45) NULL,
  `Password` VARCHAR(45) NULL,
  `Phone` VARCHAR(45) NULL,
  `Email` VARCHAR(45) NULL,
  `Address` VARCHAR(45) NULL,
  `Role` VARCHAR(45) NULL,
  PRIMARY KEY (`AccountId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Test`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Test` (
  `TestId` INT NOT NULL AUTO_INCREMENT,
  `TestName` VARCHAR(500) NULL,
  `SumPoint` INT NULL,
  PRIMARY KEY (`TestId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Question`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Question` (
  `QuestionId` INT NOT NULL AUTO_INCREMENT,
  `QuestionContent` VARCHAR(500) NULL,
  `TestId` INT NULL,
  `Point` INT NULL,
  PRIMARY KEY (`QuestionId`),
  INDEX `fk_Question_Test1_idx` (`TestId` ASC),
  CONSTRAINT `fk_Question_Test1`
    FOREIGN KEY (`TestId`)
    REFERENCES `mydb`.`Test` (`TestId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Answer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Answer` (
  `AnswerId` INT NOT NULL AUTO_INCREMENT,
  `AnswerContent` VARCHAR(500) NULL,
  `AnswerTrue` TINYINT(1) NULL,
  `QuestionId` INT NOT NULL,
  PRIMARY KEY (`AnswerId`, `QuestionId`),
  INDEX `fk_Answer_Question_idx` (`QuestionId` ASC),
  CONSTRAINT `fk_Answer_Question`
    FOREIGN KEY (`QuestionId`)
    REFERENCES `mydb`.`Question` (`QuestionId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`AccountTest`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`AccountTest` (
  `AccountTestId` INT NOT NULL AUTO_INCREMENT,
  `AccountId` INT NOT NULL,
  `TestId` INT NOT NULL,
  PRIMARY KEY (`AccountTestId`, `AccountId`, `TestId`),
  INDEX `fk_UserTest_User1_idx` (`AccountId` ASC),
  INDEX `fk_UserTest_Test1_idx` (`TestId` ASC),
  CONSTRAINT `fk_UserTest_User1`
    FOREIGN KEY (`AccountId`)
    REFERENCES `mydb`.`Account` (`AccountId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_UserTest_Test1`
    FOREIGN KEY (`TestId`)
    REFERENCES `mydb`.`Test` (`TestId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TestResult`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TestResult` (
  `TestResultId` INT NOT NULL AUTO_INCREMENT,
  `TestId` INT NULL,
  `AccountId` INT NOT NULL,
  `Point` INT NULL,
  PRIMARY KEY (`TestResultId`, `AccountId`),
  INDEX `fk_TestResult_User1_idx` (`AccountId` ASC),
  CONSTRAINT `fk_TestResult_User1`
    FOREIGN KEY (`AccountId`)
    REFERENCES `mydb`.`Account` (`AccountId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`QuestionResult`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`QuestionResult` (
  `QuestionResultId` INT NOT NULL AUTO_INCREMENT,
  `QuestionResultAnswer` VARCHAR(45) NULL,
  `TestResultId` INT NOT NULL,
  PRIMARY KEY (`QuestionResultId`, `TestResultId`),
  INDEX `fk_QuestionResult_TestResult1_idx` (`TestResultId` ASC),
  CONSTRAINT `fk_QuestionResult_TestResult1`
    FOREIGN KEY (`TestResultId`)
    REFERENCES `mydb`.`TestResult` (`TestResultId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
