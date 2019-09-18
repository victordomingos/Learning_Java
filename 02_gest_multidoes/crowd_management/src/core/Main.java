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
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setNif(123456789);
        p.setName("dominikos");
        p.setAddress("Nice street");
        
        System.out.println(String.format("%s \t %s \t %s", p.getNif(),  p.getName(), p.getAddress()));
    }
    
}
