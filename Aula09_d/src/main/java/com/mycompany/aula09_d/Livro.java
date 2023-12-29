package com.mycompany.aula09_d;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual = 0;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }
    
    
    
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void avancaPag() {
        this.pagAtual++;
    }

    @Override
    public void voltaPag() {
        this.pagAtual--;
    }

    public String Detalhes() {
        return "Leitor " + leitor.getNome() + "\nIdade " + leitor.getIdade() + "\nSexo " + leitor.getSexo() + "\nTitulo " + titulo + "\nAutor " + autor + "\nTotal de paginas " + totPaginas + "\nPagina Atual "+ pagAtual + "\naberto " + aberto + "\n";
    }
    
    
}
