package com.jason.mall.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Return Apply Param
 */
@Getter
@Setter
public class OmsOrderReturnApplyParam {
    @ApiModelProperty("Order id")
    private Long orderId;
    @ApiModelProperty("Product id")
    private Long productId;
    @ApiModelProperty("Order Sn")
    private String orderSn;
    @ApiModelProperty("Username")
    private String memberUsername;
    @ApiModelProperty("Return name")
    private String returnName;
    @ApiModelProperty("Return phone")
    private String returnPhone;
    @ApiModelProperty("Product Pic")
    private String productPic;
    @ApiModelProperty("Product Name")
    private String productName;
    @ApiModelProperty("Product Band")
    private String productBrand;
    @ApiModelProperty("Product Properties")
    private String productAttr;
    @ApiModelProperty("Product Count")
    private Integer productCount;
    @ApiModelProperty("Product Price")
    private BigDecimal productPrice;
    @ApiModelProperty("Payment Price")
    private BigDecimal productRealPrice;
    @ApiModelProperty("Reason")
    private String reason;
    @ApiModelProperty("Description")
    private String description;
    @ApiModelProperty("Proof")
    private String proofPics;

}