package com.jason.mall.service;

import com.jason.mall.mbg.model.UmsAdmin;
import com.jason.mall.mbg.model.UmsPermission;

import java.util.List;

/**
 * Admin Service
 */
public interface UmsAdminService {

    UmsAdmin getAdminByUsername(String username);
    UmsAdmin register(UmsAdmin umsAdminParam);
    String login(String username, String password);
    List<UmsPermission> getPermissionList(Long adminId);
}