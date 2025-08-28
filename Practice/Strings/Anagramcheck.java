import java.util.*;
public class Anagramcheck{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        boolean result= check(s1,s2);
        System.out.print(result);
    }
    public static boolean check(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] freq = new int [26];

        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length();i++){
            freq[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;

    }



}