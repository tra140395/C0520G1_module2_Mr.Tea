package dao;

import main.*;

import java.util.List;

public interface AccountDAO {
    List<Customer> findAllCustomer();

    void saveCustomer(Customer customer);

    void saveService(Service service);

    List<Employee> findAllEmployee();

    void saveEmployee(Employee employee);

    Customer findCustomerById(int id);

    void deleteCustomer(int id);

    void editCustomer(Customer customer);

    void saveContract(Contract contract);

    void saveContractDetail(ContractDetail contractDetail);

    List<CustomerContract> findCustomerUsingService();

    List<Service> showAllService();

    void deleteService(int id);
}
