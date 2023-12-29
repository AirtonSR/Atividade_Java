package com.mycompany.aula10_h;

public class Funcionario extends Pessoa {
    
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
    
    public String getSetor(){
        return setor;
    }
    
    public void setSetor(String s){
        this.setor = s;
    }
    
    public boolean getTrabalhado(){
        return trabalhando;
    }
    
    public void setTrabalhando(boolean t){
        this.trabalhando = t;
    }
}
