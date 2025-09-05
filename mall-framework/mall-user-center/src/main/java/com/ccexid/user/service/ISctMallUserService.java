package com.ccexid.user.service;

import com.ccexid.user.model.SctMallUser;
import com.mybatisflex.core.service.IService;

public interface ISctMallUserService extends IService<SctMallUser> {
    /**
     * 注册
     *
     * @param user 用户
     * @return 用户
     */
    SctMallUser register(SctMallUser user);
}
