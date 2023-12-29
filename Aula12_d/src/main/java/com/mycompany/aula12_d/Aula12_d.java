package com.mycompany.aula12_d;
public class Aula12_d {

    public static void main(String[] args) {
        
        Mamifero m1 = new Mamifero();
        
        m1.setPeso(40.5f);
        m1.setIdade(2);
        m1.setMembro(4);
        m1.locomover();
        m1.emitirSom();
        
        Canguru c1 =  new Canguru();
        
        System.out.print("\n");
        c1.locomover();
    }
}
