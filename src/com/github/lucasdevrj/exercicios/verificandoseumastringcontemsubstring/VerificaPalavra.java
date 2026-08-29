/**
 * Laura está desenvolvendo um sistema de busca e precisa verificar se uma palavra específica
 * está presente em um texto. Crie um programa que receba um texto e uma palavra, e exiba uma
 * mensagem indicando se a palavra está presente no texto.
 *
 * Exemplo de entrada:
 * Digite o texto: O gato caça o rato.
 * Digite a palavra: gato
 *
 * Saída esperada:
 * A palavra "gato" está presente no texto.
 */

package com.github.lucasdevrj.exercicios.verificandoseumastringcontemsubstring;

import java.util.Scanner;

public class VerificaPalavra {

    private String texto;
    private String palavra;

    private String getTexto() {
        return texto;
    }

    private void setTexto(String texto) {
        this.texto = texto;
    }

    private String getPalavra() {
        return palavra;
    }

    private void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void verificar() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        setTexto(entrada.nextLine());

        System.out.print("Digite a palavra: ");
        setPalavra(entrada.nextLine());

        entrada.close();

        String textoTemPalavra = getTexto().contains(getPalavra()) ?
                String.format("A palavra %s está presente no texto.", getPalavra()) :
                String.format("A palavra %s não está presente no texto.", getPalavra());

        System.out.println(textoTemPalavra);

    }
}
