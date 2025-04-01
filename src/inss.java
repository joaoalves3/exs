import java.text.DecimalFormat;
import java.util.Scanner;

public class inss {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");
        Scanner sc=new Scanner(System.in);
        double salario, valorAula , aulasDadas , inss, desconto;
        System.out.println("digite quantas aulas vc deu  no mes");
        aulasDadas= sc.nextDouble();

        System.out.println("quanto custa sua aula ");
        valorAula= sc.nextDouble();
        salario= aulasDadas*valorAula;
        inss=salario/10;
        System.out.println("seu salario bruto foi de " +df.format(salario));
        System.out.println("o desconto  foi de " +df.format(inss));
        desconto=salario-inss;
        System.out.println("seu salario ficou " +df.format(desconto));

    }
}
