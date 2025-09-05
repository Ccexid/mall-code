package com.ccexid.user.service;

import com.ccexid.user.model.SctMallUserDO;
import com.ccexid.user.model.dto.SctMallUserDto;
import com.mybatisflex.core.service.IService;

public interface ISctMallUserService extends IService<SctMallUserDO> {
    /**
     * 注册
     *
     * @param user 用户
     * @return 用户
     */
    SctMallUserDO register(SctMallUserDto user);
}
