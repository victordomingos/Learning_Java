/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import exception.InvalidUserTypeException;
import exception.InvalidEmailException;
import exception.InvalidPasswordException;
import exception.InvalidUserNameException;
import core.Utilizador;

/**
 *
 * @author victor
 */
public class TestUtilizador {

    public static void main(String[] args) {

        // Registar um utilizador ==========================================
        String username = "Caramelo";
        String password = "coolpassword";
        String email = "emaildoformando@emailprovider.com";
        String tipo = "formando";
        String nome = "";

        try {
            nome = Utilizador.registarUtilizador(username, password, email, tipo);
        } catch (InvalidUserNameException e) {
            System.out.println("Verificar nome de utilizador.");
        } catch (InvalidPasswordException e) {
            System.out.println("Verificar senha.");
        } catch (InvalidEmailException e) {
            System.out.println("Verificar email.");
        } catch (InvalidUserTypeException e) {
            System.out.println("Verificar tipo de utilizador.");
        }

        if (nome.isEmpty()) {
            System.out.println("Ocorreu um erro inesperado ao inserir o registo.");
        } else if (nome.equals(username)) {
            System.out.println("Utilizador registado com sucesso.");
        } else {
            System.out.println("O utilizador já existe, mas \""
                    + nome
                    + "\" ainda está disponível. Pretende utilizar este nome?");
        }

        // Testar iserçao de novo utilizador - parte 2
        try {
            nome = Utilizador.registarUtilizador(nome, password, email, tipo);
            if (nome.equals(nome)) {
                System.out.println("Utilizador registado com sucesso.");
            } else {
                System.out.println("O utilizador já existe, mas \""
                        + nome
                        + "\" ainda está disponível. Pretende utilizar este nome?");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado ao inserir o registo.");
        }

        // Iniciar sessão obtendo objeto de utilizador se senha corresponder ======
        Utilizador u = Utilizador.verificarUtilizadorSenha(
                "username",
                "coolpassword");

        System.out.println(u);

    }
}
