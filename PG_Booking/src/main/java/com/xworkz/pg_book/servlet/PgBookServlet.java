package com.xworkz.pg_book.servlet;

import com.xworkz.pg_book.entity.PgBook;
import lombok.val;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/PgBookServlet")
public class PgBookServlet extends HttpServlet {

    PgBookServlet()
    {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phoneStr = req.getParameter("phone");
        String roomType = req.getParameter("room_type");

        Long phone = null;
        try {
            phone = Long.parseLong(phoneStr);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        PgBook pgBook = new PgBook(name, email, phone, roomType);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h2>PG Booking Details:</h2>");
        out.println("<p>Name: " + pgBook.getName() + "</p>");
        out.println("<p>Email: " + pgBook.getEmail() + "</p>");
        out.println("<p>Phone: " + pgBook.getPhone() + "</p>");
        out.println("<p>Room Type: " + pgBook.getRoomType() + "</p>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phoneStr = request.getParameter("phone");
        String roomType = request.getParameter("room_type");

        Long phone = null;
        try {
            phone = Long.parseLong(phoneStr);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        PgBook pgBook = new PgBook(name, email, phone, roomType);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>PG Booking Details:</h2>");
        out.println("<p>Name: " + pgBook.getName() + "</p>");
        out.println("<p>Email: " + pgBook.getEmail() + "</p>");
        out.println("<p>Phone: " + pgBook.getPhone() + "</p>");
        out.println("<p>Room Type: " + pgBook.getRoomType() + "</p>");
        out.println("</body></html>");
    }
}
