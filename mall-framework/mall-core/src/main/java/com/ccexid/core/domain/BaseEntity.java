package com.ccexid.core.domain;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.core.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Data(staticConstructor = "create")
public class BaseEntity<T extends Model<T>> extends Model<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Long id;

    @Column(onInsertValue = "now()")
    private Date createTime;

    @Column(onUpdateValue = "now()", onInsertValue = "now()")
    private Date updateTime;
}
