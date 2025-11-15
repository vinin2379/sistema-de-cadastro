/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vinicius.cadastro;

/**
 *
 * @author Vinicius
 */
public class Usuario {
    
    private String nome;
    private String sobrenome;
    private int idade;
    private int uNumber;
    private String sexo;
    
    public Usuario( String nome, String sobrenome, int idade, String sexo, int uNumer){
        this.uNumber = uNumber;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    @Override
    public String toString(){
        return String.format(
                """
                Usuario %d:
                     Nome: %s
                     Sobrenome: %s
                     Idade: %d
                     Sexo: %s
                """,uNumber, nome, sobrenome, idade, sexo );
    }
    
}
