/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class CountWC {
    private String input;

    public CountWC(String input) {
        this.input = input;
    }
    public Map<String, Integer> countWord(){
        Map<String, Integer> wordCount = new HashMap<>();
        StringTokenizer st = new StringTokenizer(input,",..?!;:");
        while(st.hasMoreTokens()){
            String wordc = st.nextToken().toLowerCase();
            wordCount.put(wordc,wordCount.getOrDefault(st, 0)+1);
        }
        return wordCount;
    }
    public Map<Character, Integer> countCharacter(){
        Map<Character, Integer> chaCount = new HashMap<>();
        for(char c : input.toCharArray()){
            if(Character.isLetter(c)){
                c = Character.toLowerCase(c);
                chaCount.put(c, chaCount.getOrDefault(c, 0)+1);
            }          
        }
        return chaCount;
    }
    public void displayResults() {
        System.out.println("Word count: " + countWord());
        System.out.println("Character count: " + countCharacter());
    }
    
}
