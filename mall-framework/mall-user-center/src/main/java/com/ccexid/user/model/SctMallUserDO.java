package com.ccexid.user.model;

import com.ccexid.core.domain.BaseEntity;
import com.ccexid.core.mybatis.DigestTypeHandler;
import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import com.mybatisflex.core.keygen.KeyGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.util.Date;

/**
 * SCT商城用户实体类，对应数据库表 sct_mall_user。
 * 该类继承自 BaseEntity，用于表示系统中的用户信息。
 */
@Table(value = "sct_mall_user")
@Data(staticConstructor = "create")
@EqualsAndHashCode(callSuper = true)
public class SctMallUserDO extends BaseEntity<SctMallUserDO> {
    @Serial
    private final static long serialVersionUID = 1L;

    /**
     * 用户ID，主键，使用UUID生成器生成唯一标识
     */
    @Id(keyType = KeyType.Generator, value = KeyGenerators.uuid, comment = "用户ID")
    private String userId;

    /**
     * 关联第三方主体ID（如会员体系ID）
     */
    @Column(comment = "关联第三方主体ID（如会员体系ID）")
    private String partyId;

    /**
     * 登录用户名
     */
    @Column(comment = "登录用户名")
    private String username;

    /**
     * 安全验证词（密码保护答案）
     */
    @Column(comment = "安全验证词（密码保护答案）")
    private String securityWord;

    /**
     * 加密存储的登录密码，使用 DigestTypeHandler 进行处理
     */
    @Column(typeHandler = DigestTypeHandler.class, comment = "加密存储的登录密码")
    private String password;

    /**
     * 是否启用（1=启用，0=禁用）
     */
    @Column(value = "is_enabled", comment = "是否启用（1=启用，0=禁用）")
    private boolean enabled;

    /**
     * 备注信息
     */
    @Column(comment = "备注信息")
    private String remark;

    /**
     * 最后登录时间
     */
    @Column(comment = "最后登录时间")
    private Date lastLoginTime;

    /**
     * 登录IP地址
     */
    @Column(comment = "登录IP地址")
    private String loginIp;

    /**
     * 电子邮箱
     */
    @Column(comment = "电子邮箱")
    private String email;

    /**
     * 谷歌认证密钥
     */
    @Column(comment = "谷歌认证密钥")
    private String googleAuthSecret;

    /**
     * 是否绑定谷歌认证（1=已绑定，0=未绑定）
     */
    @Column(comment = "是否绑定谷歌认证（1=已绑定，0=未绑定）")
    private boolean googleAuthBund;

    /**
     * 用户类型（关联字典表 type_code）
     */
    @Column(comment = "用户类型（关联字典表type_code")
    private Integer userType;

}
