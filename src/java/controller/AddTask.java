/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.TaskDAO;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ZenBook
 */
public class AddTask extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddTask</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddTask at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
//        processRequest(request, response);
        int id = Integer.parseInt(request.getParameter("id"));
        int projectId = Integer.parseInt(request.getParameter("projectId"));
        new TaskDAO().deleteTask(id);
        response.sendRedirect("single-project?id=" + projectId);
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
//        processRequest(request, response);
        int userId = Integer.parseInt(request.getParameter("userId"));
        System.out.println("userId: " + userId);

        int projectId = Integer.parseInt(request.getParameter("projectId"));
        System.out.println("projectId: " + projectId);
        
        String title = request.getParameter("title");
        System.out.println("title: " + title);
        
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("acc");
        System.out.println(user);
        int createdBy = user.getId();
        System.out.println("createdBy: " + createdBy);
        int updatedBy = user.getId();
        System.out.println("updatedBy: " + updatedBy);

        String plannedStartDate = request.getParameter("start-date");
        System.out.println("plannedStartDate: " + plannedStartDate);
        String plannedEndDate = request.getParameter("end-date");
        System.out.println("plannedEndDate: " + plannedEndDate);
        String description = request.getParameter("description");
        System.out.println("description: " + description);
        new TaskDAO().addTask(userId, projectId, createdBy, updatedBy, title, description, plannedStartDate, plannedEndDate);
        response.sendRedirect("single-project?id=" + projectId);
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
