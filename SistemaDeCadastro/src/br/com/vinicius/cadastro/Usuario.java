/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vinicius.cadastro;

public class Usuario {
    
    private String nome;
    private String sobrenome;
    private int idade;
    private int uNumber;
    private String sexo;
    
    public Usuario( String nome, String sobrenome, int idade, String sexo, int uNumber){
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
                """,uNumber+1, nome, sobrenome, idade, sexo );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getuNumber() {
        return uNumber;
    }

    public void setuNumber(int uNumber) {
        this.uNumber = uNumber;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
