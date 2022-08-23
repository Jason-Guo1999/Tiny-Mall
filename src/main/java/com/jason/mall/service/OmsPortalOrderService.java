package com.jason.mall.service;

import com.jason.mall.common.api.CommonResult;
import com.jason.mall.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * OmsOrder Service
 */
public interface OmsPortalOrderService {

    /**
     * Generate Order
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * Cancel Order
     */
    @Transactional
    void cancelOrder(Long orderId);
}