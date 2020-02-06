package com.hh.test.user.service.impl;

import com.hh.test.user.entity.TestUser;
import com.hh.test.user.mapper.TestUserMapper;
import com.hh.test.user.service.TestUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hh
 * @since 2020-01-12
 */
@Service
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUser> implements TestUserService {

}
