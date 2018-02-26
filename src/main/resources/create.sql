-- 创建图书表
CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `nick_name` varchar(100) NOT NULL COMMENT '用户昵称',
  `password` int(11) NOT NULL COMMENT '登陆密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- 初始化图书数据
INSERT INTO `user_info` (`id`, `nick_name`, `password`)
VALUES
	(1, 'Admin', '123456');
