/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vinicius.cadastro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Vinicius
 */
public class FileService {
    private static final String PATH = "usuarios.csv";
    
    public void saveUsuario( List<Usuario> users ){
        try(FileWriter fw = new FileWriter( PATH ) ){
            for( Usuario u : users ){
                fw.write( u.getNumUser() + ";" + u.getNome() + ";" + u.getSobrenome() + ";" + u.getIdade() + ";" + u.getSexo() + "\n");
            }
        } catch ( IOException e ){
            
        } 
    }
    
    public void loadUuarios( UsuarioRepository rep ){
        try ( BufferedReader br = new BufferedReader( new FileReader( PATH ) ) ){
            String linha;
            
            while( ( linha = br.readLine() )!= null ){
                String[] partes = linha.split(";");
                
                int numUser = Integer.parseInt( partes[0] );
                String nome = partes[1];
                String sobrenome = partes[2];
                int idade = Integer.parseInt( partes[3] );
                String sexo = partes[4];
                
                Usuario u = new Usuario(nome, sobrenome, idade, sexo);
                rep.addUsuario(u);
            }
            
            
        } catch( IOException e ){
            System.out.print( "\nNenhum arquivo encontrado. Criando novo..." );
        }
    }
    
}
