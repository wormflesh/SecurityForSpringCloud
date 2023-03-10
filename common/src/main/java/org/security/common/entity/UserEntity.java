package org.security.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserEntity
 * @description: User实体类
 * @author: WormFlesh
 * @create: 2023-03-10 10:47
 **/
@TableName("t_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @TableId
    private Integer id;

    private String username;

    private String password;

    private String fullname;
}