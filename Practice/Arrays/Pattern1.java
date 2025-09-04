import java.util.*;
public class Pattern1 {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        int row=sc.nextInt();
        int column=sc.nextInt();
        int [][] arr = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int evenRow= 0;
        int oddRow=1;

        while(evenRow<row){
            for(int i=0;i<column;i++){
                System.out.print(arr[evenRow][i]+" ");
            }
            evenRow+=2;

            System.out.println();
            if(oddRow<row){
                for(int i=column-1;i>=0;i--){
                    System.out.print(arr[oddRow][i]+" ");
                }
            }
            oddRow+=2;
        }

        
    }
}
