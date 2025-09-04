import java.util.*;
public class CountApperance {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int size= sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();   
        }

        System.out.println("Enter the number you want to check");
        int check=sc.nextInt();

        int count=0;
        for(int j=0;j<size;j++){
            if(arr[j]==check){
                count++;
            }
        }
        
        System.out.println(count);


    }
}
