package com.ccexid.user.service.impl;

import com.ccexid.user.mapper.SctMallUserMapper;
import com.ccexid.user.model.SctMallUser;
import com.ccexid.user.service.ISctMallUserService;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SctMallUserServiceImpl extends ServiceImpl<SctMallUserMapper, SctMallUser> implements ISctMallUserService {
    @Override
    public SctMallUser register(SctMallUser user) {
        return null;
    }
}
