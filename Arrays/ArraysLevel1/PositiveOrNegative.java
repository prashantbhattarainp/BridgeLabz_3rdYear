package Arrays.ArraysLevel1;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=10; //number of inputs
        int [] numbers = new int [num]; // initilaized an array named numbers

        for(int j=0;j<numbers.length;j++){
            numbers[j]=sc.nextInt(); //Taking input from the user
            if(numbers[j]<0){
                System.out.println(" The number is negative.");
            }
            else{
                System.out.println(" The number is positive.");
            }
        }
    }
    
}
