package dao;

import main.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {
    private final String findCustomerContract = "select customer.customer_id, customer.customer_name, " +
            "  service.service_name, attach_service.attach_service_name" +
            "  from customer" +
            "  inner join contract on contract.customer_id = customer.customer_id " +
            "  inner join service on contract.service_id = service.service_id" +
            "  inner join contract_detail on contract_detail.contract_id = contract.contract_id" +
            "  inner join attach_service on attach_service.attach_service_id = contract_detail.attach_service_id;";
    @Override
    public List<Customer> findAllCustomer() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Customer> customerList = new ArrayList<>();
        if(connection != null){
            try {
                statement = connection.prepareStatement("select * from Customer");
                resultSet = statement.executeQuery();
                Customer customer = null;
                while (resultSet.next()){
                    customer = new Customer();
                    customer.setCustomer_id(resultSet.getString("customer_id"));
                    customer.setCustomer_type_id(resultSet.getInt("customer_type_id"));
                    customer.setCustomer_name(resultSet.getString("customer_name"));
                    customer.setCustomer_birthday(resultSet.getString("customer_birthday"));
                    customer.setCustomer_gender(resultSet.getInt("customer_gender"));
                    customer.setCustomer_id_card(resultSet.getString("customer_id_card"));
                    customer.setCustomer_phone(resultSet.getString("customer_phone"));
                    customer.setCustomer_email(resultSet.getString("customer_email"));
                    customer.setCustomer_address(resultSet.getString("customer_address"));
                    customerList.add(customer);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return customerList;
    }

    @Override
    public void saveCustomer(Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null){
            try {
                statement = connection.prepareStatement("insert into customer values (?,?,?,?,?,?,?,?,?);");
                statement.setString(1,customer.getCustomer_id());
                statement.setInt(2,customer.getCustomer_type_id());
                statement.setString(3,customer.getCustomer_name());
                statement.setString(4,customer.getCustomer_birthday());
                statement.setInt(5,customer.getCustomer_gender());
                statement.setString(6,customer.getCustomer_id_card());
                statement.setString(7,customer.getCustomer_phone());
                statement.setString(8,customer.getCustomer_email());
                statement.setString(9,customer.getCustomer_address());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }

    @Override
    public void saveService(Service service) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null){
            try {
                statement = connection.prepareStatement("insert into service values(?,?,?,?,?,?,?,?,?,?,?);");
                statement.setString(1,service.getService_id());
                statement.setString(2,service.getService_name());
                statement.setInt(3,service.getService_area());
                statement.setDouble(4,service.getService_cost());
                statement.setInt(5,service.getService_max_people());
                statement.setInt(6,service.getRent_type_id());
                statement.setInt(7,service.getService_type_id());
                statement.setString(8,service.getStandard_room());
                statement.setString(9,service.getDescription_other_convenience());
                statement.setDouble(10,service.getPool_area());
                statement.setInt(11,service.getNumber_of_floors());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }

    @Override
    public List<Employee> findAllEmployee() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Employee> employeeList = new ArrayList<>();
        if(connection != null){
            try {
                statement = connection.prepareStatement("select * from employee;");
                resultSet = statement.executeQuery();
                Employee employee = null;
                while (resultSet.next()){
                    employee = new Employee();
                    employee.setEmployee_id(resultSet.getInt("employee_id"));
                    employee.setEmployee_name(resultSet.getString("employee_name"));
                    employee.setEmployee_birthday(resultSet.getString("employee_birthday"));
                    employee.setEmployee_id_card(resultSet.getString("employee_id_card"));
                    employee.setEmployee_salary(resultSet.getDouble("employee_salary"));
                    employee.setEmployee_phone(resultSet.getString("employee_phone"));
                    employee.setEmployee_email(resultSet.getString("employee_email"));
                    employee.setEmployee_address(resultSet.getString("employee_address"));
                    employee.setPosition_id(resultSet.getInt("position_id"));
                    employee.setEducation_degree_id(resultSet.getInt("education_degree_id"));
                    employee.setDivision_id(resultSet.getInt("division_id"));
                    employee.setUser_name(resultSet.getString("user_name"));
                    employeeList.add(employee);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return employeeList;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?);");
                statement.setInt(1,employee.getEmployee_id());
                statement.setString(2,employee.getEmployee_name());
                statement.setString(3,employee.getEmployee_birthday());
                statement.setString(4,employee.getEmployee_id_card());
                statement.setDouble(5,employee.getEmployee_salary());
                statement.setString(6,employee.getEmployee_phone());
                statement.setString(7,employee.getEmployee_email());
                statement.setString(8,employee.getEmployee_address());
                statement.setInt(9,employee.getPosition_id());
                statement.setInt(10,employee.getEducation_degree_id());
                statement.setInt(11,employee.getDivision_id());
                statement.setString(12,employee.getUser_name());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }

    @Override
    public Customer findCustomerById(String id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Customer customer = null;
        if (connection != null){
            try {
                statement = connection.prepareStatement("select * from customer where customer_id = ?;");
                statement.setString(1,id);
                resultSet = statement.executeQuery();
                if (resultSet.next()){
                    customer = new Customer();
                    customer.setCustomer_id(resultSet.getString("customer_id"));
                    customer.setCustomer_type_id(resultSet.getInt("customer_type_id"));
                    customer.setCustomer_name(resultSet.getString("customer_name"));
                    customer.setCustomer_birthday(resultSet.getString("customer_birthday"));
                    customer.setCustomer_gender(resultSet.getInt("customer_gender"));
                    customer.setCustomer_id_card(resultSet.getString("customer_id_card"));
                    customer.setCustomer_phone(resultSet.getString("customer_phone"));
                    customer.setCustomer_email(resultSet.getString("customer_email"));
                    customer.setCustomer_address(resultSet.getString("customer_address"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return customer;
    }

    @Override
    public void deleteCustomer(String id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null){
            try {
                statement = connection.prepareStatement("delete from customer where customer_id = ?;");
                statement.setString(1,id);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }

    @Override
    public void editCustomer(Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null){
            try {
                statement = connection.prepareStatement("update customer set customer_id = ?,customer_type_id=?," +
                        "customer_name = ?,customer_birthday=?,customer_gender=?,customer_id_card =?," +
                        "customer_phone=?, customer_email=?,customer_address = ? where customer_id = ?;");
                statement.setString(1,customer.getCustomer_id());
                statement.setInt(2,customer.getCustomer_type_id());
                statement.setString(3,customer.getCustomer_name());
                statement.setString(4,customer.getCustomer_birthday());
                statement.setInt(5,customer.getCustomer_gender());
                statement.setString(6,customer.getCustomer_id_card());
                statement.setString(7,customer.getCustomer_phone());
                statement.setString(8,customer.getCustomer_email());
                statement.setString(9,customer.getCustomer_address());
                statement.setString(10,customer.getCustomer_id());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }

    @Override
    public void saveContract(Contract contract) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null){
            try {
                statement = connection.prepareStatement("insert into Contract values(?,?,?,?,?,?,?,?);");
                statement.setInt(1,contract.getContract_id());
                statement.setString(2,contract.getContract_start_date());
                statement.setString(3,contract.getContract_end_date());
                statement.setDouble(4,contract.getContract_deposit());
                statement.setDouble(5,contract.getContract_total_money());
                statement.setInt(6,contract.getEmployee_id());
                statement.setInt(7,contract.getCustomer_id());
                statement.setInt(8,contract.getService_id());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }

    public void saveContractDetail(ContractDetail contractDetail){
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null){
            try {
                statement = connection.prepareStatement("insert into contract_detail values(?,?,?,?);");
                statement.setInt(1,contractDetail.getContract_detail_id());
                statement.setInt(2,contractDetail.getContract_id());
                statement.setInt(3,contractDetail.getAttach_service_id());
                statement.setInt(4,contractDetail.getQuantity());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }

    @Override
    public List<CustomerContract> findCustomerUsingService() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<CustomerContract> customerContractList = new ArrayList<>();
        if(connection != null){
            try {
                statement = connection.prepareStatement(findCustomerContract);
                resultSet = statement.executeQuery();
                CustomerContract customerContract;
                while (resultSet.next()){
                    customerContract = new CustomerContract();
                    customerContract.setCustomer_id(resultSet.getString("customer_id"));
                    customerContract.setCustomer_name(resultSet.getString("customer_name"));
                    customerContract.setService_name(resultSet.getString("service_name"));
                    customerContract.setAttach_service_name(resultSet.getString("attach_service_name"));
                    customerContractList.add(customerContract);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return customerContractList;
    }

    @Override
    public List<Service> showAllService() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Service> serviceList = new ArrayList<>();
        if (connection != null){
            try {
                statement = connection.prepareStatement("select * from service;");
                resultSet = statement.executeQuery();
                Service service;
                while (resultSet.next()){
                    service = new Service();
                    service.setService_id(resultSet.getString("service_id"));
                    service.setService_name(resultSet.getString("service_name"));
                    service.setService_area(resultSet.getInt("service_area"));
                    service.setService_cost(resultSet.getDouble("service_cost"));
                    service.setService_max_people(resultSet.getInt("service_max_people"));
                    service.setRent_type_id(resultSet.getInt("rent_type_id"));
                    service.setService_type_id(resultSet.getInt("service_type_id"));
                    service.setStandard_room(resultSet.getString("standard_room"));
                    service.setDescription_other_convenience(resultSet.getString("description_other_convenience"));
                    service.setPool_area(resultSet.getDouble("pool_area"));
                    service.setNumber_of_floors(resultSet.getInt("number_of_floors"));

                    serviceList.add(service);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    statement.close();
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
       return serviceList;
    }

    @Override
    public void deleteService(String id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null){
            try {
                statement = connection.prepareStatement("delete from service where service_id = ?;");
                statement.setString(1,id);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }
}
