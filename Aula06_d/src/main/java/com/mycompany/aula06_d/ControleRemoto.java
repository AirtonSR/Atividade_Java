package com.mycompany.aula06_d;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligando;
    private boolean tocando;

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigando(false);
        this.setTocando(false);
    }
    
    private int getVolume(){
        return this.volume;
    }   
    private void setVolume(int v){
        this.volume = v;
    }
    private boolean getLigando(){
        return this.ligando;
    }
    private void setLigando(boolean l){
        this.ligando = l;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigando(true);
    }

    @Override
    public void desligar() {
        this.setLigando(false);
    }

    @Override
    public void abriMenu() {
        System.out.println("Esta ligado? " + this.getLigando());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("Volume " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("|");
        }
    }

    @Override
    public void fechaMenu() {
        System.out.println("Fechando menu.....");
    }

    @Override
    public void maisVolume() {
        if(this.getLigando()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigando()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligaMudo() {
        if(this.getLigando() && this.getVolume() < 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligaMudo() {
        if(this.getLigando() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigando() && !this.getTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigando() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
