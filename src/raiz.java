import java.util.Scanner;

public class raiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x,y;
        System.out.println("digite o x");
        x= sc.nextDouble();
        y= Math.sqrt(Math.pow( x -(double) 1/2, (double) 1/3));
        System.out.println(y);


    }
}
