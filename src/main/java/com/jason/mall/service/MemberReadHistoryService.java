package com.jason.mall.service;

import com.jason.mall.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * Member Reading History Service
 */
public interface MemberReadHistoryService {
    int create(MemberReadHistory memberReadHistory);
    String delete(String id);
    List<MemberReadHistory> list(Long memberId);
}
