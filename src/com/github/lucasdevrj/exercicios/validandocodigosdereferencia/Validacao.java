/**
 * Pedro está desenvolvendo um sistema de controle de produtos e precisa verificar
 * se os códigos de referência dos produtos seguem o formato correto. O formato do
 * código de referência é composto por:
 *
 * 3 letras maiúsculas
 * Um hífen
 * 4 dígitos numéricos
 *
 * Crie um programa que receba um código de referência e informe se ele
 * está no formato correto.
 *
 * Exemplo de entrada:
 * Digite o código de referência: ABC-1234
 *
 * Saída esperada:
 * O código de referência está válido.
 */

package com.github.lucasdevrj.exercicios.validandocodigosdereferencia;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacao {

    private String codigoReferencia;

    private String getCodigoReferencia() {
        return codigoReferencia;
    }

    private void setCodigoReferencia(String codigoReferencia) {
        this.codigoReferencia = codigoReferencia;
    }

    public void validarCodigoReferencia() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código de referência: ");
        setCodigoReferencia(entrada.nextLine());

        entrada.close();

        System.out.println(formataCodigoReferencia());
    }

    private String formataCodigoReferencia() {
        String regex = "([A-Z]{3})(-)(\\d{4})";
        Pattern padrao = Pattern.compile(regex);
        Matcher procurador = padrao.matcher(getCodigoReferencia());

        if (procurador.matches()) {
            return "O código de referência está válido.";
        }

        return "Código inválido.";
    }
}
