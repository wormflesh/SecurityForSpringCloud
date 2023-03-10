package org.security.account.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wormflesh
 * @since 2023-03-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_permission")
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 权限标识符
     */
    @TableField("code")
    private String code;

    /**
     * 描述
     */
    @TableField("description")
    private String description;

    /**
     * 请求地址
     */
    @TableField("url")
    private String url;


}
