
import java.util.*;
public class Multiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int results=10;
        int[] product = new int[results];//Initializing an array to save the results.
        int value = sc.nextInt(); //Taking input of the number that we want to create table of.
        for(int i=0;i<results;i++){
            product[i]=value*(i+1);
        }
        for(int j=1;j<=results;j++){
            System.out.println(value+ "*"+ j +"=" + product[j-1] );
        }
    }
}
