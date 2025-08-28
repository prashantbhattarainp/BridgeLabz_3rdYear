import java.util.*;
public class RandomPassword{
    public static void main(String args[]){
        int pass =(int)(Math.random()*100000000);
        System.out.print(pass);
    }
}