package ro.emanuel.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

import ro.emanuel.spring.dao.OrderDAO;

@Controller
public class OrderController {
    private OrderDAO orderDAO = new OrderDAO();

    @GetMapping("/orders")
    public String getAllOrders(Model model) {
        model.addAttribute("orders", orderDAO.getAllOrders());
        return "orders";
    }

    @GetMapping("/order")
    public String getOrderById(@RequestParam("id") int id, Model model) {
        Order order = orderDAO.getOrderById(id);
        model.addAttribute("order", order);
        return "order";
    }
}
