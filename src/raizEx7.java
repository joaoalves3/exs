import java.text.DecimalFormat;
import java.util.Scanner;

public class raizEx7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.000");
        double x, y, n1, n2;
        System.out.println("digite o x");
        x= sc.nextDouble();
        n1=(Math.pow(x,4)-1) / (2*Math.pow(x,2));
        n2= Math.pow(x,2)/2;
        y=Math.sqrt(1+ Math.pow(n1,2)) - n2;
        System.out.println("y é " + df.format(y));
    }
}
