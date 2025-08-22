package com.ccexid.core.entity;

import java.io.Serial;
import java.io.Serializable;

/**
 * 返回结果实体
 *
 * @param code    状态码
 * @param message 提示信息
 * @param data    数据
 * @param <T>     数据类型
 */
public record ResultEntity<T>(
        int code,
        String message,
        T data
) implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

}
