package com.ccexid.core.entity;

import com.ccexid.core.model.BaseModel;

import java.io.Serial;

public record ResultEntity<T>(
        int code,
        String message,
        T data
) implements BaseModel {
    @Serial
    private static final long serialVersionUID = 1L;
}
