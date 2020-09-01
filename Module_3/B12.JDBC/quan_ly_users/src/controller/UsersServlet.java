package controller;

import bo.UserBO;
import bo.UserBOImpl;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UsersServlet", urlPatterns = {"","/user"})
public class UsersServlet extends HttpServlet {
    UserBO userBO = new UserBOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createUser(request, response);
                break;
            case "search":
                searchUser(request,response);
                break;
            default:
                showUsersList(request, response);
        }
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        User user = new User(name,email,country);
        userBO.save(user);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/create.jsp");
        request.setAttribute("message","done!");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchUser(HttpServletRequest request, HttpServletResponse response){
        String country = request.getParameter("country");
        List<User> userList = userBO.findByCountry(country);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
        request.setAttribute("userList",userList);
        try {
            dispatcher.forward(request,response);
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
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "search":
                showSearchForm(request,response);
                break;
            case "update":
                break;
            case "delete":
                break;
            default:
                showUsersList(request, response);
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("view/create.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showUsersList(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList =  userBO.findAll();
        request.setAttribute("userListServlet", userList);
        try {
            request.getRequestDispatcher("/view/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showSearchForm(HttpServletRequest request,HttpServletResponse response){
        try {
            response.sendRedirect("view/search.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



