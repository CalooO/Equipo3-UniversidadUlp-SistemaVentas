-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-10-2023 a las 21:04:39
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fravemax`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `telefono` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `apellido`, `nombre`, `domicilio`, `telefono`) VALUES
(1, 'Sanz', 'Allison', 'Austria 2301', '1142414326'),
(2, 'Campos', 'Josefa', 'Pueyrredon 1723', '2657434498'),
(3, 'Campos', 'Josefa', 'Pueyrredon 1723', '2657434498'),
(4, 'Ruiz', 'Ximena', 'Costa Eduardo 2136', '1147930839'),
(5, 'Bravo', 'Fernando', 'Rivadavia 260', '2920425919'),
(6, 'Garcia', 'Mario', 'M Salesianos 91', '1142576558'),
(7, 'Benitez ', 'Manuela ', ' Belgrano 101', '1147461036'),
(8, 'Fernández ', 'Lucía', 'Roberto Payro 520', '1142831270'),
(9, 'Dávila', 'Lucía ', 'J L De Atucha 795', '3487442626'),
(10, 'Vazquez', 'Ana Sofía', 'Fuerte Independencia 254', '2945450145'),
(11, 'Ortiz ', 'Ana Paula', 'Rodriguez Pe A 2047 ', '1148144959'),
(12, 'Blanco ', 'Fernando ', 'Alem 178', '2293425674'),
(13, 'Domínguez ', 'Elizabeth ', 'Parana 266', '2374634367'),
(14, 'Escalante ', 'Simón ', 'Cuzco 508 ', '2954455284'),
(15, 'Rojas ', 'Dylan ', 'Andalgala 3893', '1146421188'),
(16, 'de Anda', 'Adriana', 'Lamadrid 345', '1143719537'),
(17, 'Gracia ', 'Aarón ', 'Av. Hipolito Irigoyen 4147', '2914516224'),
(18, 'Gómez ', 'Martín ', 'Estrada 148', '1142414326'),
(19, 'Muñoz ', 'Luis', 'Mazza 858', '3822450638');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleventa`
--

CREATE TABLE `detalleventa` (
  `idDetalleVenta` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `idVenta` int(11) NOT NULL,
  `precioVenta` double NOT NULL,
  `idProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalleventa`
--

INSERT INTO `detalleventa` (`idDetalleVenta`, `cantidad`, `idVenta`, `precioVenta`, `idProducto`) VALUES
(1, 1, 2, 427499.05, 1),
(2, 3, 3, 409496.85000000003, 5),
(3, 3, 4, 370497.14999999997, 5),
(4, 1, 5, 434149.05, 11),
(5, 2, 6, 419997.9, 6),
(6, 1, 7, 129999, 5),
(7, 3, 8, 1247396.85, 14),
(8, 1, 9, 246999.05, 9),
(9, 2, 10, 944997.9, 8),
(10, 1, 11, 427499.05, 8),
(11, 2, 12, 634598.1, 13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombreProducto` varchar(30) NOT NULL,
  `descripcion` varchar(120) NOT NULL,
  `precioActual` double NOT NULL,
  `stock` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombreProducto`, `descripcion`, `precioActual`, `stock`, `estado`) VALUES
(1, 'Lavarropas', 'Dream', 449999, 5, 1),
(2, 'Lavarropas', 'Gafa', 217399, 8, 0),
(3, 'Lavarropas', 'Whirlpool', 498999, 13, 1),
(4, 'Lavarropas', 'Electrolux', 295599, 16, 1),
(5, 'Televisor', 'Samsung', 129999, 5, 1),
(6, 'Televisor', 'Admiral', 199999, 4, 1),
(7, 'Televisor', 'Hyundai', 176999, 8, 0),
(8, 'Televisor', 'Philips', 449999, 13, 1),
(9, 'Heladera', 'Gafa', 259999, 9, 1),
(10, 'Heladera', 'Dream', 499999, 8, 1),
(11, 'Heladera', 'LG', 456999, 4, 1),
(12, 'Heladera', 'Philco', 182874, 14, 0),
(13, 'Aire acondicionado', 'Likon', 333999, 12, 1),
(14, 'Aire acondicionado', 'BGH', 395999, 9, 1),
(15, 'Aire acondicionado', 'Noblex', 459900, 7, 1),
(81, 'Televisor', 'Philips', 449999, 16, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idVenta` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `fechaVenta` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idVenta`, `idCliente`, `fechaVenta`) VALUES
(1, 1, '2023-10-04'),
(2, 2, '2023-10-02'),
(3, 5, '2023-10-06'),
(4, 6, '2023-10-06'),
(5, 1, '2023-06-06'),
(6, 15, '2023-03-30'),
(7, 19, '2023-10-11'),
(8, 5, '2023-09-20'),
(9, 9, '2023-09-30'),
(10, 10, '2023-07-13'),
(11, 18, '2023-06-05'),
(12, 3, '2023-01-19');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD PRIMARY KEY (`idDetalleVenta`),
  ADD KEY `idVenta` (`idVenta`),
  ADD KEY `idProducto` (`idProducto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`idVenta`),
  ADD KEY `idCliente` (`idCliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  MODIFY `idDetalleVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=82;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD CONSTRAINT `detalleventa_ibfk_1` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`),
  ADD CONSTRAINT `detalleventa_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
