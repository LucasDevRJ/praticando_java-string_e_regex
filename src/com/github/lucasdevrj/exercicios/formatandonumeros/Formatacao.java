/**
 * Roberto está desenvolvendo um sistema de relatórios financeiros e precisa formatar
 * valores monetários com duas casas decimais. Construa um programa que receba um valor
 * monetário e exiba o valor formatado com duas casas decimais.
 *
 * Exemplo de Entrada:
 * Digite o valor: 19,9876
 *
 * Saída esperada:
 * Valor formatado: R$ 19,99
 */

package com.github.lucasdevrj.exercicios.formatandonumeros;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Formatacao {

    private BigDecimal valor;

    private String getValor() {
        NumberFormat formatoBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String precoFormatado = formatoBR.format(valor);
        return precoFormatado;
    }

    private void setValor(BigDecimal valor) {
        this.valor = valor.setScale(2, RoundingMode.HALF_UP);
    }

    public void formataValor() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        setValor(entrada.nextBigDecimal());

        entrada.close();

        System.out.println("Valor formatado: " + getValor());
    }
}
