package br.com.todolist.OrderItem;

import br.com.todolist.Product.Product;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(){

    }

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Double subTotal(){
        return price*quantity;
    }
    public String toString(){
    return product.getName() + ", $" + String.format(" %.2f",
                price + ", Quantity: " + quantity + ", subtotal: $" + String.format("%.2f", subTotal()));
    }
}
