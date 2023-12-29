package com.mycompany.aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
  
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public int getCarga(){
        return this.carga;
    }
    public void setCarga(int car){
        this.carga = car;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean t){
        this.tampada = t;
    }
    public void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Esta tampada? "+ this.tampada);
    }
    protected void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro!! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampada(){
        this.tampada = false;
    }
}
