package org.security.account.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @ClassName PermissionEntity
 * @description:
 * @author: WormFlesh
 * @create: 2023-03-11 14:14
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_permission")
public class PermissionEntity {

    @TableId
    private Integer id;

    private String code;

    private String description;

    private String url;

}
