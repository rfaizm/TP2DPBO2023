-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 12, 2023 at 05:49 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_app`
--

-- --------------------------------------------------------

--
-- Table structure for table `desc_film`
--

CREATE TABLE `desc_film` (
  `id` int(11) NOT NULL,
  `judul` varchar(255) DEFAULT NULL,
  `sutradara` varchar(255) DEFAULT NULL,
  `produksi` varchar(255) DEFAULT NULL,
  `genre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `desc_film`
--

INSERT INTO `desc_film` (`id`, `judul`, `sutradara`, `produksi`, `genre`) VALUES
(1, 'DeadPool', 'Rachman', 'Marvel', 'Sci-fi, Action, Romance'),
(2, 'Cars 4', 'Nelly', 'Pixar', 'Action, Comedy, Adventure, Animation');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `email`, `password`) VALUES
(1, 'admin@gmail.com', 'admin'),
(2, 'admin1@gmail.com', 'admin1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `desc_film`
--
ALTER TABLE `desc_film`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `desc_film`
--
ALTER TABLE `desc_film`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
