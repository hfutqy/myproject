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
  `job_location` varchar(255) NOT NULL DEFAULT '' COMMENT '工作地点（城市）',
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
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='求职信息列表';
INSERT INTO `job_info` (`id`, `job_name`, `job_type`, `job_location`, `work_time_beg`, `work_time_end`, `education`, `salary_beg`, `salary_end`)
VALUES ('1', 'Java工程师', '1', '南京', '1', '3', '4', '8', '10');

-- 职位信息详情表
CREATE TABLE `job_info_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `job_id` int(11) NOT NULL DEFAULT 0 COMMENT 'jobId',
  `job_company` varchar(255) NOT NULL DEFAULT '' COMMENT '职位发布公司',
  `job_company_descrip` TEXT COMMENT '职位发布公司简介',
  `work_place` varchar(255) NOT NULL DEFAULT '' COMMENT '详细工作地点',
  `job_poster` varchar(255) NOT NULL DEFAULT '' COMMENT '职位发布者',
  `job_poster_position` varchar(255) NOT NULL DEFAULT '' COMMENT '职位发布者工作身份',
  `job_descrip` TEXT COMMENT '职位详细描述',
  `add_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `del_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除标记',
  `remark` varchar(50) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='职位信息详情表';
INSERT INTO `job_info_detail` (`id`, `job_id`, `job_company`, `job_company_descrip`, `work_place`, `job_poster`, `job_poster_position`, `job_descrip`) VALUES ('1', '1', '阿里巴巴网络技术有限公司', '阿里巴巴网络技术有限公司（简称：阿里巴巴集团）是以曾担任英语教师的马云为首的18人于1999年在浙江杭州创立。\r\n阿里巴巴集团经营多项业务，另外也从关联公司的业务和服务中取得经营商业生态系统上的支援。业务和关联公司的业务包括：淘宝网、天猫、聚划算、全球速卖通、阿里巴巴国际交易市场、1688、阿里妈妈、阿里云、蚂蚁金服、菜鸟网络等。', '杭州市滨江区网商路699号1号楼3楼302室', '张三', 'HR', '写java的你懂得')

