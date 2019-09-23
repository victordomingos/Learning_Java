/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import core.Car;

/**
 *
 * @author EFA
 */
public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("KITT2000", "Pontiac" );
        Car c2 = new Car("KARR0000", "Pontiac", "Firebird");
        Car c3 = new Car("OUTATIME", "DeLorean", "DMC-12", 3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
      
}
