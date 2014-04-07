-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 30, 2014 at 09:13 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `qsoft`
--

-- --------------------------------------------------------

--
-- Table structure for table `assets`
--

CREATE TABLE IF NOT EXISTS `assets` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) COLLATE utf16_vietnamese_ci NOT NULL,
  `price` float NOT NULL,
  `purchasedate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf16 COLLATE=utf16_vietnamese_ci AUTO_INCREMENT=5 ;

--
-- Dumping data for table `assets`
--

INSERT INTO `assets` (`id`, `name`, `price`, `purchasedate`) VALUES
(1, 'maytinh', 10, '2014-03-02'),
(2, 'chuot', 12, '2014-03-03'),
(3, 'banphim', 10, '2014-03-05'),
(4, 'camera', 19, '2014-03-12');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) COLLATE utf16_vietnamese_ci NOT NULL,
  `password` varchar(80) COLLATE utf16_vietnamese_ci NOT NULL,
  `address` varchar(80) COLLATE utf16_vietnamese_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf16 COLLATE=utf16_vietnamese_ci AUTO_INCREMENT=18 ;

-- --------------------------------------------------------

--
-- Table structure for table `user_assets`
--

CREATE TABLE IF NOT EXISTS `user_assets` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` int(10) NOT NULL,
  `assets_id` int(10) NOT NULL,
  `number` int(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf16 COLLATE=utf16_vietnamese_ci AUTO_INCREMENT=30 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
