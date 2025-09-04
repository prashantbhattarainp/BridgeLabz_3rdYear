import java.util.Scanner;
public class CopyArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array: ");
        int size= sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();   
        }

        int[] arr2 = new int[size];
        for(int i=0;i<size;i++){
            arr2[i]= arr[i];   
        }

        for(int i=0;i<size;i++){
            System.out.print(arr2[i]+" ");   
        }



        
        
    }
    
}
