package Strings;

import java.util.*;

public class FirstNonRepeated {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        char ch= find(s1);
    }
    
    public static char find(String s1){
        int[] freq = new int [26];

        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                return s1.charAt(freq[i]);
            }
        }
        return;

    }

}
