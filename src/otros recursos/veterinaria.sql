-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 16-02-2023 a las 18:58:08
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `dni`, `apellido`, `nombres`, `domicilio`, `tel_movil`, `email`, `creado`) VALUES
(1, '5555555', 'GOMEZ', 'Jorge', 'manzanos 245', 55555, 'gato_feo@gmail.com', '2023-02-16 17:45:01'),
(2, '6778786', 'GOMEZ', 'Anfdres', 'manzanos 245', 55555, 'gato_feo@gmail.com', '2023-02-16 17:45:01'),
(3, '5895896', 'MELIAN', 'Gabriel', 'av del sol 245', 5689864, 'Melian@gmail.com', '2023-02-16 17:45:01'),
(4, '4585965', 'TOLOZA', 'Leonardo', 'av sol 456', 9123847, 'leoanrdo@gmail.com', '2023-02-16 18:15:25');

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `especie`
--

INSERT INTO `especie` (`id`, `especie`) VALUES
(1, 'Perro'),
(2, 'Serpiente'),
(3, 'Gato'),
(4, 'Pajaro');

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `historia_clinica`
--

INSERT INTO `historia_clinica` (`id`, `id_mascota`, `intervencion`, `creado`) VALUES
(1, 1, 'Se atencdioproque comioun rollopapel higienico marca CAMAPNITA\r\nCuandola sacudis suena', '2023-02-16 17:48:05'),
(2, 2, 'se comiomedio cordero, se administro reliveran', '2023-02-16 18:18:05'),
(3, 1, 'se verifico que dejo d ezonar laeel papel higieco, sele recomendoal dueñio no dejar papel en  el bidet', '2023-02-16 18:18:54');

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`id`, `id_especie`, `nombre`, `raza`, `nacido`, `tamanio`, `peso`, `color`, `id_status`, `id_cliente`, `chip`, `creado`) VALUES
(1, 2, 'Chiflona', 1, '2023-02-16 17:47:24', 2, 5, '', 1, 1, 1234467789, '2023-02-16 17:47:24'),
(2, 1, 'Cabezon', 2, '2023-02-16 18:12:51', 2, 15, '', 1, 2, 123446758, '2023-02-16 18:12:51');

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `raza`
--

INSERT INTO `raza` (`id`, `id_especie`, `raza`) VALUES
(1, 2, 'Piton'),
(2, 1, 'Labrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `status`
--

DROP TABLE IF EXISTS `status`;
CREATE TABLE IF NOT EXISTS `status` (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `status` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `status`
--

INSERT INTO `status` (`id`, `status`) VALUES
(1, 'Vivo'),
(2, 'Muerto');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tamanio`
--

DROP TABLE IF EXISTS `tamanio`;
CREATE TABLE IF NOT EXISTS `tamanio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `tamanio`
--

INSERT INTO `tamanio` (`id`, `descripcion`) VALUES
(1, 'Pequeño'),
(2, 'Mediano'),
(3, 'Grande'),
(4, 'Gigante');

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