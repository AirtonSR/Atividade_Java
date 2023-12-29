package com.mycompany.aula10_h;

public class Professor extends Pessoa{
    
    private String especialidade;
    private float salario;
    
    public void receberAumento(float a){
        this.salario += a;
        
        System.out.println("Salario com aumento é : " + this.getSalario());
    }
    
    public String getEspecialidade(){
        return especialidade;
    }
    
    public void setEspecialidade(String e){
        this.especialidade = e;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(int s){
        this.salario = s;
    }
}
