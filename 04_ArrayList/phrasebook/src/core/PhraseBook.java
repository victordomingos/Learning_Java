/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author EFA
 */
public class PhraseBook {
    private ArrayList<String> phrases = new ArrayList<>();

    public String getPhrase(int i) {
        return phrases.get(i);
    }


    public void addPhrase(String phrase) {
        this.phrases.add(phrase);
    }
    
    public void delPhrase(int index) {
        this.phrases.remove(index);
    }

    public ArrayList<String> getPhrases() {
        return phrases;
    }
    
       
    
    @Override
    public String toString() {
        return "PhraseBook{" + "phrases=" + phrases + '}';
    }
    
}
