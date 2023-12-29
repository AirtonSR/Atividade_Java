package com.mycompany.aula07_d;

public class Aula07_d {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Airton", "EUA", 21, 1.84f, 76.4f, 14, 0, 5);
        l[1] = new Lutador("Julio", "Alemão", 21, 1.76f, 75, 9, 2, 1);
        l[2] = new Lutador("Gleidson", "Russo", 20, 1.70f, 73.6f, 7, 5, 5);
        l[3] = new Lutador("Francisco", "Canáda", 47, 1.75f, 80, 5, 2, 1);
        l[4] = new Lutador("Jose", "Argentino", 25, 1.67f, 70, 0, 6, 5);
        l[5] = new Lutador("Ailton", "Brasil", 19, 1.90f, 84.7f, 17, 7, 5);
        
        
        Lutar UFC = new Lutar();
        UFC.marcaLuta(l[0], l[5]);
        UFC.lutar();
        
    }
    
}
