-- 创建用户信息表
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

-- 初始化用户信息数据
INSERT INTO `user_info` (`id`, `nick_name`, `password`)
VALUES
	(1, 'Admin', '123456');

-- 创建职位信息表
CREATE TABLE `job_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `job_name` varchar(255) NOT NULL DEFAULT '' COMMENT '职位名称',
  `job_type` int(11) NOT NULL DEFAULT '0' COMMENT '职位类型',
  `job_location` varchar(255) NOT NULL DEFAULT '' COMMENT '工作地点',
  `work_time_beg` int(11) NOT NULL DEFAULT '0' COMMENT '工作年限下限0不限',
  `work_time_end` int(11) NOT NULL DEFAULT '0' COMMENT '工作年限上限0不限',
  `education` int(11) NOT NULL DEFAULT '0' COMMENT '学历要求1中专2高中3专科4本科5硕士6博士',
  `salary_beg` int(11) NOT NULL DEFAULT '0' COMMENT '薪资下限-单位k',
  `salary_end` int(11) NOT NULL DEFAULT '0' COMMENT '薪资上限-单位k',
  `release_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `add_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `del_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除标记',
  `remark` varchar(50) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='求职信息列表';
INSERT INTO `job_info` VALUES ('1', 'Java工程师', '1', '南京', '1', '3', '4', '8', '10');
