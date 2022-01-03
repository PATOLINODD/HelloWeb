/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mocks.bd;

import com.loja.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PATOLINODD
 */
public class Login {
    private static Usuario usuario = new Usuario();

    public Usuario getLogado(){
        return Login.usuario;
    }
    public void adicionaUsuario(Usuario usuario){
        Login.usuario = usuario;
    }
}
