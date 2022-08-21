package com.jason.mall.nosql.elasticsearch.document;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * Product Properties
 */
public class EsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long productAttributeId;
    @Field(type = FieldType.Keyword)
    private String value;
    //0->scale；1->para
    private Integer type;
    //type name
    @Field(type=FieldType.Keyword)
    private String name;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}