CREATE DATABASE  IF NOT EXISTS `projecthms` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `projecthms`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: projecthms
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `Admin_Id` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('admin','2002');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `id` varchar(20) DEFAULT NULL,
  `number` varchar(20) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `country` varchar(20) DEFAULT NULL,
  `room` varchar(10) DEFAULT NULL,
  `checked_in` varchar(30) DEFAULT NULL,
  `deposit` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('Driving license','254631245789','Hardik Malviya','Male','India','104','yes','2000'),('Passport','3242424','raj hirani','Male','India','102','Yes','1500'),('Aadhar Card','42545742145474','Sanjay Jaiswal','Male','India','108','Yes','2000'),('Aadhar Card','456829587423','Nitish Jaiswal','Male','India','101','Yes','2200'),('Aadhar Card','56542758427','Bhoomi Gupta','Female','Japan','107','yes','1000'),('Passport','64572157','Atharva Petkar','Male','India','102','Yes','1500'),('Aadhar Card','645789124356','Pratik Patkar','Male','India','103','yes','2000'),('Passport','97858386','Sam Alexander','Male','USA','105','Yes','2300'),('Passport','98388765','Sham hirani','Male','India','102','Yes','1500');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `Username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `Job` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Username`,`password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('admin','2002','nil','nil'),('Martin234','12345678','Matin Alexander','Manager'),('Raj@12','iamraj123','Raj Shah','Manager'),('shaurya123','1234','Shaurya Ramnath','Chef'),('Shinigami','shini123','Jaineel Gaikwad','Front Desk Clerks');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `room_number` int NOT NULL,
  `availability` varchar(30) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `price` varchar(7) DEFAULT NULL,
  `Bed_type` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`room_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (101,'Occupied','AC','2000','Single Bed'),(102,'Occupied','AC','2200','Single Bed'),(103,'Occupied','AC','2200','Single Bed'),(104,'Occupied','AC','2600','Single Bed'),(105,'Available','AC','2600','Single Bed'),(106,'Available','AC','2200','Double Bed'),(107,'Occupied','AC','2200','Double Bed'),(108,'Occupied','AC','2500','Double Bed'),(109,'Available','AC','2900','Double Bed'),(110,'Available','AC','2900','Double Bed'),(111,'Available','NON AC','1200','Single Bed'),(112,'Available','NON AC','1500','Single Bed'),(113,'Available','NON AC','1700','Double Bed'),(114,'Available','NON AC','2000','Double Bed'),(115,'Available','NON AC','2000','Double Bed'),(116,'Available','AC','5000','Double Bed'),(117,'Available','AC','3500','Double Bed');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `name` varchar(30) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `gender` varchar(15) DEFAULT NULL,
  `job` varchar(30) DEFAULT NULL,
  `salary` varchar(20) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `aadhar` varchar(30) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`aadhar`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES ('Shaurya Ramnath',26,'male','Chef','47500','9856544726','055606506036','shauryaramnath@gmail.com'),('Matin Alexander',26,'male','Manager','50000','9854789654','127896314567','martinalexander@gmail.com'),('Jaineel Gaikwad',21,'male','Front Desk Clerks','40000','668759431','154678915461','jaineelgaikwad@gmail.com'),('Atharva paekar',23,'male','Housekeeping','10000','8246857456','456254848652','atharvapatekar@gmail.com'),('Raj Shah',29,'male','Manager','50000','9652489652','654231987520','rajshah@gmail.com'),('Ronit Thakur',23,'male','Waiter/Waitress','5000','9356458215','658246554685','ronitthakur@gmail.com'),('Anushka Singhani',25,'female','Housekeeping','10000','9876542135','658947523654','anushkasinghani@gmail.com'),('Shreya Dshpande',25,'female','Front Desk Clerks','40000','9542654895','659725154644','shreyadeshpande@gmail.com'),('Zaltan Martinez',26,'male','kitchen staff','12000','9844637364','690892736400','null'),('Hardik Malviya ',24,'male','Porters','12000','9561247654','965412357895','hardikmalviya@gmail.com'),('Saurabh Pimpalkar',26,'male','Accountant','75000','9551244578','975148457765','saurabhpimpalkar@gmail.com'),('Rani patil',23,'female','Kitchen Staff','19500','8732054925','985624652456','ranipatil@gmail.com');
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `my_trigger3` BEFORE INSERT ON `staff` FOR EACH ROW BEGIN
        INSERT INTO trigger_test VALUES('added new employee');
    END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `trigger_test`
--

DROP TABLE IF EXISTS `trigger_test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trigger_test` (
  `messages` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trigger_test`
--

LOCK TABLES `trigger_test` WRITE;
/*!40000 ALTER TABLE `trigger_test` DISABLE KEYS */;
INSERT INTO `trigger_test` VALUES ('added new employee'),('added new employee'),('added new employee'),('added new employee');
/*!40000 ALTER TABLE `trigger_test` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'projecthms'
--

--
-- Dumping routines for database 'projecthms'
--
/*!50003 DROP FUNCTION IF EXISTS `Customer_name` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `Customer_name`(
room_number INT) RETURNS varchar(45) CHARSET utf8mb4
    DETERMINISTIC
BEGIN
DECLARE Customer_name VARCHAR(45);	
 SET Customer_name =
(SELECT customer.name
FROM customer 
WHERE customer.room = room_number );
RETURN Customer_name;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP FUNCTION IF EXISTS `Func_Divide` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `Func_Divide`( Num INT ) RETURNS int
    DETERMINISTIC
BEGIN DECLARE Divide INT;
SET Divide = Num / 4;
RETURN Divide;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP FUNCTION IF EXISTS `MinAge` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `MinAge`(num int) RETURNS varchar(100) CHARSET utf8mb4
    DETERMINISTIC
BEGIN DECLARE age INT;
SET age = num;
If (age > 18) 
THEN RETURN "He is elligible to be an employee";
Else 
RETURN"He is not elligible to be an employee";
END if;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getyoung_employees` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getyoung_employees`()
BEGIN
Select * from staff where  age < 30; Select Count(name) as Total_staff From staff; END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `get_avg_salary` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_avg_salary`()
BEGIN 
Select * from staff; select avg(salary) as avg_salary from staff; END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `info` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `info`()
BEGIN
DECLARE name varchar(100);
DECLARE country varchar(100);
DECLARE room_number varchar(50);
DECLARE found int DEFAULT 0;
DECLARE get_cursor CURSOR FOR SELECT  customer.name , customer.country, room From customer ;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET found = 1;
OPEN get_cursor;
get_loop : LOOP
FETCH FROM get_cursor INTO name,country,room_number;
IF found = 1 THEN LEAVE get_loop;
END IF;
SELECT name, country,room_number;
END LOOP get_loop;
CLOSE get_cursor;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-16 20:53:23
