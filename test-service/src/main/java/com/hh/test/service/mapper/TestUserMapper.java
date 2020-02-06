package com.hh.test.service.mapper;

import com.hh.test.user.entity.TestUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hh
 * @since 2020-01-12
 */
@Component
public interface TestUserMapper extends Mapper<TestUser> {

}
