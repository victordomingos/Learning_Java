/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import core.Car;
import exceptions.InvalidLicensePlateException;

/**
 *
 * @author EFA
 */
public class TestCar {
    public static void main(String[] args) {
        
        try {
            Car c1;
            c1 = new Car("KITT2000", "Pontiac" );
            System.out.println(c1);
        } catch (InvalidLicensePlateException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            Car c2;
            String matricula = "bad licence plate for testing";
            c2 = new Car("KARR0000", "Pontiac", "Firebird");
            System.out.println(c2);
            try {
                c2.setMatricula(matricula);
            } catch (InvalidLicensePlateException e) {
                System.out.println(e.getMessage());
            }
        } catch (InvalidLicensePlateException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            Car c3;
            c3 = new Car("OUTATIME", "DeLorean", "DMC-12", 3);
            System.out.println(c3);
        } catch (InvalidLicensePlateException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
      
}
