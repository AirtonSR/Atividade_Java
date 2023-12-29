package com.mycompany.aula09_d;


public class Aula09_d {

    public static void main(String[] args) {
       
        Livro v[] = new Livro[2];
        Pessoa p[] = new Pessoa[2];
        
        p[0] = new Pessoa("Airton", 21, "Masculino");
        p[1] = new Pessoa("Francisco", 40, "Masculino");
        v[0] = new Livro("Aprendendo POO em java", "Gustavo guanabara", 10, p[0]);
        v[1] = new Livro("Aprendendo MySQL", "Gustavo Guanabara", 6, p[1]);
        
        v[0].abrir();
        v[0].folhear(10);
        v[0].avancaPag();
        
        System.out.println(v[0].Detalhes());
    }
}
