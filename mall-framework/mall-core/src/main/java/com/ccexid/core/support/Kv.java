package com.ccexid.core.support;

import com.ccexid.core.utils.Func;
import org.springframework.util.LinkedCaseInsensitiveMap;

import java.util.Map;

public class Kv<T> extends LinkedCaseInsensitiveMap<T> {
    private Kv() {
    }

    /**
     * 创建一个新的Kv实例
     *
     * @param <T> 泛型类型参数，表示Kv中存储的值的类型
     * @return 返回新创建的Kv实例
     */
    public static <T> Kv<T> create() {
        return new Kv<>();
    }

    /**
     * 设置键值对
     *
     * @param key   键名
     * @param value 值
     * @return 返回当前Kv对象，支持链式调用
     */
    public Kv<T> set(String key, T value) {
        put(key, value);
        return this;
    }

    /**
     * 当值不为null时，设置键值对
     *
     * @param key   键名
     * @param value 值对象，当该值不为null时才会被设置
     * @return 返回当前Kv对象，支持链式调用
     */
    public Kv<T> setIfNotNull(String key, T value) {
        // 当值不为null时才进行设置操作
        if (value != null && key != null) {
            put(key, value);
        }
        return this;
    }


    /**
     * 获取指定键名的值
     *
     * @param attr         键名
     * @param defaultValue 默认值s
     * @return 返回指定键名的值，如果键名不存在则返回默认值
     */
    @SuppressWarnings("unchecked")
    public T get(String attr, T defaultValue) {
        Object result = this.get(attr);
        return (T) (Func.isNotNone(result) ? result : defaultValue);
    }


    /**
     * 将指定映射中的所有键值对添加到当前Kv对象中
     *
     * @param map 要添加的映射，键为String类型，值为T类型，可以为null
     * @return 返回当前Kv对象实例，支持链式调用
     */
    public Kv<T> setAll(Map<? extends String, ? extends T> map) {
        // 如果传入的映射不为null，则将其所有键值对添加到当前对象中
        if (map != null) {
            this.putAll(map);
        }
        return this;
    }

    /**
     * 创建当前Kv对象的副本
     *
     * @return 返回一个新的Kv对象，包含与当前对象相同的所有键值对
     */
    @Override
    public Kv<T> clone() {
        // 创建新的Kv实例并复制所有键值对
        Kv<T> clone = new Kv<>();
        clone.putAll(this);
        return clone;
    }


}

