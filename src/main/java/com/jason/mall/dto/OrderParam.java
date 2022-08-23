package com.jason.mall.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderParam {
    /**
     * Receive Address Id
     */
    private Long memberReceiveAddressId;
    /**
     * Coupon Id
     */
    private Long couponId;
    /**
     * Integration
     */
    private Integer useIntegration;
    /**
     * Payment
     */
    private Integer payType;

}