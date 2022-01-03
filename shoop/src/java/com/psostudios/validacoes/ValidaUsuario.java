/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psostudios.validacoes;

import com.loja.modelo.Usuario;
import com.mocks.bd.Banco;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author PATOLINODD
 */
public class ValidaUsuario {

    Banco bd = new Banco();
    Usuario usuario = new Usuario();

    //valida se email existe. Email deve ser unico
    public String validaEmail(String email){ 
        ArrayList<Usuario> lista = bd.getUsuarios();
        Iterator it = lista.iterator();
        while(it.hasNext()){
            usuario = (Usuario)it.next();
            if(usuario.getEmail().equals(email)){
                return "";
            }
        }
        return email;
    }
    
    //valida se senha é diferente ou igual. Senhas devem ser iguais
    public String validaSenha(String senha1, String senha2){
        if(senha1.equals(senha2)){
            return senha1;
        }
        return "";
    }
    public Usuario validaUsuario(String email, String senha) { 
        ArrayList<Usuario> lista = bd.getUsuarios();
        for(Iterator<Usuario> usuAtual = lista.iterator(); usuAtual.hasNext();){
            usuario = usuAtual.next();
            if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)){
                return usuario;
            }
        }
        return new Usuario();
    }
}
