package com.mycompany.aula07_d;

import java.util.Random;

public class Lutar {
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;
    
    public void marcaLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria()&& l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    public void lutar(){
        if(aprovada){
            System.out.println("\n#####DESAFIADOOOOOO#####");
            this.desafiado.aprensentar();
            System.out.println("\n#####DESAFIANTEEEEE#####");
            this.desafiante.aprensentar();
            
            Random Aleatorio = new Random();
            int vencedor = Aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: //empate
                    System.out.println("Empate");
                    this.desafiado.empateLuta();
                    this.desafiante.empateLuta();
                    break;
                case 1: //desafiado vencedor
                    System.out.println("Vencedor foi " + this.desafiado.getNome());
                    this.desafiado.ganhaLuta();
                    this.desafiante.perdeLuta();
                    break;
                    
                case 2: // desafiante vencedor
                    System.out.println("Vencedor foi " + this.desafiante.getNome());
                    this.desafiante.ganhaLuta();
                    this.desafiado.perdeLuta();
                default:
                    break;
            }
        }
        else{
            System.out.println("A luta não pode acontecer");
        }
    }
}
