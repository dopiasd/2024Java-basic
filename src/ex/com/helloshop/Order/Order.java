package ex.com.helloshop.Order;

import ex.com.helloshop.product.Product;
import ex.com.helloshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}