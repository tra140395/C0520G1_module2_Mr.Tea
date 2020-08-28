package controller;

import model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = {"/studentList","/"})
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Tung"));
        studentList.add(new Student(2,"Hoat"));
        studentList.add(new Student(3,"Hien"));
        studentList.add(new Student(4,"Hai"));

        request.setAttribute("studentListServlet",studentList);

        request.getRequestDispatcher("student/list.jsp").forward(request,response);
        //response.sendRedirect("list.jsp");
    }
}
