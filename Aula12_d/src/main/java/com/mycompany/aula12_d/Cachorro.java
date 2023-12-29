package com.mycompany.aula12_d;

public class Cachorro extends Mamifero{
    
    public void enterraOsso(){
        System.out.println("Interrando osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando rabo <>");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo");  
    }
    
}
