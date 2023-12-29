package com.mycompany.aula12_d;

public class Canguru extends Mamifero{
    
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Pulando");
    }
    
}
