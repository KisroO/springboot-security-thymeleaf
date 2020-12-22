package com.kisro.security.mapper;

import com.kisro.security.pojo.SysRole;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {
    @Select("select r.id,r.role_name roleName from sys_role r,sys_user_role ur " +
            "where r.id=ur.role_id and ur.user_id=#{id}")
    public List<SysRole> findByUid(int id);
}
