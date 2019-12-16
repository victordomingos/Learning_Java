/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Placeholder for class to be implemented.
 *
 * @author victor
 */
public class Utils {

    public static final String ADMINISTRADOR = "administrador";
    public static final String COORDENADOR = "coordenador";
    public static final String FORMANDO = "formando";
    public static final String RESP_ENTIDADE = "responsavelEntidade";

    public static final Set<String> TIPOS_DE_UTILIZADOR = new HashSet<String>(
            Arrays.asList(new String[]{FORMANDO, ADMINISTRADOR,
        COORDENADOR, RESP_ENTIDADE}));

    // nomes das Pastas de 
    public static final String PASTA_ADMIN = "admin";
    public static final String PASTA_COORDENADOR = "coord";
    public static final String PASTA_FORMANDO = "formando";
    public static final String PASTA_RESP_ENTIDADE = "ent";

    public static String gerarSenhaAleatoria() {
        return "SenhaAleatóriaUltra-Segura12334#$%";
    }

    public static String calcularHashSenha(String senha) {
        return "1=))/%%#$%#$%& SenhaBemEmbaralhadaComAlgortimoEspecial 12379/";
    }

    static boolean isPasswordFormatValid(String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean isUserNameFormatValid(String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean isUserEmailFormatValid(String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
