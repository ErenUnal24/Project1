import java.util.Scanner;

public class vki {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double weight, height, bmi;

        System.out.print("Lütfen boy uzunluğunuzu cm cinsinden giriniz: ");
        height = scan.nextDouble();
        System.out.print("Lütfen kilonuzu kg cinsinden giriniz: ");
        weight = scan.nextDouble();
        height /= 100;

        bmi = weight / (height * height);

        System.out.println("Vücut kitle indeksiniz = " + bmi);

        if(bmi < 15){
            System.out.println("Kilo almalısınız");
        } else if (bmi>= 15 && bmi < 20) {
            System.out.println("İdeal kilo aralığındasınız.");
        }else {
            System.out.println("Kilo vermelisiniz.");
        }


    }
}
