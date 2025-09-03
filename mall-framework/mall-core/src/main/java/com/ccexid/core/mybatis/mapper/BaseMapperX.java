package com.ccexid.core.mybatis.mapper;

import com.ccexid.core.domain.BaseEntity;
import com.mybatisflex.core.BaseMapper;

/**
 * 对BaseMapper 做增强扩展
 * 如果有什么新的功能可以在BaseMapperX 中添加
 *
 * @param <T> 需要继承 BaseEntity
 */
public interface BaseMapperX<T extends BaseEntity<T>> extends BaseMapper<T> {
}
