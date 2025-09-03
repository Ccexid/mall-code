package com.ccexid.core.domain;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.core.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Data
public class BaseEntity<T extends Model<T>> extends Model<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    @Column(onInsertValue = "now()")
    private Date createdTime;

    /**
     * 修改时间
     */
    @Column(onUpdateValue = "now()", onInsertValue = "now()")
    private Date updatedTime;

    /**
     * 是否删除
     */
    @Column
    private Boolean deleted;
}
