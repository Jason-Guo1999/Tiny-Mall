package com.jason.mall.domain;

import com.jason.mall.mbg.model.UmsMemberReceiveAddress;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * Confirm Information
 */
@Getter
@Setter
public class ConfirmOrderResult {
    //@ApiModelProperty("Promotion Cart")
    //private List<CartPromotionItem> cartPromotionItemList;
    @ApiModelProperty("Receive Address ID")
    private List<UmsMemberReceiveAddress> memberReceiveAddressList;
    //@ApiModelProperty("Coupon ID")
    //private List<SmsCouponHistoryDetail> couponHistoryDetailList;
    //@ApiModelProperty("Integration")
    //private UmsIntegrationConsumeSetting integrationConsumeSetting;
    //@ApiModelProperty("Integration")
    //private Integer memberIntegration;
    @ApiModelProperty("Calculated amount")
    private CalcAmount calcAmount;

    @Getter
    @Setter
    public static class CalcAmount{
        @ApiModelProperty("Total Amount")
        private BigDecimal totalAmount;
        @ApiModelProperty("Shipping")
        private BigDecimal freightAmount;
        //@ApiModelProperty("Promotion")
        //private BigDecimal promotionAmount;
        @ApiModelProperty("Payment Amount")
        private BigDecimal payAmount;
    }
}