import java.util.*;
public class Calculaor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();

        System.out.println("Enter the operation you want to operate from the following menu: ");
        System.out.println("Addition: 1");
        System.out.println("Subtraction: 2");
        System.out.println("Multiplication: 3");
        System.out.println("Division: 4");

        int n=sc.nextInt();
        switch(n){
            case(1):
                add(num1, num2);
                break;
            case(2):
                sub(num1, num2);
                break;
            case(3):
                mul(num1, num2);
                break;
            case(4):
                div(num1, num2);
                break;
            default:
                System.out.println("Enter valid number");

        }
    }

    public static void add(int num1,int num2){
        int res=num1+num2;
        System.out.println("Addition of "+ num1+" and "+ num2 +" is: "+ res);
    }
    public static void sub(int num1, int num2){
        int res=num1-num2;
         System.out.println("Subtraction of "+ num1+" and "+ num2 +" is: "+ res);
    }
    public static void mul(int num1, int num2){
        int res=num1*num2;
         System.out.println("Multiplication of "+ num1+" and "+ num2 +" is: "+ res);
    }
    public static void div(int num1, int num2){
        int res=num1/num2;
         System.out.println("Division of "+ num1+" and "+ num2 + "is: "+ res);
    }
}
