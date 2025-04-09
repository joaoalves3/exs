import java.text.DecimalFormat;
import java.util.Scanner;

public class raizEx6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat dc =new DecimalFormat("0.000");
        double x , y;
        System.out.println("digite o numero de x");
        x= sc.nextDouble();
        y=Math.pow(x-(double)1/2,(double)1/6);
        System.out.println(y);

    }
}
