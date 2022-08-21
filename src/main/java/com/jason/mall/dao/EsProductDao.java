package com.jason.mall.dao;

import com.jason.mall.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Elasticsearch Dao
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}