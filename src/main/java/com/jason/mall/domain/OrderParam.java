package com.jason.mall.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Parameters for creating orders
 */
@Data
@EqualsAndHashCode
public class OrderParam {
    @ApiModelProperty("Receive Address ID")
    private Long memberReceiveAddressId;
    //@ApiModelProperty("Coupon ID")
    //private Long couponId;
    //@ApiModelProperty("Integration")
    //private Integer useIntegration;
    @ApiModelProperty("Payment")
    private Integer payType;
    @ApiModelProperty("Cart ID")
    private List<Long> cartIds;
}