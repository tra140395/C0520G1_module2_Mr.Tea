package controller;

import bo.AccountBO;
import bo.AccountBOImpl;
import common.Regex;
import main.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Account_Servlet", urlPatterns = {"","/account"})
public class Account_Servlet extends HttpServlet {

    AccountBO accountBO = new AccountBOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if(action == null){
            action = "";
        }
        switch (action){
            case "create_customer" :
                createCustomer(request,response);
                break;
            case "create_service":
                createService(request,response);
                break;
            case "create_employee":
                createEmployee(request,response);
                break;
            case "searchCustomer":
                searchCustomerById(request,response);
                break;
            case "editCustomer":
                editCustomer(request,response);
                break;
            case "create_contract":
                createContract(request,response);
                break;
            case "create_contract_detail":
                createContractDetail(request,response);
                break;
            default:
                showHome(request,response);
        }
    }

    public void createContractDetail(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("contract_detail_id"));
        int contract_id = Integer.parseInt(request.getParameter("contract_id"));
        int attach_service_id = Integer.parseInt(request.getParameter("attach_service_id"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        ContractDetail contractDetail = new ContractDetail(id,contract_id,attach_service_id,quantity);
        accountBO.saveContractDetail(contractDetail);
        request.setAttribute("message","done!");
        try {
            request.getRequestDispatcher("/view/createContractDetail.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createContract(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String start = request.getParameter("start_date");
        String end = request.getParameter("end_date");
        double deposit = Double.parseDouble(request.getParameter("deposit"));
        double total_money = Double.parseDouble(request.getParameter("total_money"));
        int employee_id = Integer.parseInt(request.getParameter("employee_id"));
        int customer_id = Integer.parseInt(request.getParameter("customer_id"));
        int service_id = Integer.parseInt(request.getParameter("service_id"));
        Contract contract = new Contract(id,start,end,deposit,total_money,employee_id,customer_id,service_id);

        boolean check = Regex.checkDeposit(contract.getContract_deposit())
                      & Regex.checkTotalMoney(contract.getContract_total_money());
        if(!check){
            request.setAttribute("message","Wrong input, please try again!!");
            try {
                request.getRequestDispatcher("/view/createContract.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            accountBO.saveContract(contract);
            request.setAttribute("message", "done!");
            try {
                request.getRequestDispatcher("/view/createContract.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void editCustomer(HttpServletRequest request,HttpServletResponse response){
        String id = request.getParameter("id");
        int type_id = Integer.parseInt(request.getParameter("type_id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String id_card= request.getParameter("id_card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        Customer customer = new Customer(id,type_id,name,birthday,gender,id_card,phone,email,address);
        accountBO.editCustomer(customer);
        showCustomerList(request,response);

    }

    public void createCustomer(HttpServletRequest request,HttpServletResponse response){
        String id = request.getParameter("id");
        int type_id = Integer.parseInt(request.getParameter("type_id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String id_card= request.getParameter("id_card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        Customer customer = new Customer(id,type_id,name,birthday,gender,id_card,phone,email,address);
        boolean check = (Regex.regexMaKH(customer.getCustomer_id())
                         && Regex.regexInputPhone(customer.getCustomer_phone())
                         && Regex.regexInputId_card(customer.getCustomer_id_card())
                         && Regex.regexEmail(customer.getCustomer_email())) ;
        if (!check){
            request.setAttribute("message","wrong format input, please enter again!");
            try {
                request.getRequestDispatcher("/view/createCustomer.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            accountBO.saveCustomer(customer);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/view/createCustomer.jsp");
            request.setAttribute("message", "done!");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void createService(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int max_people = Integer.parseInt(request.getParameter("max_people"));
        int rent_type_id = Integer.parseInt(request.getParameter("rent_type_id"));
        int service_type_id = Integer.parseInt(request.getParameter("service_type_id"));
        String standard_room = request.getParameter("standard_room");
        String description = request.getParameter("description");
        float pool_area = Float.parseFloat(request.getParameter("pool_area"));
        int number_of_floods = Integer.parseInt(request.getParameter("number_of_floors"));

        Service service = new Service(id,name,area,cost,max_people,rent_type_id,service_type_id,
                standard_room, description,pool_area,number_of_floods);
        boolean check = Regex.regexMaDV(service.getService_id()) & Regex.checkCost(service.getService_cost());
        if(!check){
            request.setAttribute("message","Wrong input service. Please try again!!");
            try {
                request.getRequestDispatcher("/view/createService.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            accountBO.saveService(service);
            request.setAttribute("message", "done!");
            try {
                request.getRequestDispatcher("/view/createService.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void createEmployee(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String id_card = request.getParameter("id_card");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int position_id = Integer.parseInt(request.getParameter("position_id"));
        int education_id = Integer.parseInt(request.getParameter("education_id"));
        int division_id = Integer.parseInt(request.getParameter("division_id"));
        String user_name = request.getParameter("user_name");
        Employee employee = new Employee(id,name,birthday,id_card,salary,phone,email,address,position_id,
                education_id,division_id,user_name);

        boolean check = Regex.checkSalary(employee.getEmployee_salary());
        if(!check) {
            request.setAttribute("message","Wrong input.Please try again!");
            try {
                request.getRequestDispatcher("/view/createEmployee.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            accountBO.saveEmployee(employee);
            request.setAttribute("message", "done!");
            try {
                request.getRequestDispatcher("/view/createEmployee.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void searchCustomerById(HttpServletRequest request,HttpServletResponse response){
        List<Customer> customerList = new ArrayList<>();
        String id = request.getParameter("id");
        Customer customer = accountBO.findCustomerById(id);
        customerList.add(customer);
        request.setAttribute("customerList",customerList);
        try {
            request.getRequestDispatcher("/view/listCustomer.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if(action == null){
            action = "";
        }
        switch (action){
            case "addNewCustomer" :
                showCreateCustomerForm(request,response);
                break;
            case "showAllCustomer":
                showCustomerList(request,response);
                break;
            case "addNewService":
                showCreateServiceForm(request,response);
                break;
            case "showAllEmployee":
                showAllEmployee(request,response);
                break;
            case "addNewEmployee":
                showCreateEmployeeForm(request,response);
                break;
            case "confirmDeleteCustomer":
                showConfirmDeleteCustomer(request,response);
                break;
            case "searchCustomerById":
                showSearchCustomerForm(request,response);
                break;
            case "editCustomer":
                showEditCustomerForm(request,response);
                break;
            case "addNewContract":
                showContractForm(request,response);
                break;
            case "addNewContractDetail":
                showCreateContractDetailForm(request,response);
                break;
            case "showCustomerUsingService":
                showCustomerUsingService(request,response);
                break;
            case "showService":
                showService(request,response);
                break;
            case "deleteService" :
                deleteService(request,response);
                break;
            case "yes":
                deleteCustomer(request,response);
                break;
            case "no":
                showCustomerList(request,response);
                break;
            case "sumTotalMoneyService":
                sumTotalMoneyOfService(request,response);
                break;
            default:
                showHome(request,response);
        }
    }

    private void sumTotalMoneyOfService(HttpServletRequest request, HttpServletResponse response){
        double total = accountBO.sumTotalMoneyOfService();
        request.setAttribute("total",total);
        try {
            request.getRequestDispatcher("/view/totalMoneyOfService.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        accountBO.deleteCustomer(id);
        showCustomerList(request,response);
    }


    private void deleteService(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        accountBO.deleteService(id);
        showService(request,response);
    }

    private void showConfirmDeleteCustomer(HttpServletRequest request,HttpServletResponse response){
        String id = request.getParameter("id");
        Customer customer = accountBO.findCustomerById(id);
        request.setAttribute("customer",customer);
        try {
            request.getRequestDispatcher("/view/confirmDeleteCustomer.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showService(HttpServletRequest request, HttpServletResponse response){
        List<Service> serviceList = accountBO.showAllService();
        if(serviceList == null){
            request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("serviceList",serviceList);
            try {
                request.getRequestDispatcher("/view/listService.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void showCustomerUsingService(HttpServletRequest request,HttpServletResponse response){
        List<CustomerContract> customerContractList = accountBO.findCustomerUsingService();
        if(customerContractList == null){
            request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("customerContractList",customerContractList);
            try {
                request.getRequestDispatcher("/view/listCustomerContract.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void showCreateContractDetailForm(HttpServletRequest request,HttpServletResponse response){
        try {
            response.sendRedirect("/view/createContractDetail.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showContractForm(HttpServletRequest request,HttpServletResponse response){
        try {
            response.sendRedirect("/view/createContract.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditCustomerForm(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        Customer customer = accountBO.findCustomerById(id);
        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else
            request.setAttribute("customer", customer);
        dispatcher = request.getRequestDispatcher("/view/editCustomer.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showSearchCustomerForm(HttpServletRequest request,HttpServletResponse response){
        try {
            response.sendRedirect("/view/searchCustomerForm.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showHome(HttpServletRequest request,HttpServletResponse response){
        try {
            response.sendRedirect("/view/home.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showCustomerList(HttpServletRequest request,HttpServletResponse response){
        List<Customer> customerList = accountBO.findAllCustomer();
        request.setAttribute("customerList",customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/listCustomer.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateCustomerForm(HttpServletRequest request,HttpServletResponse response){
        try {
            response.sendRedirect("/view/createCustomer.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateServiceForm(HttpServletRequest request,HttpServletResponse response){
        try {
            response.sendRedirect("/view/createService.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAllEmployee(HttpServletRequest request,HttpServletResponse response){
        List<Employee> employeeList = accountBO.findAllEmployee();
        request.setAttribute("employeeList",employeeList);
        try {
            request.getRequestDispatcher("/view/listEmployee.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateEmployeeForm(HttpServletRequest request,HttpServletResponse response){
        try {
            response.sendRedirect("/view/createEmployee.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}