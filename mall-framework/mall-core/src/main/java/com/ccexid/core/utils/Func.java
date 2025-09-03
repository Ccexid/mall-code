package com.ccexid.core.utils;

import java.util.Objects;

public class Func {
    /**
     * 判断对象是否为空
     *
     * @param o 对象
     * @return true:对象为空
     */
    public static boolean isNone(Object o) {
        return Objects.isNull(o);
    }

    /**
     * 判断对象是否不为空
     *
     * @param o 对象
     * @return true:对象不为空
     */
    public static boolean isNotNone(Object o) {
        return !isNone(o);
    }
}
