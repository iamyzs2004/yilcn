/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50621
Source Host           : 127.0.0.1:3306
Source Database       : yilcn

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2019-10-27 21:58:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for moneyinfo
-- ----------------------------
DROP TABLE IF EXISTS `moneyinfo`;
CREATE TABLE `moneyinfo` (
  `userId` varchar(32) DEFAULT NULL,
  `money` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of moneyinfo
-- ----------------------------
INSERT INTO `moneyinfo` VALUES ('u1', '1.00');
INSERT INTO `moneyinfo` VALUES ('u1', '1.00');

-- ----------------------------
-- Table structure for orderinfo
-- ----------------------------
DROP TABLE IF EXISTS `orderinfo`;
CREATE TABLE `orderinfo` (
  `userId` varchar(32) DEFAULT NULL COMMENT '用户ID',
  `orderId` varchar(32) DEFAULT NULL COMMENT '订单ID',
  `productId` varchar(32) DEFAULT NULL COMMENT '产品ID',
  `productPrice` decimal(10,2) DEFAULT NULL COMMENT '商品单价',
  `salesum` int(4) DEFAULT NULL COMMENT '商品数量'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of orderinfo
-- ----------------------------
INSERT INTO `orderinfo` VALUES ('u1', 'o1', 'p1', '10.00', '2');
INSERT INTO `orderinfo` VALUES ('u1', 'o1', 'p1', '10.00', '2');

-- ----------------------------
-- Table structure for stockinfo
-- ----------------------------
DROP TABLE IF EXISTS `stockinfo`;
CREATE TABLE `stockinfo` (
  `productId` varchar(32) DEFAULT NULL,
  `stocksum` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of stockinfo
-- ----------------------------
