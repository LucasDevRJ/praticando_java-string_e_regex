/**
 * Carlos está desenvolvendo um sistema de relatórios e precisa padronizar o texto para que todos
 * os títulos estejam em maiúsculas e as descrições em minúsculas. Faça um programa que receba um
 * texto e exiba o texto em maiúsculas e o texto em minúsculas.
 *
 * Exemplo de entrada:
 * Digite o texto: Olá, Mundo!
 *
 * Saída esperada:
 * Texto em maiúsculas: OLÁ, MUNDO!
 * Texto em minúsculas: olá, mundo!
 */

package com.github.lucasdevrj.exercicios.convertendomaiusculasparaminusculas;

public class Conversor {

    public String formataTitulo(String titulo) {
        String tituloEmMaiusculo = titulo.toUpperCase();
        return tituloEmMaiusculo;
    }

    public String formataTexto(String texto) {
        String textoEmMinusculo = texto.toLowerCase();
        return textoEmMinusculo;
    }

}
