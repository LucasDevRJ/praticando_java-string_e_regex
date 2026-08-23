/**
 * Ana está desenvolvendo um sistema de edição de textos e precisa substituir uma palavra específica
 * por outra em um texto. Crie um programa que:
 *
 * Receba um texto, uma palavra a ser substituída e uma nova palavra, exiba o texto com as substituições realizadas.
 * Se a palavra a ser substituída não for encontrada no texto, o programa deve informar ao usuário
 * que a palavra não foi encontrada e encerrar a execução.
 *
 * Exemplo de entrada:
 * Digite o texto: O gato caça o rato.
 * Digite a palavra a ser substituída: gato
 * Digite a nova palavra: cachorro
 *
 * Saída esperada:
 * Texto modificado: O cachorro caça o rato.
 */

package com.github.lucasdevrj.exercicios.substituindopartedeumastring;

import java.util.Scanner;

public class Edicao {

    public void substituirPalavra() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = entrada.nextLine();

        System.out.print("Digite a palavra a ser substituída: ");
        String palavraASerSubsituida = entrada.nextLine();

        System.out.print("Digite a nova palavra: ");
        String novaPalavra = entrada.nextLine();

        entrada.close();

        texto = texto.replace(palavraASerSubsituida, novaPalavra);

        System.out.printf("Texto modificado: %s", texto);
    }

}
