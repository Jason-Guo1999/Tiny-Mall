package com.jason.mall.service;

import com.jason.mall.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Elasticsearch Service
 */
public interface EsProductService {
    int importAll();
    void delete(Long id);
    EsProduct create(Long id);
    void delete(List<Long> ids);
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

}