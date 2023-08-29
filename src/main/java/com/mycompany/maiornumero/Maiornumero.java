package com.mycompany.maiornumero;
import java.util.Scanner;
public class Maiornumero {

    public static void main(String[] args) {
        Maiornumero2 num = new Maiornumero2();
        Scanner n1 = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num.num1 = (n1.nextInt());

        Scanner n2 = new Scanner(System.in);
        System.out.println("Digite o segundo número:");
        num.num2 = (n2.nextInt());

        Scanner n3 = new Scanner(System.in);
        System.out.println("Digite o terceiro número:");
        num.num3 = (n3.nextInt());
        num.print();
        n1.close();
        n2.close();
        n3.close();
    }
}
