package com.jason.mall.dao;

import com.jason.mall.mbg.model.OmsOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Order Item Dao
 */
public interface PortalOrderItemDao {
    /**
     * Batch Insert
     */
    int insertList(@Param("list") List<OmsOrderItem> list);
}
