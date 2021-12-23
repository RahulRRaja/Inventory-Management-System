package com.sample.Inventory.management.system.entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pid", nullable = false)
    private Integer pid;

    @Column
    private String code;

    @Column
    private String pname;

    @Column(name = "price")
    private double price;

    @Column(name = "price_sale")
    private double priceSale;

    @Column
    private int qty;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id",referencedColumnName = "oid")
    private Orders orders;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(double priceSale) {
        this.priceSale = priceSale;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
     public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }


    @Override
    public String toString() {
        return "Product{" + "pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + '}';
    }
}
