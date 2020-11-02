package controller;

import bo.ProductBO;
import bo.ProductBOImpl;
import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"","/product"})
public class ProductServlet extends HttpServlet {

    ProductBO productBO = new ProductBOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String action = request.getParameter("action");
       if (action == null){
           action = "";
       }
       switch (action){
           case "create_product": {
              createNewProduct(request,response);
              break;
           }
           case "searchByName": {
              searchProduct(request,response);
              break;
           }
           case "edit": {
               editProduct(request,response);
               break;
           }
       }
    }

    private void editProduct(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        String description = request.getParameter("description");
        String category = request.getParameter("category");
        Product product = new Product(id,name,price,quantity,color,description,category);
        productBO.editProduct(product);
        showListProduct(request,response);
    }

    private void searchProduct(HttpServletRequest request,HttpServletResponse response){
        String name = request.getParameter("name");
        List<Product> productList = productBO.searchByName(name);
        request.setAttribute("productList",productList);
        try {
            request.getRequestDispatcher("/view/listProduct.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createNewProduct(HttpServletRequest request,HttpServletResponse response){
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        String description = request.getParameter("description");
        String category = request.getParameter("category");

        Product product = new Product(name,price,quantity,color,description,category);
        productBO.saveProduct(product);
        showListProduct(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create": {
                showCreateForm(request,response);
                break;
            }
            case "searchByName": {
                showSearchForm(request,response);
                break;
            }
            case "edit": {
                showEditForm(request,response);
                break;
            }
            case "delete" :{
                showDeleteForm(request,response);
                break;
            }
            case "yes": {
                deleteProduct(request,response);
                break;
            }
            case "no":{
                showListProduct(request,response);
                break;
            }
            default:
                showListProduct(request,response);
        }
    }

    private void deleteProduct(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        productBO.deleteProduct(id);
        showListProduct(request,response);
    }

    private void showDeleteForm(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productBO.findById(id);
        request.setAttribute("product",product);
        try {
            request.getRequestDispatcher("/view/confirmDelete.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showEditForm(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productBO.findById(id);
        request.setAttribute("product",product);
        try {
            request.getRequestDispatcher("/view/editForm.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showSearchForm(HttpServletRequest request,HttpServletResponse response){
        try {
            response.sendRedirect("/view/searchForm.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showCreateForm(HttpServletRequest request,HttpServletResponse response){
        try {
            response.sendRedirect("/view/createForm.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListProduct(HttpServletRequest request,HttpServletResponse response){
        List<Product> productList = productBO.findAll();
        request.setAttribute("productList",productList);
        try {
            request.getRequestDispatcher("/view/listProduct.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
