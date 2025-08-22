package com.ccexid.core.domain;

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

    /**
     * 构建ResultEntity对象的通用方法
     *
     * @param <T> 返回数据的泛型类型
     * @param code 状态码
     * @param message 返回消息
     * @param data 返回的数据内容
     * @return 包含指定状态码、消息和数据的ResultEntity对象
     */
    public static <T> ResultEntity<T> builder(final int code, final String message, final T data) {
        return new ResultEntity<>(code, message, data);
    }

}
