/**
 * Roberto está desenvolvendo um sistema de cadastro de clientes e precisa validar os
 * números de CPF fornecidos. Ele quer um programa que verifique se o CPF está no
 * formato correto (XXX.XXX.XXX-XX).
 *
 * Crie um programa que receba um CPF e exiba uma mensagem indicando se o CPF está no formato válido.
 *
 * Exemplo de entrada:
 * Digite o CPF: 123.456.789-09
 *
 * Saída esperada:
 * O CPF 123.456.789-09 está no formato válido.
 */

package com.github.lucasdevrj.exercicios.validandocpf;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacao {

    private String cpf;

    private String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void validarCpf() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        setCpf(entrada.nextLine());

        Pattern padrao = Pattern.compile("\\d{3}+.\\d{3}+.\\d{3}-\\d{2}");
        Matcher achador = padrao.matcher(getCpf());

        entrada.close();

        if (achador.matches()) {
            System.out.printf("O CPF %s está no formato válido.", getCpf());
        } else {
            System.out.println("Formato inválido.");
        }

    }

}

