-- phpMyAdmin SQL Dump
-- version phpStudy 2014
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2017 年 07 月 08 日 06:25
-- 服务器版本: 5.5.53
-- PHP 版本: 5.4.45

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `cms`
--

-- --------------------------------------------------------

--
-- 表的结构 `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `admin_id` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(20) NOT NULL,
  `admin_pwd` varchar(10) NOT NULL,
  `admin_right` tinyint(2) DEFAULT '1',
  PRIMARY KEY (`admin_id`),
  UNIQUE KEY `admin_name` (`admin_name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=16 ;

--
-- 转存表中的数据 `admin`
--

INSERT INTO `admin` (`admin_id`, `admin_name`, `admin_pwd`, `admin_right`) VALUES
(1, 'root', 'root', 1),
(2, 'root1', 'root1', 1),
(3, 'root3', 'root3', 1),
(4, '123', '123', 0);

-- --------------------------------------------------------

--
-- 表的结构 `article`
--

CREATE TABLE IF NOT EXISTS `article` (
  `article_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(20) NOT NULL,
  `user_id` int(5) NOT NULL,
  `summary` varchar(50) NOT NULL,
  `content` varchar(255) NOT NULL,
  `readtimes` int(4) DEFAULT '0',
  `hits` int(4) DEFAULT '0',
  `channel_id` int(10) NOT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

--
-- 转存表中的数据 `article`
--

INSERT INTO `article` (`article_id`, `title`, `user_id`, `summary`, `content`, `readtimes`, `hits`, `channel_id`) VALUES
(1, 'JSP教程', 1, 'JSPJSPJSP', '					 \r\n					 ', 0, 0, 6),
(2, 'ORCALE教程', 1, 'ORCALEORCALE', '					 \r\n					 \r\n					 \r\n					 \r\n					 ', 0, 0, 1);

-- --------------------------------------------------------

--
-- 表的结构 `channel`
--

CREATE TABLE IF NOT EXISTS `channel` (
  `channel_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `channel_name` varchar(20) NOT NULL,
  `isshow` tinyint(2) DEFAULT '1',
  `isparent` tinyint(1) DEFAULT '0',
  `parent` int(10) DEFAULT NULL,
  PRIMARY KEY (`channel_id`),
  UNIQUE KEY `channel_name` (`channel_name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=27 ;

--
-- 转存表中的数据 `channel`
--

INSERT INTO `channel` (`channel_id`, `channel_name`, `isshow`, `isparent`, `parent`) VALUES
(1, '前端开发', 1, 1, NULL),
(2, '教程视频', 1, 1, NULL),
(3, 'HTML5', 1, 0, 1),
(4, 'javascript', 1, 0, 1),
(5, '投票', 1, 1, NULL),
(26, '123', 1, 0, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `comments`
--

CREATE TABLE IF NOT EXISTS `comments` (
  `comment_id` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `article_id` int(10) NOT NULL,
  `user_id` int(5) NOT NULL,
  `user_name` varchar(10) NOT NULL,
  `add_date` datetime NOT NULL,
  `com_content` varchar(255) NOT NULL,
  `ischecked` int(2) DEFAULT '0',
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `user_id` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(10) NOT NULL,
  `user_pwd` varchar(20) NOT NULL,
  `iscomment` tinyint(2) DEFAULT '1',
  `isvote` tinyint(2) DEFAULT '1',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=9 ;

--
-- 转存表中的数据 `user`
--

INSERT INTO `user` (`user_id`, `user_name`, `user_pwd`, `iscomment`, `isvote`) VALUES
(1, 'user1', '123', 1, 1),
(2, 'user2', '123', 1, 1),
(4, 'user3', '123', 0, 0),
(8, 'hhhhh', 'rjeo', 0, 0);

-- --------------------------------------------------------

--
-- 表的结构 `vote`
--

CREATE TABLE IF NOT EXISTS `vote` (
  `vote_id` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `vote_name` varchar(20) NOT NULL,
  `vote_content` varchar(255) NOT NULL,
  `vote_num` int(10) DEFAULT '0',
  PRIMARY KEY (`vote_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `vote`
--

INSERT INTO `vote` (`vote_id`, `vote_name`, `vote_content`, `vote_num`) VALUES
(1, '做课程设计难不难', '你本次课设是不是独立完成的？', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
