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
    private int uCounter = 0;
    
    public UsuarioRepository( ){
        users = new ArrayList<>();
    }
            
    public void addUsuario( Usuario u ){
        users.add(u);
        uCounter++;
        System.out.println(uCounter);
    }
    
    public void listAllUsuarios(){
        for(int i = 0; i < uCounter; i++){
            System.out.println(users.get(i));
        }
    }
    
    public void listUsuarios(){
        for(int i = 0; i < uCounter; i++){
            System.out.printf("\n%d: "+ users.get(i).getNome(),i+1);
        }
    }
    
    public void removeUsuario( int n ){
        users.remove(n);
        uCounter--;
    }

    public int getuCounter() {
        return uCounter;
    }
    
}
