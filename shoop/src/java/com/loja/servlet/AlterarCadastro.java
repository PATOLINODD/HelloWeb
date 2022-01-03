/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.loja.servlet;

import com.loja.modelo.Usuario;
import com.mocks.bd.Banco;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PATOLINODD
 */
@WebServlet(name = "AlterarCadastro", urlPatterns = {"/alterarCadastro"})
public class AlterarCadastro extends HttpServlet {
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
        Integer id = Integer.valueOf(request.getParameter("id"));
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        Banco bd = new Banco();
        Usuario usuario = bd.getUsuario(id);
        usuario.setEmail(email);
        usuario.setNome(nome);
        usuario.setSenha(senha);
        
        response.sendRedirect("loja");
    }

}
