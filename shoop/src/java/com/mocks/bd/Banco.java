
package com.mocks.bd;
import com.loja.modelo.*;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author PATOLINODD
 */
public class Banco {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static Integer pkUsuario = 1;

    public ArrayList<Usuario> getUsuarios(){
        return Banco.usuarios;
     }

    public void adicionaUsuarios(Usuario cliente){
        cliente.setId(Banco.pkUsuario++);
        Banco.usuarios.add(cliente);
    }
    public void excluirUsuario(Integer id){
        for(Iterator<Usuario> usuAtual = usuarios.iterator(); usuAtual.hasNext();){
            Usuario usuario = usuAtual.next();
            if(usuario.getId().equals(id)){
                usuAtual.remove();
            }
        }
    }
    public Usuario getUsuario(Integer id){
        for(Iterator<Usuario> usuario = usuarios.iterator(); usuario.hasNext();){
            Usuario usuAtual = usuario.next();
            if(usuAtual.getId().compareTo(id) == 0){
                return usuAtual;
            }
        }
        return new Usuario();
    }
}
