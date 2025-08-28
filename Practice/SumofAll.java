import java.util.*;
public class SumofAll {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array: ");
        int size= sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();   
        }

        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];   
        }

        System.out.println(sum);
    }

}
