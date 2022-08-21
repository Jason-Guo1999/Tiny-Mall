package com.jason.mall.service;

import com.jason.mall.common.api.CommonResult;

/**
 * Member Service
 */
public interface UmsMemberService {
    CommonResult generateAuthCode(String telephone);
    CommonResult verifyAuthCode(String telephone, String authCode);
}
