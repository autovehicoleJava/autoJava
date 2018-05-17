-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 17 Mai 2018 la 16:43
-- Versiune server: 10.1.13-MariaDB
-- PHP Version: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `autovehicole`
--

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `cars`
--

CREATE TABLE `cars` (
  `id_car` int(11) NOT NULL,
  `category_car` varchar(100) NOT NULL,
  `mark_car` varchar(100) NOT NULL,
  `carBody_car` varchar(100) NOT NULL,
  `type_car` varchar(100) NOT NULL,
  `nrOmologare_an_car` varchar(100) NOT NULL,
  `nrSasiu_car` int(30) NOT NULL,
  `cutie_car` varchar(100) NOT NULL,
  `co2_car` int(3) NOT NULL,
  `color_car` varchar(30) NOT NULL,
  `dbA_m_car` int(3) NOT NULL,
  `dbA_s_car` int(3) NOT NULL,
  `km_h_car` int(3) NOT NULL,
  `air_bar_one_car` int(3) NOT NULL,
  `air_bar_tow_car` int(3) NOT NULL,
  `nrAxe_car` int(2) NOT NULL,
  `traction_car` varchar(30) NOT NULL,
  `l_rezervor_car` int(4) NOT NULL,
  `kg_self_car` int(5) NOT NULL,
  `kg_max_car` int(6) NOT NULL,
  `kg_max_aut_car` int(5) NOT NULL,
  `kg_max_hook_car` int(5) NOT NULL,
  `max_aut_ax_front_car` int(5) NOT NULL,
  `max_aut_ax_middle_car` int(5) NOT NULL,
  `max_aut_ax_back_car` int(5) NOT NULL,
  `max_aut_onTrack_car` int(5) NOT NULL,
  `trailer_with_brakes_car` int(5) NOT NULL,
  `trailer_without_brakes_car` int(5) NOT NULL,
  `nrSeats_total_car` int(4) NOT NULL,
  `nrSeats_onFront_car` int(1) NOT NULL,
  `nrSeats_standing_car` int(2) NOT NULL,
  `nrSeats_onTheSeats_car` int(3) NOT NULL,
  `tires_front_car` varchar(100) NOT NULL,
  `tires_else_front_car` varchar(100) NOT NULL,
  `tires_middle_back_car` varchar(100) NOT NULL,
  `tires_else_middle_back_car` varchar(100) NOT NULL,
  `engine_type_car` varchar(100) NOT NULL,
  `engine_series_car` varchar(100) NOT NULL,
  `engine_cm3_car` int(6) NOT NULL,
  `power_kW_min_car` int(10) NOT NULL,
  `fuel_car` varchar(30) NOT NULL,
  `length_car` int(10) NOT NULL,
  `width_kW_min_car` int(6) NOT NULL,
  `height_kW_min_car` int(6) NOT NULL,
  `date_car` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Salvarea datelor din tabel `cars`
--

INSERT INTO `cars` (`id_car`, `category_car`, `mark_car`, `carBody_car`, `type_car`, `nrOmologare_an_car`, `nrSasiu_car`, `cutie_car`, `co2_car`, `color_car`, `dbA_m_car`, `dbA_s_car`, `km_h_car`, `air_bar_one_car`, `air_bar_tow_car`, `nrAxe_car`, `traction_car`, `l_rezervor_car`, `kg_self_car`, `kg_max_car`, `kg_max_aut_car`, `kg_max_hook_car`, `max_aut_ax_front_car`, `max_aut_ax_middle_car`, `max_aut_ax_back_car`, `max_aut_onTrack_car`, `trailer_with_brakes_car`, `trailer_without_brakes_car`, `nrSeats_total_car`, `nrSeats_onFront_car`, `nrSeats_standing_car`, `nrSeats_onTheSeats_car`, `tires_front_car`, `tires_else_front_car`, `tires_middle_back_car`, `tires_else_middle_back_car`, `engine_type_car`, `engine_series_car`, `engine_cm3_car`, `power_kW_min_car`, `fuel_car`, `length_car`, `width_kW_min_car`, `height_kW_min_car`, `date_car`) VALUES
(1, 'Autoturism M1', 'Ford', 'Hatchback', 'DAW', '2002', 123456, 'Manuala', 146, 'Albastru', 85, 72, 160, 0, 0, 0, 'Fata', 45, 1340, 1750, 410, 750, 200, 0, 200, 0, 750, 550, 5, 2, 0, 3, '205 / 50R16 83U', '185 / 65R14 83Q M+S', '205 / 50R16 83U', '185 / 65R14 83Q M+S', '1.8 TDDI', '123658AD', 1789, 66, 'Diesel', 410, 180, 140, '2018-04-26'),
(2, 'Autoturism M2', 'Audi', 'Break', 'A4', '2014', 254125, 'Manuala', 118, 'Alb', 68, 62, 220, 0, 0, 0, 'Integrala', 60, 1800, 2460, 660, 750, 210, 0, 320, 0, 1100, 750, 5, 2, 0, 3, '205 / 50R16 83U', '185 / 65R14 83Q M+S', '205 / 50R16 83U', '185 / 65R14 83Q M+S', '19', '15488', 1898, 90, 'Diesel', 490, 195, 140, '2018-04-10');

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `owner`
--

CREATE TABLE `owner` (
  `id_owner` int(11) NOT NULL,
  `firstName_owner` varchar(50) NOT NULL,
  `lastName_owner` varchar(50) NOT NULL,
  `cnp_owner` int(13) NOT NULL,
  `nationality_owner` varchar(100) NOT NULL,
  `gender_owner` varchar(30) NOT NULL,
  `jud_owner` varchar(100) NOT NULL,
  `address_owner` varchar(200) NOT NULL,
  `date_owner` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Salvarea datelor din tabel `owner`
--

INSERT INTO `owner` (`id_owner`, `firstName_owner`, `lastName_owner`, `cnp_owner`, `nationality_owner`, `gender_owner`, `jud_owner`, `address_owner`, `date_owner`) VALUES
(1, 'Sas', 'Anamaria', 1234533, 'Romana', 'Feminin', 'Botosani', 'Botosani, str. Principala, nr. 3', '2018-04-26'),
(2, 'Alex', 'Calin', 145588266, 'Romana', 'Masculin', 'Alba', 'Alba Iulia, nr.14', '2018-04-10');

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `registered`
--

CREATE TABLE `registered` (
  `id_registered` int(11) NOT NULL,
  `nr_registered` varchar(100) NOT NULL,
  `date_registered` date NOT NULL,
  `revision_registered` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Salvarea datelor din tabel `registered`
--

INSERT INTO `registered` (`id_registered`, `nr_registered`, `date_registered`, `revision_registered`) VALUES
(1, 'B-69-SAS', '2018-04-26', '2017-08-15'),
(2, 'AB-01-FUK', '2018-04-10', '2018-03-05');

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `userName_user` varchar(30) NOT NULL,
  `firstName_user` varchar(30) NOT NULL,
  `lastName_user` varchar(30) NOT NULL,
  `address_user` text NOT NULL,
  `password_user` varchar(30) NOT NULL,
  `gender_user` varchar(30) NOT NULL,
  `function_user` varchar(30) NOT NULL,
  `jud_user` varchar(30) NOT NULL,
  `date_user` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Salvarea datelor din tabel `user`
--

INSERT INTO `user` (`id_user`, `userName_user`, `firstName_user`, `lastName_user`, `address_user`, `password_user`, `gender_user`, `function_user`, `jud_user`, `date_user`) VALUES
(14, 'ncalex', 'Nicula', 'Calin-Alexandru', 'Com. Almasu Mare, nr. 195', 'feb1893', 'Masculin', 'Administrator', 'Alba', '2018-04-15'),
(15, 'ana', 'Sas', 'Anamaria', 'Sat. Glod, nr. 69', 'maria', 'Feminin', 'Inspector', 'Bacau', '2018-04-30'),
(17, 'a', 'a', 'a', 'a', 'a', 'Feminin', 'Operator', 'Mehedinti', '1900-10-16'),
(18, 'r', 'r', 'r', 'r', 'r', 'Masculin', 'Operator', 'Valcia', '2018-04-01');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cars`
--
ALTER TABLE `cars`
  ADD PRIMARY KEY (`id_car`);

--
-- Indexes for table `owner`
--
ALTER TABLE `owner`
  ADD PRIMARY KEY (`id_owner`),
  ADD KEY `cnp_owner` (`cnp_owner`);

--
-- Indexes for table `registered`
--
ALTER TABLE `registered`
  ADD PRIMARY KEY (`id_registered`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cars`
--
ALTER TABLE `cars`
  MODIFY `id_car` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `owner`
--
ALTER TABLE `owner`
  MODIFY `id_owner` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `registered`
--
ALTER TABLE `registered`
  MODIFY `id_registered` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
