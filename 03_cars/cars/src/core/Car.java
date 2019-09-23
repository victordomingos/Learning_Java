/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author EFA
 */
public class Car {
    private String matricula;
    private String marca;
    private String modelo;
    private int n_portas;

    public Car(String matricula, String marca) {
        this.setMatricula(matricula);
        this.marca = marca;
        this.modelo = "Undefined model";
        this.n_portas = 5;
    }
     
    public Car(String matricula, String marca, String modelo) {
        this(matricula, marca);
        this.modelo = modelo;
        this.n_portas = 5;
    }
    
    public Car(String matricula, String marca, String modelo, int n_portas) {
        this(matricula, marca, modelo);
        this.n_portas = n_portas;
    }
    
    

    @Override
    public String toString() {
        return "Cars{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", n_portas=" + n_portas + '}';
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public String getMatricula() {
        return matricula;
    }

    public final void setMatricula(String matricula) {
        if (matricula.length() == 8) {
            this.matricula = matricula;
        }

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getN_portas() {
        return n_portas;
    }

    public void setN_portas(int n_portas) {
        this.n_portas = n_portas;
    }
    
}
