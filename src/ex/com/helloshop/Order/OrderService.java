package ex.com.helloshop.Order;

import ex.com.helloshop.product.Product;
import ex.com.helloshop.user.User;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
