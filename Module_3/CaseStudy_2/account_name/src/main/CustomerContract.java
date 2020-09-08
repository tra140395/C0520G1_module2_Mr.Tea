package main;

public class CustomerContract {
    private String customer_id;
    private String customer_name;
    private String service_name;
    private String attach_service_name;


    public CustomerContract() {
    }

    public CustomerContract(String customer_id, String customer_name, String service_name, String attach_service_name) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.service_name = service_name;
        this.attach_service_name = attach_service_name;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getAttach_service_name() {
        return attach_service_name;
    }

    public void setAttach_service_name(String attach_service_name) {
        this.attach_service_name = attach_service_name;
    }
}
