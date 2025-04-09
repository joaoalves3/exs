import java.util.Scanner;

public class bits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numero, numero4, numero3, numero2,numero1, resposta ;

        System.out.println("digite um numero em  bits que contenha 4 numeros");
        numero= sc.nextInt();
        numero4= (int) (numero%10*Math.pow(2,0));
        numero3= (int) (numero%100/10*Math.pow(2,1));
        numero2=(int) (numero/100%10*Math.pow(2,2));
        numero1=(int) (numero/1000*Math.pow(2,3));
        resposta= numero1+numero2+numero3+numero4;

        System.out.println("seu numero é " +resposta);


    }
}
