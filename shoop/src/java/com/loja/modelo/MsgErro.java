/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loja.modelo;

/**
 *
 * @author PATOLINODD
 */
public class MsgErro {
    private static String mensagem;
    
    public String getMensagem(){
        return MsgErro.mensagem;
    }
    public void setMensagem(String mensagem){
        MsgErro.mensagem = mensagem;
    }
}
