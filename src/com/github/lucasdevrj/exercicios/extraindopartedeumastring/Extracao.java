/**
 * Pedro está desenvolvendo um sistema de processamento de arquivos e precisa extrair o nome
 * do arquivo sem a extensão. Crie um programa que receba o nome de um arquivo e exiba o nome
 * sem a extensão.
 *
 * Exemplo de entrada:
 * Digite o nome do arquivo: relatorio_final.pdf
 *
 * Saída esperada:
 * Nome do arquivo sem extensão: relatorio_final
 */

package com.github.lucasdevrj.exercicios.extraindopartedeumastring;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extracao {

    public String extraiExtensaoDoArquivo() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String nomeDoArquivo = entrada.nextLine();

        while (!nomeDoArquivo.matches("\\w+\\.\\w+$")) {
            System.out.println("Digite a extensão do arquivo.");
            System.out.print("Digite o nome do arquivo: ");
            nomeDoArquivo = entrada.nextLine();
        }

        entrada.close();

        String regex = "\\w+";
        Pattern padrao = Pattern.compile(regex);
        Matcher verificaSeTaNoPadrao = padrao.matcher(nomeDoArquivo);

        if (verificaSeTaNoPadrao.find()) {
            return String.format("Nome do arquivo sem extensão: %s", verificaSeTaNoPadrao.group());
        }

        return "Nome de arquivo inválido.";
    }

}
