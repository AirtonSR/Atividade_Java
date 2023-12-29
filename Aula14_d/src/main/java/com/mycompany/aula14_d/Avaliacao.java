package com.mycompany.aula14_d;

public class Avaliacao{
    private Gafanhoto espectador;
    private Video filme;

    public Avaliacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAula(this.espectador.getTotAula() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliarNota(int nota){
       this.filme.setAvaliacao(nota);
    }
    
    public void avaliarPorc(float porc){
        int tot;
        if(porc <= 20){
          tot = 3;  
        }else if(porc <= 50){
            tot = 5;
        }else if(porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }

    
    
}
