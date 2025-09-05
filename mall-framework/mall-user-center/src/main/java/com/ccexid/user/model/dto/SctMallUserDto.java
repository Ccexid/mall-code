package com.ccexid.user.model.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * SCT商城用户数据传输对象
 * 用于封装用户相关的数据信息，包括用户名、密码、邮箱等用户基本信息
 */
@Data
public class SctMallUserDto implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;

    /** 用户名 */
    private String username;

    /** 安全词 */
    private String securityWord;

    /** 密码 */
    private String password;

    /** 邮箱地址 */
    private String email;

    /** Google认证密钥 */
    private String googleAuthSecret;
}
