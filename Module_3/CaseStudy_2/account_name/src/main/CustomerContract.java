package main;

public class CustomerContract {
    private String customer_name;
    private String attach_service_name;

    public CustomerContract() {
    }

    public CustomerContract(String customer_name, String attach_service_name) {
        this.customer_name = customer_name;
        this.attach_service_name = attach_service_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getAttach_service_name() {
        return attach_service_name;
    }

    public void setAttach_service_name(String attach_service_name) {
        this.attach_service_name = attach_service_name;
    }
}
