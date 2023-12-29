package com.mycompany.aula03_d;

public class Celular {
    public String usuario;
    private boolean ligar;
    private String entrar;
    
    public void ligarCelular(){
        this.setLigar(true);
    }
    
    public void desligarCelular(){
        this.setLigar(false);
    }
    
    public void entrar(int senha){
        if(senha == 1234){
            System.out.println("Entrandoooo");
        }else{
            System.out.println("Você não tem acesso");
        }
    }
    
    public void status(){
        System.out.println("USUARIO " + this.getUsuario());
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean getLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public String getEntrar() {
        return entrar;
    }

    public void setEntrar(String entrar) {
        this.entrar = entrar;
    }
    
}
