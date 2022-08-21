package com.jason.mall.service.Impl;

import com.alibaba.druid.util.StringUtils;
import com.jason.mall.common.api.CommonResult;
import com.jason.mall.service.RedisService;
import com.jason.mall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * UmsMemberService Implementation
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {
    @Autowired
    private RedisService redisService;
    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    @Override
    public CommonResult generateAuthCode(String telephone) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        // combine authCode and telephone
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone, sb.toString());
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);
        return CommonResult.success(sb.toString(), "Successfully get authority code");
    }


    // validate authCode
    @Override
    public CommonResult verifyAuthCode(String telephone, String authCode) {
        if (StringUtils.isEmpty(authCode)) {
            return CommonResult.failed("please input authority code");
        }
        String realAuthCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
        boolean result = authCode.equals(realAuthCode);
        if (result) {
            return CommonResult.success(null, "Successfully sign in!");
        } else {
            return CommonResult.failed("Failed! Please check your telephone or authority code.");

        }
    }

}