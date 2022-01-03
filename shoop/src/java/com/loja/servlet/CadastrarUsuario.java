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
import java.io.PrintWriter;
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
@WebServlet(name = "CadastrarUsuario", urlPatterns = {"/cadastrarUsuario"})
public class CadastrarUsuario extends HttpServlet {


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
        Banco banco = new Banco();
        Login usuarioLogado = new Login();
        Usuario usuario = new Usuario();
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha1 = request.getParameter("senha1");
        String senha2 = request.getParameter("senha2");

        String senhaValida = vu.validaSenha(senha1, senha2);
        String emailValido = vu.validaEmail(email);
        if(emailValido.equals(email)){
            if(senhaValida.equals(senha1)){
                usuario.setSenha(senhaValida);
                usuario.setEmail(email);
                usuario.setNome(nome);
                banco.adicionaUsuarios(usuario);
                usuarioLogado.adicionaUsuario(usuario);
                response.sendRedirect("loja");
            }else{
                msgErro.setMensagem("as senhas devem ser iguais!");
                response.sendRedirect("msgErro");
            }
        }else{
            msgErro.setMensagem("email inserido já existe!");
            response.sendRedirect("msgErro");
        }
    }
}
