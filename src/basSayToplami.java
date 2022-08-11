import java.util.Scanner;
public class basSayToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();

        int tempNumber = number;
        int basValue;
        int result = 0;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
            System.out.println(basValue);
        }
        System.out.println("Rakamların Toplamı: " + result);

    }
}
