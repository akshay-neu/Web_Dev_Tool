delimiter $$

CREATE TABLE `adverttable` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `message` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `user` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_advert_user` (`user`),
  CONSTRAINT `fk_advert_user` FOREIGN KEY (`user`) REFERENCES `usertable` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1$$