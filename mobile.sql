-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 19, 2023 at 05:27 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mobile`
--

-- --------------------------------------------------------

--
-- Table structure for table `customerdetails`
--

CREATE TABLE `customerdetails` (
  `customerId` text NOT NULL,
  `name` text NOT NULL,
  `address` text NOT NULL,
  `city` text NOT NULL,
  `email` text NOT NULL,
  `mobile` text NOT NULL,
  `DOB` text NOT NULL,
  `state` text NOT NULL,
  `pincode` text NOT NULL,
  `gender` text NOT NULL,
  `reference` text NOT NULL,
  `aadhar` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `dealerdetails`
--

CREATE TABLE `dealerdetails` (
  `dealerId` text NOT NULL,
  `name` text NOT NULL,
  `address` text NOT NULL,
  `email` text NOT NULL,
  `city` text NOT NULL,
  `mobile` text NOT NULL,
  `DOB` text NOT NULL,
  `state` text NOT NULL,
  `pincode` text NOT NULL,
  `gender` text NOT NULL,
  `GST` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `models`
--

CREATE TABLE `models` (
  `Brand` text NOT NULL,
  `Model` text NOT NULL,
  `ROM` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `newmobile`
--

CREATE TABLE `newmobile` (
  `name` text NOT NULL,
  `mobile` text NOT NULL,
  `quantity` text NOT NULL,
  `marketPrice` text NOT NULL,
  `purchacePrice` text NOT NULL,
  `purchasingDate` text NOT NULL,
  `accessories` text NOT NULL,
  `Brand` text NOT NULL,
  `Model` text NOT NULL,
  `ROM` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `oldmobile`
--

CREATE TABLE `oldmobile` (
  `name` text NOT NULL,
  `mobile` text NOT NULL,
  `quantity` text NOT NULL,
  `marketPrice` text NOT NULL,
  `purchacePrice` text NOT NULL,
  `purchasingDate` text NOT NULL,
  `accessories` text NOT NULL,
  `Brand` text NOT NULL,
  `Model` text NOT NULL,
  `ROM` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `name` text NOT NULL,
  `email` text NOT NULL,
  `phone` text NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `repair`
--

CREATE TABLE `repair` (
  `name` text NOT NULL,
  `mobile` text NOT NULL,
  `mobileDetails` text NOT NULL,
  `repair` text NOT NULL,
  `arrivalDate` text NOT NULL,
  `returnDate` text NOT NULL,
  `repairStatus` text NOT NULL,
  `returnStatus` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
