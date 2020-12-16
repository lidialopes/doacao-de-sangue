CREATE DATABASE  IF NOT EXISTS `doacao` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `doacao`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: doacao
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `doador`
--

DROP TABLE IF EXISTS `doador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `email` varchar(50) NOT NULL,
  `login` varchar(20) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `id_tipo_sanguineo` int(11) DEFAULT NULL,
  `id_endereco` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `login` (`login`),
  KEY `id_tipo_sanguineo` (`id_tipo_sanguineo`),
  KEY `id_endereco` (`id_endereco`),
  CONSTRAINT `doador_ibfk_1` FOREIGN KEY (`id_tipo_sanguineo`) REFERENCES `tipo_sanguineo` (`id`),
  CONSTRAINT `doador_ibfk_2` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doador`
--

LOCK TABLES `doador` WRITE;
/*!40000 ALTER TABLE `doador` DISABLE KEYS */;
INSERT INTO `doador` VALUES (1,'Lídia Helena','lidia@email.com','lidia','123',1,1),(12,'Livia','livia@email.com','livia','123',1,2),(13,'Tito','tito@email.com','tito','123',6,2);
/*!40000 ALTER TABLE `doador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endereco` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rua` varchar(45) NOT NULL,
  `cep` varchar(45) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `uf` varchar(2) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'Avenida Contorno Leste','65130000','Paço do Lumiar','Vila Manaíra','MA',-2.5332172,-44.1617137),(2,'Avenida Contorno Sul','65130000','Paço do Lumiar','Vila Manaíra','MA',-2.537606,-44.1637418);
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `necessitado`
--

DROP TABLE IF EXISTS `necessitado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `necessitado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `hospital` varchar(150) NOT NULL,
  `leito` varchar(45) NOT NULL,
  `obs` text,
  `id_tipo_sanguineo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_tipo_sanguineo` (`id_tipo_sanguineo`),
  CONSTRAINT `necessitado_ibfk_1` FOREIGN KEY (`id_tipo_sanguineo`) REFERENCES `tipo_sanguineo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `necessitado`
--

LOCK TABLES `necessitado` WRITE;
/*!40000 ALTER TABLE `necessitado` DISABLE KEYS */;
/*!40000 ALTER TABLE `necessitado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_sanguineo`
--

DROP TABLE IF EXISTS `tipo_sanguineo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_sanguineo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_sanguineo`
--

LOCK TABLES `tipo_sanguineo` WRITE;
/*!40000 ALTER TABLE `tipo_sanguineo` DISABLE KEYS */;
INSERT INTO `tipo_sanguineo` VALUES (1,'A+'),(2,'A-'),(3,'B+'),(4,'B-'),(5,'AB+'),(6,'AB-'),(7,'O+'),(8,'O-');
/*!40000 ALTER TABLE `tipo_sanguineo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-15 13:14:24
