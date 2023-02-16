-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 16-02-2023 a las 19:00:11
-- Versión del servidor: 10.10.2-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `veterinaria`
--
CREATE DATABASE IF NOT EXISTS `veterinaria` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci;
USE `veterinaria`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dni` char(16) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `domicilio` varchar(50) NOT NULL,
  `tel_movil` int(11) NOT NULL,
  `email` varchar(250) NOT NULL,
  `creado` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  UNIQUE KEY `dni` (`dni`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especie`
--

DROP TABLE IF EXISTS `especie`;
CREATE TABLE IF NOT EXISTS `especie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `especie` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historia_clinica`
--

DROP TABLE IF EXISTS `historia_clinica`;
CREATE TABLE IF NOT EXISTS `historia_clinica` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_mascota` int(11) NOT NULL,
  `intervencion` text NOT NULL,
  `creado` timestamp NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_mascota` (`id_mascota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

DROP TABLE IF EXISTS `mascota`;
CREATE TABLE IF NOT EXISTS `mascota` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_especie` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `raza` int(11) NOT NULL DEFAULT 0,
  `nacido` timestamp NOT NULL,
  `tamanio` int(1) NOT NULL DEFAULT 0,
  `peso` int(11) NOT NULL DEFAULT 0,
  `color` varchar(50) NOT NULL,
  `id_status` int(1) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `chip` int(11) NOT NULL,
  `creado` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  KEY `ESPECIE` (`id_especie`) USING BTREE,
  KEY `DUENIO` (`id_cliente`),
  KEY `RAZA` (`raza`),
  KEY `TAMANIO` (`tamanio`),
  KEY `id_status` (`id_status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `raza`
--

DROP TABLE IF EXISTS `raza`;
CREATE TABLE IF NOT EXISTS `raza` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_especie` int(11) NOT NULL,
  `raza` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ESPECIE` (`id_especie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `status`
--

DROP TABLE IF EXISTS `status`;
CREATE TABLE IF NOT EXISTS `status` (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `status` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tamanio`
--

DROP TABLE IF EXISTS `tamanio`;
CREATE TABLE IF NOT EXISTS `tamanio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `historia_clinica`
--
ALTER TABLE `historia_clinica`
  ADD CONSTRAINT `historia_clinica_ibfk_1` FOREIGN KEY (`id_mascota`) REFERENCES `mascota` (`id`);

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`id_especie`) REFERENCES `especie` (`id`),
  ADD CONSTRAINT `mascota_ibfk_2` FOREIGN KEY (`raza`) REFERENCES `raza` (`id`),
  ADD CONSTRAINT `mascota_ibfk_3` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`),
  ADD CONSTRAINT `mascota_ibfk_4` FOREIGN KEY (`tamanio`) REFERENCES `tamanio` (`id`),
  ADD CONSTRAINT `mascota_ibfk_5` FOREIGN KEY (`id_status`) REFERENCES `status` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
