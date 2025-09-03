CREATE TABLE `sct_mall_user`
(
    `user_id`            varchar(32)  NOT NULL COMMENT '用户唯一标识（UUID）',
    `party_id`           varchar(32)  DEFAULT NULL COMMENT '关联第三方主体ID（如会员体系ID）',
    `username`           varchar(128) NOT NULL COMMENT '登录用户名',
    `security_word`      varchar(32)  DEFAULT NULL COMMENT '安全验证词（密码保护答案）',
    `password`           varchar(256) NOT NULL COMMENT '加密存储的登录密码',
    `is_enabled`         tinyint (1) NOT NULL DEFAULT 1 COMMENT '是否启用（1=启用，0=禁用）',
    `remark`             longtext COMMENT '备注信息',
    `last_login_time`    datetime     DEFAULT NULL COMMENT '最后登录时间',
    `login_ip`           varchar(128) DEFAULT NULL COMMENT '登录IP地址',
    `email`              varchar(255) DEFAULT NULL COMMENT '电子邮箱',
    `google_auth_secret` varchar(255) DEFAULT NULL COMMENT '谷歌认证密钥',
    `google_auth_bound`  BIT(1)       DEFAULT b'0' COMMENT '是否绑定谷歌认证（1=已绑定，0=未绑定）',
    `user_type`          varchar(20)  NOT NULL COMMENT '用户类型（关联字典表type_code）',
    `created_time`       datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_time`       datetime     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `deleted`            BIT(1) NULL DEFAULT b'0' COMMENT '是否删除：0-未删除，1-已删除（BIT类型，默认未删除）',
    PRIMARY KEY (`user_id`)
        USING BTREE,
    UNIQUE KEY `uk_username` (`username`)
        USING BTREE COMMENT '用户名唯一约束',
    KEY                  `idx_party_id` (`party_id`)
	USING BTREE COMMENT '第三方主体ID索引',
    KEY                  `idx_login_time` (`last_login_time`)
	USING BTREE COMMENT '登录时间索引（用于统计活跃用户）'
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COMMENT '商城用户基础信息表';