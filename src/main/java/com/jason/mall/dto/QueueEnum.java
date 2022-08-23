package com.jason.mall.dto;


import lombok.Getter;

/**
 * Message Queue
 */
@Getter
public enum QueueEnum {

    QUEUE_ORDER_CANCEL("mall.order.direct", "mall.order.cancel", "mall.order.cancel"),
    QUEUE_TTL_ORDER_CANCEL("mall.order.direct.ttl", "mall.order.cancel.ttl", "mall.order.cancel.ttl");

    /**
     * name of exchanger
     */
    private String exchange;
    /**
     * name of queue
     */
    private String name;
    /**
     * name of router
     */
    private String routeKey;

    QueueEnum(String exchange, String name, String routeKey) {
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }
}