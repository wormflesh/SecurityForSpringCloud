package org.security.account.service.impl;

import org.security.account.entity.PermissionEntity;
import org.security.account.pojo.Permission;
import org.security.account.mapper.PermissionMapper;
import org.security.account.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wormflesh
 * @since 2023-03-10
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public List<PermissionEntity> getPermissionsByUserId(Integer id) {
        return permissionMapper.selectPermissionsByUserId(id);
    }
}
