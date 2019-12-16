package core;

import java.util.Objects;

import static core.Utils.ADMINISTRADOR;
import static core.Utils.COORDENADOR;
import static core.Utils.FORMANDO;
import static core.Utils.RESP_ENTIDADE;

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

    public Utilizador() {
        id = -1;
        utilizador = "";
        hashSenha = "";
        nome = "";
        email = "";
        tipoUtilizador = "";
        estado = -1;
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

    /**
     * *
     * Obtém o nome da pasta correspondente ao tipo de utilizador indicado
     *
     * @param tipoUtilizador - tipo de utilizador
     * @return pasta - nome da pasta
     */
    public static String getPastaTipoUtilizador(String tipoUtilizador) {
        String pasta;

        switch (tipoUtilizador) {
            case ADMINISTRADOR:
                pasta = Utils.PASTA_ADMIN;
                break;
            case COORDENADOR:
                pasta = Utils.PASTA_COORDENADOR;
                break;
            case FORMANDO:
                pasta = Utils.PASTA_FORMANDO;
                break;
            case RESP_ENTIDADE:
                pasta = Utils.PASTA_ADMIN;
                break;
            default:
                pasta = "";
                break;
        }
        return pasta;
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
