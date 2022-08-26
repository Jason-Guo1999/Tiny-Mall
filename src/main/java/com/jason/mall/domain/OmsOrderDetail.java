package com.jason.mall.domain;
import com.jason.mall.mbg.model.OmsOrder;
import com.jason.mall.mbg.model.OmsOrderItem;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Order Detail
 */
@Getter
@Setter
public class OmsOrderDetail extends OmsOrder {
    @ApiModelProperty("Order Item List")
    private List<OmsOrderItem> orderItemList;
}