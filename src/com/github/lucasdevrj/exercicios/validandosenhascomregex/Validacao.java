/**
 * Carla está desenvolvendo um sistema de cadastro de usuários e precisa validar as senhas.
 * A senha deve ter pelo menos:
 *
 * 8 caracteres
 * Uma letra maiúscula
 * Uma letra minúscula
 * Um número
 * Um caractere especial
 *
 * Crie um programa que receba uma senha e exiba uma mensagem indicando se a senha é válida ou não.
 *
 * Exemplo de entrada:
 * Digite a senha: Senha123!
 *
 * Saída esperada:
 * A senha é válida.
 */

package com.github.lucasdevrj.exercicios.validandosenhascomregex;

import java.util.Scanner;

public class Validacao {

    private String senha;

    private String getSenha() {
        return senha;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }

    private String validarSenha() {
        boolean temOitoCaracteres = getSenha().length() >= 8;
        boolean temLetraMaiuscula = getSenha().matches(".*[A-Z].*");
        boolean temLetraMinuscula = getSenha().matches(".*[a-z].*");
        boolean temNumero = getSenha().matches(".*\\d.*");
        boolean temCaractereEspecial = getSenha().matches(".*[!@#$%^&*].*");

        if (temOitoCaracteres && temNumero && temLetraMaiuscula && temLetraMinuscula && temCaractereEspecial) {
            return "Senha válida.";
        }

        return "Senha inválida";
    }

    public void digitarSenha() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        setSenha(entrada.nextLine());

        entrada.close();

        System.out.println(validarSenha());
    }

}
