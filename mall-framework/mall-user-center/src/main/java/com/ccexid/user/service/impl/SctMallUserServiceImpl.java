package com.ccexid.user.service.impl;

import com.ccexid.user.mapper.SctMallUserMapper;
import com.ccexid.user.model.SctMallUserDO;
import com.ccexid.user.model.dto.SctMallUserDto;
import com.ccexid.user.service.ISctMallUserService;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SctMallUserServiceImpl extends ServiceImpl<SctMallUserMapper, SctMallUserDO> implements ISctMallUserService {
    @Override
    public SctMallUserDO register(SctMallUserDto user) {
        return null;
    }
}
