package org.security.account.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.security.account.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.security.common.entity.UserEntity;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wormflesh
 * @since 2023-03-10
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("SELECT id,username,`password`,fullname\n" +
            "FROM t_user \n" +
            "WHERE username = #{username};")
    UserEntity getUserByUsername(@Param("username") String username);
}
