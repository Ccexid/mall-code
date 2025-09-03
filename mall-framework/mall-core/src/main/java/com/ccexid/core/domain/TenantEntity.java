package com.ccexid.core.domain;

import com.mybatisflex.annotation.Column;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

@EqualsAndHashCode(callSuper = true)
@Data
public class TenantEntity<T extends BaseEntity<T>> extends BaseEntity<T> {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(tenantId = true)
    private Long tenantId;
}
