/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vinicius.cadastro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinicius
 */
public class UsuarioRepository {
    
    private List<Usuario> users;
    private Usuario u;
    private int uCounter;
    
    public UsuarioRepository( ){
        users = new ArrayList<>();
    }
            
    public void addUsuario( Usuario u, int uNumber ){
        this.uCounter = uNumber;
        
        users.add(u);
    }
    
    public void listAllUsuarios(){
        for(int i = 0; i <= uCounter; i++){
            System.out.println(users.get(i));
        }
    }
    
    public void listUsuarios(){
        for(int i = 0; i <= uCounter; i++){
            System.out.printf("\n%d: "+ users.get(i).getNome(),i);
        }
    }
    
}
