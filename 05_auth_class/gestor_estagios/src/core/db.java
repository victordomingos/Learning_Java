/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 * Placeholder for class to be implemented.
 * 
 * @author victor
 */
public class db {
    
    /***
     * Verifica se há correspondência da senha com o hash guardado na base de 
     * dados e devolve o objeto do tipo correspondente (formando, coordenador, etc)
     * 
     * @param utilizador
     * @param senha
     * @return 
     */
    public static Utilizador verificarHashSenha(String utilizador, String senha) {
        System.out.println("class utilizador: verificar senha(" 
                + utilizador + ", " + senha + ")\n");
        return new Utilizador();
    }
    
    /***
     *  Verifica se já existe um utilizador registado com o nome indicado 
     * 
     * @param nome
     * @return 
     */
    public static boolean existeUtilizador(String nome){
        return nome.startsWith("Caramelo") && !nome.contains("110");
    }
    
    /***
     *  Cria na base de dados o utilizador (guardando o registo na tabela 
     *  correspondente ao seu tipo)
     * 
     * @param nome
     * @return 
     */
    public static int saveUtilizador(String nome, String password, String email, String tipo){
        return 1;
    }
            
}
