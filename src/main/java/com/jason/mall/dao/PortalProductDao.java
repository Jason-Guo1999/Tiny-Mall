package com.jason.mall.dao;

import com.jason.mall.domain.CartProduct;
import com.jason.mall.domain.PromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Cart Management
 */
public interface PortalProductDao {
    /**
     * Get Cart Product
     */
    CartProduct getCartProduct(@Param("id") Long id);

    /**
     * 获取促销商品信息列表
     */
    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);

    /**
     * Get Coupon List
     */
    //List<SmsCoupon> getAvailableCouponList(@Param("productId") Long productId, @Param("productCategoryId") Long productCategoryId);
}