/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andrew
 */
public class PatientController extends HttpServlet {

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
        String action = request.getParameter("desiredAction");
        
        switch (action) {
            case "add_patient":
            case "remove":
            case "invoice":
            case "add_medicine":
            case "pay":
            default:
                forward(request, response);
        }
    }
    
    private void showAllPatients(HttpServletRequest request, HttpServletResponse response) {
        forward(request, response);
    }
    
    private void addPatient(HttpServletRequest request, HttpServletResponse response) {
        forward(request, response);
    }
    
    private void removePatient(HttpServletRequest request, HttpServletResponse response) {
        forward(request, response);
    }
    
    private void createInvoice(HttpServletRequest request, HttpServletResponse response) {
        forward(request, response);
    }
    
    private void addMedicine(HttpServletRequest request, HttpServletResponse response) {
        forward(request, response);
    }
    
    private void payBill(HttpServletRequest request, HttpServletResponse response) {
        forward(request, response);
    }
    
    private void forward(HttpServletRequest request, HttpServletResponse response) {
        
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
