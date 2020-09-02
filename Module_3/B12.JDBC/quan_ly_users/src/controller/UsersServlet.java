package controller;

import bo.UserBO;
import bo.UserBOImpl;
import model.User;

import javax.jws.soap.SOAPBinding;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
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
            case "edit":
                editUser(request,response);
            default:
                showUsersList(request, response);
        }
    }
    private void editUser(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id,name,email,country);
        userBO.editUser(user);
        showUsersList(request,response);
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
        request.setAttribute("userListServlet",userList);
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
            case "editById":
                showEditForm(request,response);
                break;
            case "deleteById":
                deleteById(request,response);
                break;
            case "sort":
                sortByName(request,response);
                break;
            case "showListProcedure":
                showUsersListByProcedure(request,response);
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

    private void showUsersListByProcedure(HttpServletRequest request, HttpServletResponse response){
        List<User> userList = userBO.findAllWithProcedure();
        request.setAttribute("userListServlet",userList);
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

    private void sortByName(HttpServletRequest request,HttpServletResponse response){
        List<User> userList = userBO.sortByName();
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
        request.setAttribute("userListServlet",userList);
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request,HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userBO.findById(id);
        RequestDispatcher dispatcher;
        if (user == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else
            request.setAttribute("user", user);
            dispatcher = request.getRequestDispatcher("/view/edit.jsp");
            try {
                dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteById(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        userBO.deleteUser(id);
        showUsersList(request,response);
    }
}



