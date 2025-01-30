//package com.xworkz.laptop.servlet;
//
//import com.xworkz.laptop.entity.RestaurantEntity;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet(value = "/RestaurantServlet",loadOnStartup = 1)
//public class RestaurantServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        String c_no = request.getParameter("c_no");
//        String location = request.getParameter("location");
//        String name = request.getParameter("name");
//        String pincode = request.getParameter("pincode");
//        String rating = request.getParameter("rating");
//        String type = request.getParameter("type");
//
//        out.println("<html><body>");
//        out.println("<h1>Submitted Restaurant Details</h1>");
//        out.println("Contact Number: " + c_no + "<br>");
//        out.println("Location: " + location + "<br>");
//        out.println("Name: " + name + "<br>");
//        out.println("Pincode: " + pincode + "<br>");
//        out.println("Rating: " + rating + "<br>");
//        out.println("Type: " + type + "<br>");
//        out.println("</body></html>");
//
//        PrintWriter writer = response.getWriter();
//
//    }
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<RestaurantEntity> restaurantEntities =
//        req.setAttribute("milkRecords", milkRecords);
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("MilkResult.jsp");
//        requestDispatcher.forward(req, resp);
//    }
//}
