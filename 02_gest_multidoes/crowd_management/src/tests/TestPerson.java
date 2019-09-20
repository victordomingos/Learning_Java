/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import core.Person;
import java.util.HashSet;

/**
 *
 * @author EFA
 */
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        
        p1.setNif(123456789);
        p1.setName("dominikos");
        p1.setAddress("Nice street");
        p1.setPhone("+123456789");
        p1.setEmail("abcd@efghij.kl");
        
        p2.setNif(123456789);
        p2.setName("dominikos");
        p2.setAddress("Nice street");
        p2.setPhone("+123456789");
        p2.setEmail("abcd@efghij.kl");
        
        p3 = p1;
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);
        System.out.println(p1==p3); 
    }
    
}
