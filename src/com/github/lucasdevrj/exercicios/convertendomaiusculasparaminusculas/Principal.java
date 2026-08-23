package com.github.lucasdevrj.exercicios.convertendomaiusculasparaminusculas;

public class Principal {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        System.out.println(conversor.formataTitulo("Java"));
        System.out.println(conversor.formataTexto("Eu Gosto de Estudar Java na Alura, " +
                "Porque Aprecio a Didática da Plataforma."));
    }
}
