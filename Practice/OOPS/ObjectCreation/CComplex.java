import java.util.*;
class Complex{
    int real, img;
Complex (int real, int img){
    this.real= real;
    this.img= img;
}
public static void display(Complex c){
    
    System.out.println(c.real+" "+c.img+'i');
}
public static void add(Complex c1, Complex c2){
    int real_1= c1.real + c2.real ;
    int img_1= c1.img + c2.img;
    System.out.println(real_1+" "+img_1+"i");
}
public static void sub(Complex c1, Complex c2){
    int real_2= c1.real-c2.real;
    int img_2= c1.img- c2.img;
    System.out.println(real_2+" "+img_2+"i");
}
public static void mul(Complex c1, Complex c2){
    int real_3= c1.real*c2.real - c1.img*c2.img;
    int img_3= c1.real*c2.img - c1.img *c2.real;
    System.out.println(real_3+" "+img_3);
}

}
public class CComplex{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int real=sc.nextInt();
        // int img=sc.nextInt();

        Complex c1= new Complex(1,4);
        Complex c2= new Complex(4,5);

        Complex.display(c1);
        Complex.display(c2);

        Complex.add(c1,c2);
        Complex.sub(c1,c2);
        Complex.mul(c1,c2);
    }

}
