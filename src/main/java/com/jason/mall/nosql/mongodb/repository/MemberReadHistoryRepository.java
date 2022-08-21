package com.jason.mall.nosql.mongodb.repository;

import com.jason.mall.nosql.mongodb.document.MemberReadHistory;
import com.jason.mall.nosql.mongodb.document.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Basic Manipulation for MongoDb
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String> {
    /**
     * Find Member's Reading History
     * @param memberId
     */

    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}