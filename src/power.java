import java.util.Scanner;
import java.lang.Math;
public class power {
    public static void main(String[] args) {
        double n, p;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("sayı: ");
        n = input.nextInt();
        System.out.print("kuvvet: ");
        p = input.nextInt();

        for (int i = 1; i <= p; i++){
            total = total *= n;
        }
        System.out.println(total);

        /*
        int i = 1;
        while (i <= p) {
            total *= n;
            i++;
        }
        System.out.println(total);
        /*

        /*
        double result = Math.pow(n,p);

        System.out.println(result);
        */
    }
}
