package com.xhg.shardingspheredemo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author xiaoh
 * @create 2020/12/29 11:35
 */
public class Orders implements Serializable {

    public Orders() {

    }


    private Long orderId;

    private Integer userId;

    private Integer userName;

    private BigDecimal price;

    private String description;


    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", userName=" + userName +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getUserName() {
        return userName;
    }

    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}

