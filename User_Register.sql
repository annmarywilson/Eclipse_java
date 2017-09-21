-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Sep 21, 2017 at 10:47 AM
-- Server version: 5.6.14
-- PHP Version: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `User_Register`
--

-- --------------------------------------------------------

--
-- Table structure for table `Hobby`
--

CREATE TABLE IF NOT EXISTS `Hobby` (
  `USERNAME` varchar(20) NOT NULL,
  `Hobbies` varchar(50) NOT NULL,
  PRIMARY KEY (`USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Hobby`
--

INSERT INTO `Hobby` (`USERNAME`, `Hobbies`) VALUES
('aby1', ' Watching movies'),
('ann', ' Reading');

-- --------------------------------------------------------

--
-- Table structure for table `Table_1`
--

CREATE TABLE IF NOT EXISTS `Table_1` (
  `USERNAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  PRIMARY KEY (`USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Table_1`
--

INSERT INTO `Table_1` (`USERNAME`, `PASSWORD`) VALUES
('aby1', '123'),
('ann', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `table_PersonalInfo`
--

CREATE TABLE IF NOT EXISTS `table_PersonalInfo` (
  `USERNAME` varchar(50) NOT NULL DEFAULT '',
  `Address` varchar(50) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `Birthdate` varchar(20) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `table_PersonalInfo`
--

INSERT INTO `table_PersonalInfo` (`USERNAME`, `Address`, `Gender`, `Birthdate`, `Name`) VALUES
('aby1', 'delhi', 'Female', '1999-02-02', 'aby'),
('ann', 'asd', 'Female', '12/08/1256', 'Ann');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
