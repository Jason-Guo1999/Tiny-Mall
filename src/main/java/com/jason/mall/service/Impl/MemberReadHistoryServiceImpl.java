package com.jason.mall.service.Impl;

import com.jason.mall.nosql.mongodb.document.MemberReadHistory;
import com.jason.mall.nosql.mongodb.repository.MemberReadHistoryRepository;
import com.jason.mall.service.MemberReadHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Member Read History Service Implementation
 */
@Service
public class MemberReadHistoryServiceImpl implements MemberReadHistoryService {
    @Autowired
    private
    MemberReadHistoryRepository memberReadHistoryRepository;
    @Override
    public int create(MemberReadHistory memberReadHistory) {
        memberReadHistory.setId(null);
        memberReadHistory.setCreateTime(new Date());
        memberReadHistoryRepository.save(memberReadHistory);
        return 1;
    }

    @Override
    public String delete(String id) {
        memberReadHistoryRepository.deleteById(id);
        MemberReadHistory memberReadHistory = new MemberReadHistory();
        memberReadHistory.setId(id);
        return id;
    }

    @Override
    public List<MemberReadHistory> list(Long memberId) {
        return memberReadHistoryRepository.findByMemberIdOrderByCreateTimeDesc(memberId);
    }
}