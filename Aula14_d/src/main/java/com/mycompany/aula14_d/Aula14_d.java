package com.mycompany.aula14_d;

public class Aula14_d {

    public static void main(String[] args) {
        
        Gafanhoto g1 = new Gafanhoto("Airton", 21, "M", "AirtonXPXL");
        
        Video v1 = new Video("Aula Pratica");
        Video v2 = new Video("Aula de HTML5");
        
        Avaliacao av = new Avaliacao(g1, v1);
        Avaliacao av1 = new Avaliacao(g1, v2);
        
        System.out.println(av.toString());
        System.out.println(av1.toString());
    }
}
