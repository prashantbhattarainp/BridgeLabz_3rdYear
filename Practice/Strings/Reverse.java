import java.util.*;
public class Reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans="";
        for(int i=0;i<s.length();i++){
            if((i==0 && s.charAt(i)!=' ') || (s.charAt(i)!=' ' && s.charAt(i-1)==' ')){

            }
            // if(s.charAt(i)==' '){
            //     ans=ans+" ";
            // }
            // String part="";
            // for(int j=i;j<s.length();j++){
            //     if(s.charAt(j)!=' '){
            //         part=part+1;
            //     }
            //     else{
            //         break;
            //     }
            // }
            // int start=i;
            // int end=part.length();
            // while(start<end){
            //     char start=
            // }

        }
    }
}