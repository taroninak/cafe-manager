package tk.taroninak.cafe.models;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", unique=true)
    private Long id;

    @Column(name = "table_id")
    private Long tableId;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private OrderStatus status;

    public enum OrderStatus {
        OPEN, CLOSED, CANCELED;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", tableId=" + tableId +
                ", status=" + status +
                '}';
    }
}
