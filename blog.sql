-- MySQL Script generated by MySQL Workbench
-- 04/21/16 21:38:46
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema blog
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema blog
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `blog` DEFAULT CHARACTER SET utf8 ;
USE `blog` ;

-- -----------------------------------------------------
-- Table `blog`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `blog`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL COMMENT '用户名',
  `password` VARCHAR(45) NOT NULL COMMENT '用户密码',
  `xm` VARCHAR(45) NULL COMMENT '用户姓名',
  `sex` VARCHAR(4) NULL COMMENT '用户性别',
  `age` INT NULL COMMENT '用户年龄',
  `birthday` VARCHAR(20) NULL COMMENT '出生日期',
  `address` VARCHAR(100) NULL COMMENT '家庭地址',
  `email` VARCHAR(45) NULL COMMENT '邮件地址',
  `qq` VARCHAR(20) NULL COMMENT 'QQ号码',
  `pagehome` VARCHAR(70) NULL COMMENT '主页',
  `level` VARCHAR(10) NULL COMMENT '用户等级',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `blog`.`columns`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `blog`.`columns` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '栏目id',
  `name` VARCHAR(45) NOT NULL COMMENT '栏目名称',
  `fid` INT NULL COMMENT '父栏目id',
  `createid` INT NOT NULL COMMENT '创建人id',
  PRIMARY KEY (`id`, `createid`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_columns_user1_idx` (`createid` ASC),
  CONSTRAINT `fk_columns_user1`
    FOREIGN KEY (`createid`)
    REFERENCES `blog`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `blog`.`content`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `blog`.`content` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '文章id',
  `cid` INT NOT NULL COMMENT '栏目id',
  `createid` INT NOT NULL COMMENT '创建人id',
  `title` VARCHAR(100) NOT NULL COMMENT '文章标题',
  `introduction` VARCHAR(200) NULL COMMENT '文章简介',
  `content` BLOB NULL COMMENT '文章内容',
  `createtime` DATE NULL COMMENT '创建时间',
  `lastedittime` DATE NULL COMMENT '最后编辑时间',
  `releasetime` DATE NULL COMMENT '发布时间',
  `lasteditid` VARCHAR(45) NULL COMMENT '最后编辑人id',
  `publishid` VARCHAR(45) NULL COMMENT '发布人id',
  `visits` INT NULL COMMENT '访问次数',
  PRIMARY KEY (`id`, `cid`, `createid`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_content_columns_idx` (`cid` ASC),
  INDEX `fk_content_user1_idx` (`createid` ASC),
  CONSTRAINT `fk_content_columns`
    FOREIGN KEY (`cid`)
    REFERENCES `blog`.`columns` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_content_user1`
    FOREIGN KEY (`createid`)
    REFERENCES `blog`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
