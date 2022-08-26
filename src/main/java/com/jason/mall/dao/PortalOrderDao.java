package com.jason.mall.dao;

import com.jason.mall.domain.OmsOrderDetail;
import com.jason.mall.mbg.model.OmsOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Order Management Dao
 */
public interface PortalOrderDao {
    /**
     * Get Order Detail
     */
    OmsOrderDetail getDetail(@Param("orderId") Long orderId);

    /**
     * Update SKU Stock
     */
    int updateSkuStock(@Param("itemList") List<OmsOrderItem> orderItemList);

    /**
     * Get Timeout Orders
     */
    List<OmsOrderDetail> getTimeOutOrders(@Param("minute") Integer minute);

    /**
     * Update Order Status
     */
    int updateOrderStatus(@Param("ids") List<Long> ids,@Param("status") Integer status);

    /**
     * Release SKU Stock Lock
     */
    int releaseSkuStockLock(@Param("itemList") List<OmsOrderItem> orderItemList);

}