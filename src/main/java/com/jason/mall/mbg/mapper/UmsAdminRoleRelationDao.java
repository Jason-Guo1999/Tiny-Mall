package com.jason.mall.mbg.mapper;

import com.jason.mall.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User&Admin DAO
 */
public interface UmsAdminRoleRelationDao {

    /**
     * get permission list
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}