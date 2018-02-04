package tk.taroninak.cafe.models;

import javax.persistence.*;

@Entity
@javax.persistence.Table(name="tables")
public class Table {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", unique=true)
    private Long id;

    @Column(name = "waiter_id")
    private Long waiterId;

    @Column(name= "seats")
    private int seats;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWaiterId() {
        return waiterId;
    }

    public void setWaiterId(Long waiterId) {
        this.waiterId = waiterId;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", waiterId=" + waiterId +
                ", seats=" + seats +
                '}';
    }
}
