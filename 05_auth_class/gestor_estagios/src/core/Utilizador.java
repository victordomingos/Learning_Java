package core;

import db.MyDb;
import exception.InvalidUserTypeException;
import exception.InvalidEmailException;
import exception.InvalidPasswordException;
import exception.InvalidUserNameException;
import java.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @authors Daniel Santos, Miguel Lopes, Victor Domingos
 */
public class Utilizador {  //TO-DO: make this abstract?

    private int id;
    private String utilizador;
    private String hashSenha;
    private String nome;
    private String email;
    private String tipoUtilizador;
    private int estado;
    private static final MyDb db = new MyDb();
    private static final Set<String> tipos_de_utilizador = new HashSet<String>(
            Arrays.asList(new String[]{"formando", "administrador",
        "coordenador", "responsavelEntidade"}));

    public Utilizador() {
        id = -1;
        utilizador = "";
        hashSenha = "";
        nome = "";
        email = "";
        tipoUtilizador = "";
        estado = -1;
    }

    /**
     * Tenta registar um utilizador. Caso nome já exista na base de dados,
     * devolve uma string com uma sugestão de um nome alternativo. Caso não
     * exista e a criação do registo seja bem sucedida, devolve o mesmo nome de
     * utilizador. Caso falhe a inserção do registo, devolve string vazia.
     *
     * @param username
     * @param senha
     * @param email
     * @param tipo
     * @return
     * @throws exceptions.InvalidUserTypeException
     */
    public static String registarUtilizador(String username, String senha,
            String email, String tipo) throws InvalidUserTypeException, 
            InvalidPasswordException, InvalidUserNameException, 
            InvalidEmailException {
        
        System.out.println("\nA registar " + tipo + " (" + username + ", "
                + senha + ", " + email + ")\n");
        // conforme o tipo de utilizador:
        // verificar se já existe utilizador com esse nome
        // se já existir, sugerir um nome parecido que ainda não exista (com algarismos)
        if (db.existeUtilizador(username)) {
            String sugestao = username;
            for (int n = 1; db.existeUtilizador(sugestao); n++) {
                sugestao = username + Integer.toString(n);
            }
            return sugestao;
        } else {
            // verificar se dados sao válidos
            // verificar formato do nome de utilizador
            // verificar formato da senha
            // verificar formato do email

            if (!tipos_de_utilizador.contains(tipo)) {
                throw new InvalidUserTypeException(tipo);
            }
            
            

            // se dados forem validos, gerar senha aleatoria,
            String password = Utils.gerarSenhaAleatoria();
            
            // calcular hash da senha e 
            String hashSenha = Utils.calcularHashSenha(senha);
            int status = 0;
            // chamar o metodo correspondente da base de dados para inserir 
            // novo registo
            try {
                if (db.saveUtilizador(username, hashSenha, email, tipo) != -1) {
                    status = 1;
                }
            } catch (Exception e) {
                return "";
            }

            if (status == 1) {
                // enviar email ao utilizador com username e senha temporária
                // e instrucoes para redefinir senha.
                return username;
            } else {
                return "";
            }
        }
    }

    /**
     * Verifica se conjunto utilizador/senha são válidos e devolve um objeto do
     * tipo correspondente caso os dados não correspondam, devolve null
     *
     * @param utilizador
     * @param senha
     * @return
     */
    public static Utilizador verificarUtilizadorSenha(String utilizador, String senha) {
        // passa a batata a um método a implementar pela equipa de bases de dados:
        return db.verificarHashSenha(utilizador, senha);
    }

    public int getId() {
        return this.id;
    }

    public String getUtilizador() {
        return this.utilizador;
    }

    public void setUtilizador(String utilizador) {
        this.utilizador = utilizador;
    }

    /**
     * Calcula o hash da senha e armazena a string resultante no atributo
     * correspondente da classe
     *
     * @param senha
     */
    public void setHashSenha(String senha) {
        this.hashSenha = senha; // TODO!! 
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoUtilizador() {
        return this.tipoUtilizador;
    }

    public void setTipoUtilizador(String tipoUtilizador) {
        this.tipoUtilizador = tipoUtilizador;
    }

    public int getEstado() {
        return this.estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Utilizador{" + "id=" + id + ", utilizador=" + utilizador + ", nome=" + nome + ", email=" + email + ", tipoUtilizador=" + tipoUtilizador + ", estado=" + estado + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.utilizador);
        hash = 29 * hash + Objects.hashCode(this.tipoUtilizador);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilizador other = (Utilizador) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.utilizador, other.utilizador)) {
            return false;
        }
        return Objects.equals(this.tipoUtilizador, other.tipoUtilizador);
    }
}
