package com.jason.mall.nosql.elasticsearch.repository;

import com.jason.mall.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Basic Manipulations for Elasticsearch
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {
    /**
     * Search By Keywords
     * @param name
     * @param subTitle
     * @param keywords
     * @param page
     */
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);
}