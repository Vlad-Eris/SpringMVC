package ro.emanuel.spring.model;

public class Order {
    private int id;
    private String customerName;
    private double totalAmount;

    public Order(int id, String customerName, double totalAmount) {
        this.id = id;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
}
