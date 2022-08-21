package com.jason.mall.controller;

import com.jason.mall.common.api.CommonResult;
import com.jason.mall.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Union Member Sign in Controller
 */
@Controller
@Api(tags = "UmsMemberController")
@RequestMapping("/sso")
public class UmsMemberController {
    @Autowired
    private UmsMemberService memberService;

    @ApiOperation("Get Authority Code")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String telephone) {
        return memberService.generateAuthCode(telephone);
    }

    @ApiOperation("Validate")
    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePassword(@RequestParam String telephone,
                                       @RequestParam String authCode) {
        return memberService.verifyAuthCode(telephone,authCode);
    }
}