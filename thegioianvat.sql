-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 11, 2020 at 04:35 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `thegioianvat`
--

-- --------------------------------------------------------

--
-- Table structure for table `loaimonan`
--

CREATE TABLE IF NOT EXISTS `loaimonan` (
`idloaimonan` int(11) NOT NULL,
  `tenloaimonan` varchar(200) NOT NULL,
  `hinhanhloaimonan` varchar(2000) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `loaimonan`
--

INSERT INTO `loaimonan` (`idloaimonan`, `tenloaimonan`, `hinhanhloaimonan`) VALUES
(1, 'Thức ăn', 'https://w7.pngwing.com/pngs/518/962/png-transparent-fast-food-drink-junk-food-eating-food-icon-food-text-logo.png'),
(2, 'Nước giải khát', 'https://image.flaticon.com/icons/png/512/1880/1880417.png');

-- --------------------------------------------------------

--
-- Table structure for table `monan`
--

CREATE TABLE IF NOT EXISTS `monan` (
`idmonan` int(11) NOT NULL,
  `tenmonan` varchar(200) NOT NULL,
  `giamonan` int(15) NOT NULL,
  `hinhanhmonan` varchar(300) NOT NULL,
  `mota` varchar(10000) NOT NULL,
  `idloaimonan` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `monan`
--

INSERT INTO `monan` (`idmonan`, `tenmonan`, `giamonan`, `hinhanhmonan`, `mota`, `idloaimonan`) VALUES
(1, 'Sữa tươi trân châu đường đen', 27000, 'https://kyquan.000webhostapp.com/public/upload/product/15369872860s.jpg', 'Sữa tươi', 2),
(2, 'Sữa tươi Chocolate TCĐĐ', 32000, 'https://kyquan.000webhostapp.com/public/upload/product/1536987718socodau.jpg', 'Sữa tươi', 2),
(3, 'Sữa tươi hoa đậu biếc TCĐĐ', 32000, 'https://kyquan.000webhostapp.com/public/upload/product/15369873160s3.jpg', 'Sữa tươi', 2),
(4, 'Sữa tươi trà xanh TCĐĐ', 32000, 'https://kyquan.000webhostapp.com/public/upload/product/15369872180s1.jpg', 'Sữa tươi', 2),
(5, 'Sữa tươi hoa đậu biếc TCĐĐ Kem cheese', 38000, 'https://kyquan.000webhostapp.com/public/upload/product/15369871990s4.jpg', 'Sữa tươi', 2),
(6, 'Sữa tươi Chocolate TCĐĐ Kem cheese', 38000, 'https://kyquan.000webhostapp.com/public/upload/product/15369871830s.jpg', 'Sữa tươi', 2),
(7, 'Sữa tươi trà xanh TCĐĐ Kem cheese', 38000, 'https://kyquan.000webhostapp.com/public/upload/product/15369871691bo.jpg', 'Sữa tươi', 2),
(8, 'Trà sữa dâu', 24000, 'https://kyquan.000webhostapp.com/public/upload/product/1536982364tra-dau.jpg', 'Trà sữa', 2),
(9, 'Trà sữa bạc hà', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536982345hong-tra-sua.png', 'Trà sữa', 2),
(10, 'Trà sữa việt quất', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536982319tra-sua-khoai.jpg', 'Trà sữa', 2),
(11, 'Trà sữa Matcha', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536982298hong-tra-sua.png', 'Trà sữa', 2),
(12, 'Trà sữa Tiramisu', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536982279sinh-to-dau-yogurt.png', 'Trà sữa', 2),
(13, 'Trà sữa Socola', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536982257socodau.jpg', 'Trà sữa', 2),
(15, 'Trà sữa dâu socola', 30000, 'https://kyquan.000webhostapp.com/public/upload/product/1536982214soco.jpg', 'Trà sữa', 2),
(16, 'Trà sữa Hokaidu', 28000, 'https://kyquan.000webhostapp.com/public/upload/product/1536982189tra-sua-khoai.jpg', 'Trà sữa', 2),
(17, 'Nước ép táo', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536984838ep2.jpg', 'Nước ép', 2),
(18, 'Nước ép dưa hấu', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536984820ep4.jpg', 'Nước ép', 2),
(19, 'Nước ép chanh leo', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536984802ep3.jpg', 'Nước ép', 2),
(20, 'Nước ép ổi', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536984787ep1.jpg', 'Nước ép', 2),
(21, 'Nước ép dứa', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536984758ep5.jpg', 'Nước ép', 2),
(22, 'Sinh tố xoài', 28000, 'https://kyquan.000webhostapp.com/public/upload/product/15369855111xoai.jpg', 'Sinh tố', 2),
(23, 'Sinh tố bơ\r\n', 28000, 'https://kyquan.000webhostapp.com/public/upload/product/15369854981bo.jpg', 'Sinh tố', 2),
(24, 'Sinh tố dưa hấu', 28000, 'https://kyquan.000webhostapp.com/public/upload/product/1536985481ep4.jpg', 'Sinh tố', 2),
(25, 'Sinh tố sữa chua coffee', 28000, 'https://kyquan.000webhostapp.com/public/upload/product/1536985554soco.jpg', 'Sinh tố', 2),
(26, 'Sinh tố mãng cầu', 38000, 'https://kyquan.000webhostapp.com/public/upload/product/15369854591mangcau.jpg', 'Sinh tố', 2),
(27, 'Sinh tố cam tươi', 32000, 'https://kyquan.000webhostapp.com/public/upload/product/15369854461cam.jpg', 'Sinh tố', 2),
(28, 'Sinh tố chanh leo', 38000, 'https://kyquan.000webhostapp.com/public/upload/product/15369854301chanh.jpg', 'Sinh tố', 2),
(29, 'Pizza Rib BBQ', 80000, 'https://kyquan.000webhostapp.com/public/upload/product/1536765519salad.jpg', 'Pizza', 1),
(30, 'Pizza Procitto', 80000, 'https://kyquan.000webhostapp.com/public/upload/product/1536765794piza.jpg', 'Pizza', 1),
(31, 'Pizza Margarita\r\n', 80000, 'https://kyquan.000webhostapp.com/public/upload/product/1536765431piza.jpg', 'Pizza', 1),
(32, 'Pizza Rib BBQ', 80000, 'https://kyquan.000webhostapp.com/public/upload/product/1536765519salad.jpg', 'Pizza', 1),
(33, 'Pizza Procitto', 80000, 'https://kyquan.000webhostapp.com/public/upload/product/1536765794piza.jpg', 'Pizza', 1),
(34, 'Pizza Margarita\r\n', 80000, 'https://kyquan.000webhostapp.com/public/upload/product/1536765431piza.jpg', 'Pizza', 1),
(35, 'Kem tươi Vani\r\n', 22000, 'https://kyquan.000webhostapp.com/public/upload/product/1536984102k11.jpg', 'Kem', 1),
(36, 'Kem tươi Capuchhino', 22000, 'https://kyquan.000webhostapp.com/public/upload/product/1536984086k66.jpg', 'Kem', 1),
(37, 'Kem tươi Chocolate', 22000, 'https://kyquan.000webhostapp.com/public/upload/product/1536984066k55.jpg', 'Kem', 1),
(38, 'Kem tươi chanh leo\r\n', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536984046k44.jpg', 'Kem', 1),
(39, 'Kem tươi sữa dừa', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536984025k33.jpg', 'Kem', 1),
(40, 'Kem tươi dâu tây', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536983998k22.jpg', 'Kem ', 1),
(41, 'Kem tươi khoai môn\r\n', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536983974k11.jpg', 'Kem', 1),
(42, 'Kem tươi trà xanh\r\n', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1536983951k66.jpg', 'Kem', 1),
(43, 'Kem tươi việt quất\r\n', 30000, 'https://kyquan.000webhostapp.com/public/upload/product/1536983928k55.jpg', 'Kem', 1),
(44, 'Kem tươi Hokaido\r\n', 30000, 'https://kyquan.000webhostapp.com/public/upload/product/1536983902k44.jpg', 'Kem', 1),
(45, 'Kem tươi Latea sầu riêng\r\n', 28000, 'https://kyquan.000webhostapp.com/public/upload/product/1536983873k33.jpg', 'Kem', 1),
(46, 'Kem tươi Rum nho\r\n', 34000, 'https://kyquan.000webhostapp.com/public/upload/product/1536983842k22.jpg', 'Kem', 1),
(47, 'Đùi gà chiên KFC\r\n', 30000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703101piza.jpg', 'FastFood', 1),
(48, 'Cánh gà BBQ\r\n', 28000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703101piza.jpg', 'FastFood', 1),
(49, 'Chân gà ngâm xả tắc\r\n', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703101piza.jpg', 'FastFood', 1),
(50, 'Gà khô lá chanh\r\n', 30000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703101piza.jpg', 'FastFood', 1),
(51, 'Ngô chiên\r\n', 20000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703101piza.jpg', 'FastFood', 1),
(52, 'Nem chua rán\r\n', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703101piza.jpg', 'FastFood', 1),
(53, 'Phomai que\r\n', 20000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703101piza.jpg', 'FastFood', 1),
(54, 'Xúc xích chiên\r\n', 30000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703101piza.jpg', 'FastFood', 1),
(55, 'Cá viên chiên\r\n', 30000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703101piza.jpg', 'FastFood', 1),
(56, 'Tôm viên chiên\r\n', 30000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703101piza.jpg', 'FastFood', 1),
(57, 'Khoai tây chiên\r\n', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703917piza.jpg', 'FastFood', 1),
(58, 'Khoai lang chiên\r\n', 30000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703917piza.jpg', 'FastFood', 1),
(59, 'Khoai môn lệ phố\r\n', 20000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703917piza.jpg', 'FastFood', 1),
(60, 'Salad Đà Lạt\r\n', 25000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703917piza.jpg', 'FastFood', 1),
(61, 'Nôm tai heo gà cay\r\n', 40000, 'https://kyquan.000webhostapp.com/public/upload/product/1533703917piza.jpg', 'FastFood', 1),
(62, 'Mẹt 1\r\n', 100000, 'https://kyquan.000webhostapp.com/public/upload/product/1534849844thit.jpg', 'Mẹt ăn vặt', 1),
(63, 'Mẹt 2', 120000, 'https://kyquan.000webhostapp.com/public/upload/product/1534849844thit.jpg', 'Mẹt ăn vặt', 1),
(64, 'Mẹt 3', 140000, 'https://kyquan.000webhostapp.com/public/upload/product/1534849844thit.jpg', 'Mẹt ăn vặt', 1),
(65, 'Mẹt 4', 160000, 'https://kyquan.000webhostapp.com/public/upload/product/1534849844thit.jpg', 'Mẹt ăn vặt', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `loaimonan`
--
ALTER TABLE `loaimonan`
 ADD PRIMARY KEY (`idloaimonan`);

--
-- Indexes for table `monan`
--
ALTER TABLE `monan`
 ADD PRIMARY KEY (`idmonan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `loaimonan`
--
ALTER TABLE `loaimonan`
MODIFY `idloaimonan` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `monan`
--
ALTER TABLE `monan`
MODIFY `idmonan` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=66;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
