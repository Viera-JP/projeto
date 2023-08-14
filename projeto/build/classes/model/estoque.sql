-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 02-Maio-2023 às 04:20
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `estoque`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `adm`
--

CREATE TABLE `adm` (
  `id` int(11) NOT NULL,
  `login` varchar(50) NOT NULL,
  `senha` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `adm`
--

INSERT INTO `adm` (`id`, `login`, `senha`) VALUES
(1, 'bob', 'pizza'),
(2, 'marina25', 'm123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `bebidas`
--

CREATE TABLE `bebidas` (
  `idBebidas` int(11) NOT NULL,
  `nomeBebidas` varchar(50) NOT NULL,
  `tamanho` varchar(6) NOT NULL,
  `quantidadeBebidas` int(11) NOT NULL,
  `valorUniBebidas` decimal(10,2) NOT NULL,
  `valorTotalBebidas` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `bebidas`
--

INSERT INTO `bebidas` (`idBebidas`, `nomeBebidas`, `tamanho`, `quantidadeBebidas`, `valorUniBebidas`, `valorTotalBebidas`) VALUES
(1, 'Pepsi', '1L', 2, '500.00', '30000.00'),
(2, 'Kaut', '2l', 200, '6.00', '1200.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `burguer`
--

CREATE TABLE `burguer` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `quantidade` varchar(50) NOT NULL,
  `valorUni` decimal(10,2) DEFAULT NULL,
  `valorTotal` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `burguer`
--

INSERT INTO `burguer` (`id`, `nome`, `quantidade`, `valorUni`, `valorTotal`) VALUES
(1, 'Pao', '300', '3.00', '900.00'),
(2, 'tomate', '400', '2.70', '1080.00'),
(3, 'queijo', '300', '2.75', '825.00'),
(4, 'pao frances', '2', '2.00', '4.00');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `adm`
--
ALTER TABLE `adm`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `bebidas`
--
ALTER TABLE `bebidas`
  ADD PRIMARY KEY (`idBebidas`);

--
-- Índices para tabela `burguer`
--
ALTER TABLE `burguer`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `adm`
--
ALTER TABLE `adm`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `bebidas`
--
ALTER TABLE `bebidas`
  MODIFY `idBebidas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `burguer`
--
ALTER TABLE `burguer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
