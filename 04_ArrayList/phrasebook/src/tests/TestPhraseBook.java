/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import core.PhraseBook;
/**
 *
 * @author EFA
 */
public class TestPhraseBook {
    public static void main(String[] args) {
        PhraseBook phb = new PhraseBook();
       
        phb.addPhrase("There is an old saying that says something...");
        phb.addPhrase("is an old saying that says something...");
        phb.addPhrase("an old saying that says something...");
        phb.addPhrase("saying that says something...");
        phb.addPhrase("There is a saying that says something...");
        phb.addPhrase("There is an old saying...");
        phb.addPhrase("There something...");
        phb.addPhrase("There is something...");
        phb.addPhrase("an old saying...");
        phb.addPhrase("There is an old something...");
        phb.addPhrase("There says...");
        
        phb.addPhrase("Bla bla bla.");
        
        int max_len = phb.getPhrase(0).length();
        int min_len = phb.getPhrase(0).length();
        int len;
        for (String phrase : phb.getPhrases()) {
            len = phrase.length();
            if (max_len < len) {
                max_len = len;
            }
            if (min_len > len) {
                min_len = len;
            }
            System.out.println(phrase + " " + Integer.toString(len));
        }
        
        
        System.out.println(phb);
        System.out.println("MIN: " + min_len);
        System.out.println("MAX: " + max_len);      
        System.out.println("Sorted:");
        System.out.println(phb.getPhrases());
        
        
    }
}
