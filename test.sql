/*
Navicat MySQL Data Transfer

Source Server         : wsm_gh
Source Server Version : 50560
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2018-07-17 16:58:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for questions
-- ----------------------------
DROP TABLE IF EXISTS `questions`;
CREATE TABLE `questions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `q` char(200) DEFAULT NULL,
  `c1` char(40) DEFAULT NULL,
  `c2` char(40) DEFAULT NULL,
  `c3` char(40) DEFAULT NULL,
  `c4` char(40) DEFAULT NULL,
  `an` char(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of questions
-- ----------------------------
INSERT INTO `questions` VALUES ('1', 'hgurfiesolgufrijdlkysag8er9uaolhgiufroea', 'hgir', 'hgir9e', 'hgire', 'tyioe', 'B');
INSERT INTO `questions` VALUES ('2', 'hgieoralhgnbjdaigujr', 'hfiewo', 'gir', 'iuge', 'jgoid', 'D');
INSERT INTO `questions` VALUES ('3', 'hgieoralhgnbjdaiggfedsjujr', 'gir', 'ghifr', 'hgir', 'goer', 'A');
INSERT INTO `questions` VALUES ('4', 'ghiroepagkjsliuepygiro', 'girhgkfl', 'igegjh', 'goifd', 'jhgoio', 'C');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `score` int(11) DEFAULT NULL,
  `username` char(20) DEFAULT NULL,
  `password` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '0', 'HHH', 'hhh');
INSERT INTO `users` VALUES ('2', '25', 'tt', 'tt');
INSERT INTO `users` VALUES ('3', null, 'wsm_gh', '521168');
