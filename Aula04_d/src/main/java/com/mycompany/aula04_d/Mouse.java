package com.mycompany.aula04_d;
public class Mouse {
    private boolean ligar;
    private String modo;
    private int qtdBotoes;

    public Mouse(String modo, int qtdBotoes) {
        this.setModo(modo);
        this.setQtdBotoes(qtdBotoes);
    }

    public boolean getLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public int getQtdBotoes() {
        return qtdBotoes;
    }

    public void setQtdBotoes(int qtdBotoes) {
        this.qtdBotoes = qtdBotoes;
    }
    
    public void ligando(){
        this.setLigar(true);
    }
    
    public void fechar(){
        this.setLigar(false);
    }
    
    public void mexendo(){
        if(this.getLigar() == true){
            System.out.println("Mexendo");
        }else{
            System.out.println("Ligue seu mouse");
        }
    }
    
    public void Status(){
        System.out.println("Ligado? " + this.getLigar());
        System.out.println("Modelo " + this.getModo());
        this.mexendo();
    }
}
