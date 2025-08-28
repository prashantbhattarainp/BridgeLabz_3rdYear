import java.util.Scanner;

public class MergetwoArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array: ");
        int size= sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();   
        }

        System.out.println("Enter the length of an second array: ");
        int size2= sc.nextInt();
        int[] arr2 = new int[size2];

        for(int i=0;i<size2;i++){
            arr2[i]= sc.nextInt();   
        }

        int arr3[] = new int [size+size2];
        int i=0;
        for(int idx=0;idx<size;idx++){
            arr3[i]=arr[idx];
            i++;
        }

        for(int idx=0;idx<size2;idx++){
            arr3[i]=arr2[idx];
            i++;
        }

         for(int k=0;k<arr3.length;k++){
            System.out.print(arr3[k]+" ");   
        }


    }
}
