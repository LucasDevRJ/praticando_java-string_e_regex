package com.github.lucasdevrj.exercicios.removedorespacosembranco;

public class Principal {
    public static void main(String[] args) {
        RemovedorDeEspacosEmBranco removedorDeEspacosEmBranco = new RemovedorDeEspacosEmBranco();
        String nome = "     Lucas        Pereira       de    Lima    ";
        String nomeFormatado = removedorDeEspacosEmBranco.remove(nome);

        System.out.println("Nome antes da formatação = " + nome);
        System.out.println("Nome depois da formatação = " + nomeFormatado);
    }
}
