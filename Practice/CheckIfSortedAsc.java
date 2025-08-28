import java.util.*;

public class CheckIfSortedAsc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array: ");
        int size= sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();   
        }
        boolean flag= true;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Sorted in ascending order");
        }
        else{
            System.out.println("Not Sorted in ascending order");
        }


    }
    
}
