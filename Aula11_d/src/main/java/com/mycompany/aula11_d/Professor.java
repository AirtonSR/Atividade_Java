package com.mycompany.aula11_d;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAumento(float s){
       this.salario += s;
        System.out.println("Seu salario atual é: " + this.salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("idade: " + this.getIdade());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Sexo: " + this.sexo());
    }
    
}
