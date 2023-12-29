package com.mycompany.aula10_h;

public class Aluno extends Pessoa{
    
    private int matricula;
    private String curso;
    
    public void cancelarMatricula(){
        System.out.println("\nSua matricula foi cancelada");
    }
    
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int m){
        this.matricula = m;
    }
    
    public String getCurso(){
        return curso;
    }
    public void setCurso(String c){
        this.curso = c;
    }
    
    public void status(){
        System.out.println("Meu nome é: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
    }
}
