/**
 * Joana está desenvolvendo um sistema de cadastro de usuários e percebeu que muitos nomes estão
 * sendo cadastrados com espaços em branco no início ou no final. Ela quer um programa que remova
 * esses espaços automaticamente.
 *
 * Crie um programa que receba um nome e exiba o nome sem espaços em branco no início ou no final.
 *
 * Exemplo de entrada:
 * Digite o nome:    João Silva
 *
 * Saída esperada:
 * Nome sem espaços: João Silva
 */

package com.github.lucasdevrj.exercicios.removedorespacosembranco;

public class RemovedorDeEspacosEmBranco {

    public String remove(String nome) {
       String nomeFormatado = nome.trim();
       nomeFormatado = nomeFormatado.replaceAll("\\s+", " ");
       return nomeFormatado;
    }

}
