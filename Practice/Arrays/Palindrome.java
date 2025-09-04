import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number that has to be checked ");
        int n=sc.nextInt();
        int copy= n;
        int check=0;
        while(copy>0){
            int rem=copy%10;
            check=check*10+rem;
            copy=copy/10;
        }
        if(check==n){
            System.out.println("The number "+n+" is a palindrome.");
        }
        else{
            System.out.println("The number "+n+" is not a palindrome.");
        }
    }
}
