
package com.mycompany.aula03;

public class Aula03 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("Bic cristal");
        c1.setCor("Azul");
        c1.setPonta(0.5f);
        c1.setCarga(67);
        c1.setTampada(true);
        c1.status();
    }
}
