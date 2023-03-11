package org.security.account.service;

import org.security.account.entity.PermissionEntity;
import org.security.account.pojo.Permission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wormflesh
 * @since 2023-03-10
 */
public interface IPermissionService extends IService<Permission> {

    List<PermissionEntity> getPermissionsByUserId(Integer id);
}
