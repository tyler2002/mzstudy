mzstudy
=======

a project just for yourself to note what you are learning

Now, you can use this project to note what you have learned and what you are learning simplely.


#Install
   jdk7.0  +  tomcat7.0  +  mysql5.5

create database study;  
use study;  
CREATE TABLE `study_notes` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `title` varchar(256) NOT NULL COMMENT '学习标题',  
  `href` varchar(256) DEFAULT NULL,  
  `note_content` mediumtext COMMENT '笔记内容',  
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;  

#Config  
   edit src\main\resources\conf\database.properties  to modify the db connection

#Start  
   start the tomcat and browse http://localhost:<port>/mzstudy
