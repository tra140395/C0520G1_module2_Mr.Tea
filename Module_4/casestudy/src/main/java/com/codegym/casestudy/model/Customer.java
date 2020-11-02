package com.codegym.casestudy.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Customer {

    @Id
    @Pattern(regexp = "(KH-\\d{4})", message = "Mã khách hàng có định dạng KH-XXXX, X là số nguyên từ 1 -> 9")
    private String customerId;

    @NotBlank(message = "Tên khách hàng không được để trống!")
    private String customerName;

    private String customerBirthday;
    private boolean customerGender;

    @Pattern(regexp = "^(\\d{9})$", message = "Idcard phải là 9 số nguyên!")
    private String customerIdCard;

    @Pattern(regexp = "^((090|091)\\d{7})$", message = "SĐT theo định dạng 090 hoặc 091 theo sau là 7 số!")
    private String customerPhone;

    @Pattern(regexp = "^(\\w{3,}@gmail+.\\w+)$", message = "Email phải theo định dạng abc@gmail.abc")
    private String customerEmail;

    private String customerAddress;

    @ManyToOne()
    @JoinColumn(columnDefinition = "customerTypeId")
    private CustomerType customerType;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public boolean isCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(boolean customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
