package com.ccexid.core.mybatis.listener;

import com.ccexid.core.utils.DigestUtils;
import com.mybatisflex.annotation.SetListener;

public class DigestSetListener implements SetListener {
    /**
     * 当设置属性值时的回调方法，对非空值进行加密处理
     *
     * @param entity   实体对象
     * @param property 属性名称
     * @param value    属性值
     * @return 处理后的属性值，如果原值不为null则返回加密后的值，否则返回原值
     */
    @Override
    public Object onSet(Object entity, String property, Object value) {
        if (null != value) {
            // 当value 不为 null 时，对 value 进行加密
            value = DigestUtils.digest(value.toString());
        }
        return value;
    }

}
