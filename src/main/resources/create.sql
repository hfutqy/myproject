-- 创建图书表
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `nick_name` varchar(255) NOT NULL DEFAULT '' COMMENT '用户昵称',
  `password` varchar(255) NOT NULL DEFAULT '' COMMENT '登陆密码',
  `add_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `del_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除标记',
  `remark` varchar(50) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- 初始化图书数据
INSERT INTO `user_info` (`id`, `nick_name`, `password`)
VALUES
	(1, 'Admin', '123456');
