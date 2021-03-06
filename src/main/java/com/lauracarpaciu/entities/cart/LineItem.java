package com.lauracarpaciu.entities.cart;

import com.lauracarpaciu.entities.data.BaseEntity;
import com.lauracarpaciu.entities.product.Product;

import javax.persistence.*;

@Entity
@Table(name = "line-items")
public class LineItem extends BaseEntity  {
    @Id
    @Column(name = "productId", nullable=false)
    private String productId;
    @ManyToOne
    @JoinColumn(name = "productId",insertable=false, updatable=false)
    private Product product;
    private Integer quantity;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LineItem() {
        super();
    }

    public LineItem(String productId, Product product, Integer quantity) {
        super();
        this.productId = productId;
        this.product = product;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "LineItem{" +
                "productId='" + productId + '\'' +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
