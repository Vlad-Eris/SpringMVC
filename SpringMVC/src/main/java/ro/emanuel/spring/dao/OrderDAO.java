package ro.emanuel.spring.dao;

import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public class OrderDAO {
    private static List<Order> orders = new ArrayList<>();
    static {
        orders.add(new Order(1, "John Doe", 999.99));
        orders.add(new Order(2, "Jane Smith", 499.99));
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public Order getOrderById(int id) {
        return orders.stream().filter(o -> o.getId() == id).findFirst().orElse(null);
    }
}
