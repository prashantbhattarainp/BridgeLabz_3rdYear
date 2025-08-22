import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int n1=sc.nextInt();
        long factorial=1;

        if(n1<0){
            System.out.println("Factorial is not defined for negative numbers");
        }
        else if(n1==0){
            System.out.println("The factorial of 0 is 1.");
        }
        else{
            for(int i=1;i<=n1;i++){
                factorial*=i;
            }
            System.out.println("The factorial of "+n1+ "is "+factorial);
        } 
    }
}
