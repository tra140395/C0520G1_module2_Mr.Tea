package com.codegym.casestudy.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerTypeId;

    private String CustomerTypeName;


    @OneToMany(mappedBy = "customerType",cascade = CascadeType.ALL)
    private List<Customer> customers;

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return CustomerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        CustomerTypeName = customerTypeName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
