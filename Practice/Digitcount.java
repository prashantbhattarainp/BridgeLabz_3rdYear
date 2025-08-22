import java.util.*;
public class Digitcount {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the long range of digits: ");
        int n=sc.nextInt();
        int copy=n;
        int count=0;
        while(n>0){
            int rem=n%10;
            count++;
            n=n/10;
        }
        System.out.println("The number of digits in "+copy+" is "+count+".");
    }
    
}
