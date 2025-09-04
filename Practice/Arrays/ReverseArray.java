import java.util.*;
public class ReverseArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array: ");
        int size= sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();   
        }
        int i=0;
        int j=size-1;

        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<size;k++){
            System.out.print(arr[k]+" ");  
        }


    }
}
