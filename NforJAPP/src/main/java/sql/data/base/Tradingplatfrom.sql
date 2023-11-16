/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  homec
 * Created: Oct 26, 2023
 */

CREATE DATABASE tradingappfirst;
USE tradingappfirst;
create table tradeloginusers (
   UserID INT  NOT NULL AUTO_INCREMENT,
   passwords VARCHAR(60) NOT NULL,
   username  VARCHAR(60) NOT NULL,
   firstnames  VARCHAR(60) NOT NULL,
   lastnames  VARCHAR(60) NOT NULL,
   PRIMARY KEY(UserID)
 
);