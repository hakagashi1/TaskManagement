/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.RoleDAO;
import dao.UserDAO;
import entity.Role;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ZenBook
 */
public class RegisterControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        List<Role> roles = new RoleDAO().getAllRoles();
        request.setAttribute("roles", roles);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        UserDAO userDAO = new UserDAO();
        int count = 0;
        String username = request.getParameter("username");
        if (userDAO.checkUsernameExist(username) != null) {
            request.setAttribute("userDanger", "Username has been existed");
            request.setAttribute("username", username);
            count++;
        }
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        if (userDAO.checkPassword(password, repassword)) {
            request.setAttribute("repassDanger", "Confirm Password is not true");
            count++;
        }
        String email = request.getParameter("email");
        if (userDAO.checkEmailExist(email) != null) {
            request.setAttribute("emailDanger", "Email has been existed");
            request.setAttribute("email", email);
            count++;
        }
        String firstname = request.getParameter("firstname");
        request.setAttribute("firstname", firstname);
        String middlename = request.getParameter("middlename");
        request.setAttribute("middlename", middlename);
        String lastname = request.getParameter("lastname");
        request.setAttribute("lastname", lastname);
        String mobile = request.getParameter("mobile");
        request.setAttribute("mobile", mobile);
        String roleId = request.getParameter("role");
        request.setAttribute("role", roleId);
        String agree = request.getParameter("agree");
        if (agree == null) {
            request.setAttribute("agreeDanger", "You should agree to Terms & Conditions");
            count++;
        }
        if (count > 0) {
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else {
            userDAO.register(username, email, password, firstname, middlename, lastname, mobile, roleId);
            response.sendRedirect("login");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
