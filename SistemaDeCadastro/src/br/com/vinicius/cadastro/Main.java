/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vinicius.cadastro;

import java.util.Scanner;

/**
 * 
 * @author Vinicius
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        
        Usuario u = null;
        UsuarioRepository rep = new UsuarioRepository();
        int idade;
        String nome;
        String sobrenome;
        String sexo;
        boolean exit = false;
        char c;
        
        do{
            System.out.print( """
                            \n\nMenu do Sistema:
                                [C] Cadastrar novo Usuario.
                                [E] Excluir Usuario.
                                [L] Listar Nomes Usuarios.
                                [T] Todos Usuarios.
                                [X] Sair.
                              """);
            
            System.out.print( "Selecione a opcao desejada: " );
            
            c = scan.nextLine().charAt(0);
            
            switch (c) {
                case 'C':
                
                    System.out.print("Nome: ");
                    nome = scan.nextLine();
                    System.out.print("Sobrenome: ");
                    sobrenome = scan.nextLine();
                    System.out.print("Idade: ");
                    idade = Integer.parseInt( scan.nextLine() );
                    System.out.print("Sexo: ");
                    sexo = scan.nextLine();
                    
                    u = new Usuario( nome, sobrenome, idade, sexo );
                    rep.addUsuario( u );
              
                    
                    break;
                    
                case 'E':   
                    rep.removeUsuario();
                    break;
                    
                case 'L':
                    rep.listUsuarios();
                    break;
                    
                case 'T':
                    rep.listAllUsuarios();
                    break;
                       
                case 'X':
                    exit = true;
                    System.out.println( "Saindo!" );
                    break;
                    
                default:
                    break;
            }
                            
            
        }while( exit == false );       
        
        scan.close();
    }
    
}
