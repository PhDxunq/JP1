package Lesson5;

import java.time.LocalDateTime;

public  class Order {
    private int id;
    private int quantity;
    private LocalDateTime dateTime;

    public Order(int id, int quantity, LocalDateTime dateTime) {
        this.id = id;
        this.quantity = quantity;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
