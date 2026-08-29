/**
 * Patrícia está desenvolvendo um sistema de análise de redes sociais e precisa extrair todas
 * as hashtags de um texto. Ela quer um programa que encontre todas as palavras que começam com "#".
 *
 * Crie um programa que receba um texto e exiba todas as hashtags encontradas.
 *
 * Exemplo de entrada:
 * Digite o texto: Olá #mundo! Estou aprendendo #Java e #programação.
 *
 * Saída esperada:
 * Hashtags encontradas: #mundo, #Java, #programação
 */

package com.github.lucasdevrj.exercicios.extraindohastagsdeumtexto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extracao {

    private String texto;

    private void setTexto(String texto) {
        this.texto = texto;
    }

    private String getTexto() {
        return texto;
    }

    public void extrairHashtags() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        setTexto(entrada.nextLine());

        Pattern padrao = Pattern.compile("#[a-zA-Z0-9çã]+");
        Matcher verificaSeTemPadrao = padrao.matcher(getTexto());

        StringBuilder hashtagsEncontradas = new StringBuilder();
        while (verificaSeTemPadrao.find()) {
            hashtagsEncontradas.append(verificaSeTemPadrao.group() + " ");
        }

        String resultado = hashtagsEncontradas.toString();
        System.out.println("Hashtags encontradas: " + resultado);
    }
}
