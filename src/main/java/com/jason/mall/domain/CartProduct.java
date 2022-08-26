package com.jason.mall.domain;

import com.jason.mall.mbg.model.PmsProduct;
import com.jason.mall.mbg.model.PmsProductAttribute;
import com.jason.mall.mbg.model.PmsSkuStock;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Product Information in Cart
 */
@Getter
@Setter
public class CartProduct extends PmsProduct {
    @ApiModelProperty("Product Properties")
    private List<PmsProductAttribute> productAttributeList;
    @ApiModelProperty("Product SKU List")
    private List<PmsSkuStock> skuStockList;
}