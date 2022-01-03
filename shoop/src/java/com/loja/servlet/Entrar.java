/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.loja.servlet;

import com.loja.modelo.MsgErro;
import com.loja.modelo.Usuario;
import com.mocks.bd.Banco;
import com.mocks.bd.Login;
import com.psostudios.validacoes.ValidaUsuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PATOLINODD
 */
@WebServlet(name = "Entrar", urlPatterns = {"/entrar"})
public class Entrar extends HttpServlet {

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
        MsgErro msgErro = new MsgErro();
        ValidaUsuario vu = new ValidaUsuario();
        Login login = new Login();
        String senha = request.getParameter("senha");
        String email = request.getParameter("email");

            Usuario usuarioExiste = vu.validaUsuario(email, senha);
            if(usuarioExiste.getEmail() != null && usuarioExiste.getSenha() != null){
                if(usuarioExiste.getEmail().equals(email) &&  usuarioExiste.getSenha().equals(senha)){
                    login.adicionaUsuario(usuarioExiste);
                    response.sendRedirect("loja");
                }
            }else{
                msgErro.setMensagem("Usuario não existe!");
                response.sendRedirect("msgErro");
            }
    }

}
