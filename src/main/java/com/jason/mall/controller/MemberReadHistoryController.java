package com.jason.mall.controller;

import com.jason.mall.common.api.CommonResult;
import com.jason.mall.nosql.mongodb.document.MemberReadHistory;
import com.jason.mall.service.MemberReadHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Member Read History Controller
 */
@Controller
@Api(tags = "MemberReadHistoryController")
@RequestMapping("/member/readHistory")
public class MemberReadHistoryController {
    @Autowired
    private
    MemberReadHistoryService memberReadHistoryService;

    @ApiOperation("Create Reading History")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody MemberReadHistory memberReadHistory) {
        int count = memberReadHistoryService.create(memberReadHistory);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("Delete Reading History")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam("id") String id) {
        String result = memberReadHistoryService.delete(id);
        if (result.equals(id)) {
            return CommonResult.success(1);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("Show Reading History")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<MemberReadHistory>> list(Long memberId) {
        List<MemberReadHistory> memberReadHistoryList = memberReadHistoryService.list(memberId);
        return CommonResult.success(memberReadHistoryList);
    }
}
