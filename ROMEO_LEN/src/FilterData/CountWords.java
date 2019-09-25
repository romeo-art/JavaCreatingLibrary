/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FilterData;

import java.util.ArrayList;

/**
 *
 * @author lenizoro_sd2082
 */
public class CountWords {
    
    
    public int count(String str){
        String newStr = str.replaceAll("\\<.*?\\>", "");
        String[] words = newStr.split(" ");
        String[] arrayWords = newStr.split(" ");
        int count=0;
        for(String word: words){
            for(String a: arrayWords){
                if(a.equalsIgnoreCase(word)){
                    count++;
                }
            }
            System.out.println(word + ": " + count);
        }
        return 0;
    }
}
