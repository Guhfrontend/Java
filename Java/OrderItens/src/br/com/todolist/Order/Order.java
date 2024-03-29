package br.com.todolist.Order;

import br.com.todolist.OrderItem.OrderItem;
import br.com.todolist.OrderStatus.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;

    private List<Order> orders = new ArrayList<>();

    public Order() {

    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public void addItem(Order order){
        orders.add(order);
    }
    public void removeItem(Order order){
        orders.remove(order);
    }
    public double totalItem() {
        return totalItem();
    }
}
