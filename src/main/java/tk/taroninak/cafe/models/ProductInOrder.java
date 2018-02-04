package tk.taroninak.cafe.models;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="product_in_orders")
public class ProductInOrder {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", unique=true)
    private Long id;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "amount")
    private Integer amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ProductInOrderStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public ProductInOrderStatus getStatus() {
        return status;
    }

    public void setStatus(ProductInOrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ProductInOrder{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", productId=" + productId +
                ", amount=" + amount +
                ", status=" + status +
                '}';
    }

    public enum ProductInOrderStatus {
        ACTIVE, CANCELED;
    }
}
