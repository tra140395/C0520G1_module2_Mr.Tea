package bo;

import main.Customer;
import main.Employee;
import main.Service;

import java.util.List;

public interface AccountBO {
    List<Customer> findAllCustomer();

    void saveCustomer(Customer customer);

    void saveService(Service service);

    List<Employee> findAllEmployee();

    void saveEmployee(Employee employee);

    Customer findCustomerById(int id);

    void deleteCustomer(int id);

    void editCustomer(Customer customer);
}
