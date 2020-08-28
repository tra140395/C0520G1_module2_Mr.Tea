package controller;
import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",  urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Hai","15-07-2001","Quang Nam","images/image5.png"));
        customerList.add(new Customer("Hung","05-09-1997","Thanh Hoa", "images/image6.png"));
        customerList.add(new Customer("Nam","22-10-1995","Nghệ An","images/images.jpg"));
        customerList.add(new Customer("Thanh","01-02-1994","Tuyên Hóa","images/images1.jpg"));

        request.setAttribute("customerListServlet",customerList);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }
}
