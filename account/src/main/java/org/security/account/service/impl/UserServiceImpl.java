package org.security.account.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.security.account.pojo.User;
import org.security.account.mapper.UserMapper;
import org.security.account.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.security.common.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wormflesh
 * @since 2023-03-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public UserEntity getUserByUsername(String username) {
        UserEntity userEntity = userMapper.getUserByUsername(username);
        return userEntity;
    }
}
