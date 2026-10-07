package com.kta.dto;

public class OrderDTO {
    private String orderId;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;
    private double amount;
    private double discount;
    private double tax;
    private double totalAmount;
    private String paymentMethod;

    public OrderDTO() {
    }

    public OrderDTO(String orderId, String customerName, String customerEmail, double amount, String paymentMethod) {
        this(orderId, customerName, customerEmail, null, amount, 0.0, paymentMethod);
    }

    public OrderDTO(String orderId, String customerName, String customerEmail, double amount, double discount, String paymentMethod) {
        this(orderId, customerName, customerEmail, null, amount, discount, paymentMethod);
    }

    public OrderDTO(String orderId, String customerName, String customerEmail, String phoneNumber, double amount, double discount, String paymentMethod) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
    }

    public OrderDTO(String orderId, String customerName, String customerEmail, double amount, double discount, double tax, double totalAmount, String paymentMethod) {
        this(orderId, customerName, customerEmail, null, amount, discount, tax, totalAmount, paymentMethod);
    }

    public OrderDTO(String orderId, String customerName, String customerEmail, String phoneNumber, double amount, double discount, double tax, double totalAmount, String paymentMethod) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.discount = discount;
        this.tax = tax;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Alias methods in case "phonerNumber" is used directly
    public String getPhonerNumber() {
        return phoneNumber;
    }

    public void setPhonerNumber(String phonerNumber) {
        this.phoneNumber = phonerNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", amount=" + amount +
                ", discount=" + discount +
                ", tax=" + tax +
                ", totalAmount=" + totalAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
