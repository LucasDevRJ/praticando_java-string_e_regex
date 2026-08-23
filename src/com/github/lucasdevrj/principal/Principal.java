package com.github.lucasdevrj.principal;

public class Principal {
    public static void main(String[] args) {
        String professor = "Jacqueline Oliveira";
        String disciplina = "Java e Programação Orientada a Objetos                      ";
        String curriculo = """
                Pós graduada em Engenharia e
                Arquitetura de Software
                Desenvolvedora Back-end Java desde 2010
                """;

        System.out.println(curriculo);

        String texto = String.format("Disciplina: %s - %s", disciplina.trim(), professor.toUpperCase());
        System.out.println(texto);

        System.out.printf("Nome: %s %nDisciplina: %s", professor.toLowerCase(), disciplina.replace("Programação Orientada a Objetos", "POO"));
    }
}
