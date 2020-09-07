package bo;

import dao.AccountDAO;
import dao.AccountDAOImpl;
import main.*;

import java.util.List;

public class AccountBOImpl implements AccountBO {
    private AccountDAO accountDAO = new AccountDAOImpl();
    @Override
    public List<Customer> findAllCustomer() {
        return accountDAO.findAllCustomer();
    }

    @Override
    public void saveCustomer(Customer customer) {
        accountDAO.saveCustomer(customer);
    }

    @Override
    public void saveService(Service service) {
        accountDAO.saveService(service);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return accountDAO.findAllEmployee();
    }

    @Override
    public void saveEmployee(Employee employee) {
        accountDAO.saveEmployee(employee);
    }

    @Override
    public Customer findCustomerById(int id) {
        return accountDAO.findCustomerById(id);
    }

    @Override
    public void deleteCustomer(int id) {
        accountDAO.deleteCustomer(id);
    }

    @Override
    public void editCustomer(Customer customer) {
        accountDAO.editCustomer(customer);
    }

    @Override
    public void saveContract(Contract contract) {
        accountDAO.saveContract(contract);
    }

    @Override
    public void saveContractDetail(ContractDetail contractDetail) {
        accountDAO.saveContractDetail(contractDetail);
    }

    @Override
    public List<CustomerContract> findCustomerUsingService() {
        return accountDAO.findCustomerUsingService();
    }

    @Override
    public List<Service> showAllService() {
        return accountDAO.showAllService();
    }

    @Override
    public void deleteService(int id) {
        accountDAO.deleteService(id);
    }
}
