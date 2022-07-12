import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil, kalan;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Dogum Yilinizi Giriniz : ");
        yil = girdi.nextInt();
        kalan = yil % 12;

        if ((yil>2022) || (yil<0)) {
            System.out.println("Lufen Gecerli Bir Tarih Giriniz.");
            return;
        }
        if (kalan == 0) {
            System.out.println("Zodiac Burcunuz : Maymun");
        } else if (kalan == 1) {
            System.out.println("Zodiac Burcunuz : Horoz");
        } else if (kalan == 2) {
            System.out.println("Zodiac Burcunuz : Kopek");
        } else if (kalan == 3) {
            System.out.println("Zodiac Burcunuz : Domuz");
        } else if (kalan == 4) {
            System.out.println("Zodiac Burcunuz : Fare");
        } else if (kalan == 5) {
            System.out.println("Zodiac Burcunuz : Okuz");
        } else if (kalan == 6) {
            System.out.println("Zodiac Burcunuz : Kaplan");
        } else if (kalan == 7) {
            System.out.println("Zodiac Burcunuz : Tavsan");
        } else if (kalan == 8) {
            System.out.println("Zodiac Burcunuz : Ejderha");
        } else if (kalan == 9) {
            System.out.println("Zodiac Burcunuz : Yilan");
        } else if (kalan == 10) {
            System.out.println("Zodiac Burcunuz : At");
        } else if (kalan == 11) {
            System.out.println("Zodiac Burcunuz : Koyun");
        }

        }
    }
