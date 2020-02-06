package com.hh.test.web.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.hh.test.user.entity.TestUser;
import com.hh.test.user.service.TestUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hh
 * @since 2020-01-12
 */
@RestController
//@RequestMapping("/user/test-user")
public class TestUserController {

    @Reference
    private TestUserService testUserService;

    @RequestMapping("getAllUser")
    public List<TestUser> getAllUser(){

        List<TestUser> testUsers = testUserService.getAllUser();

        return testUsers;
    }

}
