package com.github.lucasdevrj.principal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrincipalRegex {
    public static void main(String[] args) {
        String texto = "Meu email é jacqueline@gmail.com";
        String texto2 = "Meu email da empresa é jacqueline@alura.com";
        Pattern padrao = Pattern.compile("\\w+@\\w+.\\w+");
        Matcher verificaSeTemPadrao = padrao.matcher(texto);
        Matcher verificaSeTemPadrao2 = padrao.matcher(texto2);

        if (verificaSeTemPadrao.find()) {
            System.out.println(verificaSeTemPadrao.group());
        }

        if (verificaSeTemPadrao2.find()) {
            System.out.println(verificaSeTemPadrao2.group());
        }

        System.out.println(formatarTelefone("2199887744"));
    }

    public static String formatarTelefone(String telefone) {
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        if (matcher.matches()) {
            return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        }

        return "Número de telefone inválido.";
    }

}
