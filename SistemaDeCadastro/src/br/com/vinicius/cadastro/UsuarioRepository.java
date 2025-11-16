/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vinicius.cadastro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Vinicius
 */
public class UsuarioRepository {
    
    private List<Usuario> users;
    private Usuario u;
    private int uCounter = 0;
    Scanner scan = new Scanner( System.in );
    
    public UsuarioRepository( ){
        users = new ArrayList<>();
    }
            
    public void addUsuario( Usuario u ){
        users.add(u);
        uCounter++;
        u.setNumUser(uCounter);
    }
    
    public void listAllUsuarios(){
        if( uCounter >= 1){
            for(int i = 0; i < uCounter; i++){
                System.out.println(users.get(i));
            }
        }else{
            System.out.print( "ERRO!! Nenhum usuario registrado no momento" );
        }
    }
    
    public void listUsuarios(){
        if( uCounter >= 1){    
            for(int i = 0; i < uCounter; i++){
                System.out.printf("\n%d: "+ users.get(i).getNome(),i+1);
            }
        }else{
            System.out.print( "ERRO!! Nenhum usuario registrado no momento" );
        }
    }
    
    public void removeUsuario(){
        if( uCounter >= 1 ){
            for(int i = 0; i < uCounter; i++){
                System.out.printf("%d: "+ users.get(i).getNome()+ " ",i+1);
            }
            System.out.print("\nDigite o numero do Usuario a ser removido: ");
            int n = Integer.parseInt( scan.nextLine() );
            
            System.out.print("\nUsuario (" + users.get(n-1).getNome()+ ") removido com sucesso!!");

            users.remove( n-1 );
            uCounter--;
            
            for( Usuario u: users ){
                if(u.getNumUser()> 1){
                    u.setNumUser(u.getNumUser()-1);
                }
            }   
        }else{
            System.out.print( "ERRO!! Nenhum usuario registrado no momento" );
        }
        
    }

    public int getuCounter() {
        return uCounter;
    }

    public List<Usuario> getUsers() {
        return users;
    }

    public void setUsers(List<Usuario> users) {
        this.users = users;
    }
    
}
