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
        Person p1 = new Person(223456789, "joseph");
        Person p2 = new Person(987654321, "mickael", "Left Street", "123123123", "abcd@abcd.abcd");
        Person p3;
        
        //p1.setNif(123456789);
        //p1.setName("dominikos");
        //p1.setAddress("Nice street");
        //p1.setEmail("efghij.jp");        
        
        try {
            p1.setEmail("i@efghij.jp");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        p1.setPhone("123456789");
        
        
        p2.setNif(123456789);
        p2.setName("dominikos");
        p2.setAddress("Nice street");
        try {
            p2.setPhone("+123456789"); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            p2.setEmail("abcdefghij.kl");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        
        p3 = p1;
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);
        System.out.println(p1==p3); 
    }
    
}
