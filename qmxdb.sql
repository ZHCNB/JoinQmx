/*
Navicat MySQL Data Transfer

Source Server         : loaclhost
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : qmxdb

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-12-04 22:09:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for stu_info
-- ----------------------------
DROP TABLE IF EXISTS `stu_info`;
CREATE TABLE `stu_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(50) NOT NULL,
  `sex` varchar(2) NOT NULL,
  `number` varchar(15) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `academy` varchar(50) DEFAULT NULL,
  `major` varchar(50) NOT NULL,
  `classes` varchar(20) NOT NULL,
  `stu_time` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu_info
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'admin', 'ctguqmx');
INSERT INTO `users` VALUES ('2', 'admin', 'ctguqmx');
