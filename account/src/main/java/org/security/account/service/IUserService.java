package org.security.account.service;

import org.security.account.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.security.common.entity.UserEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wormflesh
 * @since 2023-03-10
 */
public interface IUserService extends IService<User> {

    UserEntity getUserByUsername(String username);
}
