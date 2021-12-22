package com.sample.Inventory.management.system.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oid", nullable = false, columnDefinition = "serial")
    private Integer oid;

    @Column
    private Integer cid;

    @Column
    private double total;

    @Column(name = "ordertype")
    private String orderType;

    @Temporal(value = TemporalType.DATE)
    @Column(name = "orderdate")
    private Date orderDate;
    public Integer getOid() {
        return oid;
    }
    public void setOid(Integer oid) {
        this.oid = oid;
    }
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
