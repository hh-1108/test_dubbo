package com.hh.test.service.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hh.test.user.entity.TestUser;
import com.hh.test.service.mapper.TestUserMapper;
import com.hh.test.user.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hh
 * @since 2020-01-12
 */
@Component
@Service
public class TestUserServiceImpl implements TestUserService {

    @Autowired
    TestUserMapper testUserMapper;

    @Override
    public List<TestUser> getAllUser() {
        return testUserMapper.selectAll();
    }
}
