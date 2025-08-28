import java.util.*; // Importing .util package
public class VotingEligibility {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=10; //number of students 
        int [] students = new int [num]; // initilaized an array named Students

        for(int j=0;j<students.length;j++){
            students[j]=sc.nextInt(); //Taking input from th user
            if(students[j]<18){ //Checking if student age is less than 18
                System.out.println(" You are of age "+ students[j]+". So, You cannot vote.");
            }
            else{
                System.out.println(" You are of age"+ students[j]+". So, You can vote.");
            }
        }
    }
}
