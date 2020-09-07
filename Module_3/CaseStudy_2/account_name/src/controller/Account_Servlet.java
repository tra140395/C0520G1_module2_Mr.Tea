package controller;

import bo.AccountBO;
import bo.AccountBOImpl;
import main.Customer;
import main.Employee;
import main.Service;

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
            default:
                showHome(request,response);
        }
    }

    public void editCustomer(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
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
        int id = Integer.parseInt(request.getParameter("id"));
        int type_id = Integer.parseInt(request.getParameter("type_id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String id_card= request.getParameter("id_card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        Customer customer = new Customer(id,type_id,name,birthday,gender,id_card,phone,email,address);
        accountBO.saveCustomer(customer);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/createCustomer.jsp");
        request.setAttribute("message","done!");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createService(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        float cost = Float.parseFloat(request.getParameter("cost"));
        int max_people = Integer.parseInt(request.getParameter("max_people"));
        int rent_type_id = Integer.parseInt(request.getParameter("rent_type_id"));
        int service_type_id = Integer.parseInt(request.getParameter("service_type_id"));
        String standard_room = request.getParameter("standard_room");
        String description = request.getParameter("description");
        float pool_area = Float.parseFloat(request.getParameter("pool_area"));
        int number_of_floods = Integer.parseInt(request.getParameter("number_of_floors"));

        Service service = new Service(id,name,area,cost,max_people,rent_type_id,service_type_id,
                standard_room, description,pool_area,number_of_floods);
        accountBO.saveService(service);
        request.setAttribute("message","done!");
        try {
            request.getRequestDispatcher("/view/createService.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void createEmployee(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String id_card = request.getParameter("id_card");
        float salary = Float.parseFloat(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int position_id = Integer.parseInt(request.getParameter("position_id"));
        int education_id = Integer.parseInt(request.getParameter("education_id"));
        int division_id = Integer.parseInt(request.getParameter("division_id"));
        String user_name = request.getParameter("user_name");
        Employee employee = new Employee(id,name,birthday,id_card,salary,phone,email,address,position_id,
                education_id,division_id,user_name);
        accountBO.saveEmployee(employee);
        request.setAttribute("message","done!");
        try {
            request.getRequestDispatcher("/view/createEmployee.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void searchCustomerById(HttpServletRequest request,HttpServletResponse response){
        List<Customer> customerList = new ArrayList<>();
        int id = Integer.parseInt(request.getParameter("id"));
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
            case "searchCustomerById":
                showSearchCustomerForm(request,response);
                break;
            case "deleteCustomer":
                deleteCustomer(request,response);
                break;
            case "editCustomer":
                showEditCustomerForm(request,response);
                break;
            default:
                showHome(request,response);
        }
    }

    private void showEditCustomerForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
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

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        accountBO.deleteCustomer(id);
        showCustomerList(request,response);
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