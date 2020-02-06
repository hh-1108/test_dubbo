package com.hh.test.user.service;

import com.hh.test.user.entity.TestUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hh
 * @since 2020-01-12
 */
public interface TestUserService{

    List<TestUser> getAllUser();
}
