package com.mycompany.aula05_d;

public class Conta {
    private String titular;
    public int numConta;
    protected String tipo;
    private float saldo;
    private boolean status;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String ti) {
        this.titular = ti;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tip) {
        this.tipo = tip;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float sa) {
        this.saldo = sa;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }
    
    public Conta(){
        this.setSaldo(0);
        this.setStatus(false);
        
    }
    public void abrirConta(String t){
        setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo(50);
        }else if (t == "CP"){
            this.setSaldo(150);
        }else{
            System.out.println("Erro!!!");
        }
    }
    
    public void fechaConta(){
        if(this.saldo > 0){
            System.out.println("A conta tem dinheiro!!!");
        }else if (this.saldo < 0){
            System.out.println("Conta em debito");
            
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(getSaldo()+ v);
            System.out.println("Depositado na conta de " + this.getTitular());
        }else{
            System.out.println("Abra sua conta");
        }  
    }
    
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Sacado com sucesso");
            }else{
                System.out.println("saldo insuficiente");
            }
            
        }else{
            System.out.println("impossivel sacar");
        }
    }
    
    public void pagarMensal()
    {
        float v = 0;
        
        if(this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }else{
            System.out.println("Impossivel tirar a mensalidade");
        }
        
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso " + this.getTitular());
        }else{
            System.out.println("Impossivel Pagar uma conta fechada");
        }
        
    }
    public void statusAtual(){
        System.out.println("");
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}