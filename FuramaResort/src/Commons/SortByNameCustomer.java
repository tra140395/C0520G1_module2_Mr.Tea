package commons;

import models.Customer;

import java.util.Comparator;

public class SortByNameCustomer implements Comparator<Customer> {

        public int compare(Customer s1, Customer s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }

