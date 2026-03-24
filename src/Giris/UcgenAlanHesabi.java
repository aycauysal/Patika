package Giris;
import java.util.Scanner;
public class UcgenAlanHesabi {
    public static void main(String[] args) {
        double a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.print("1.kenarı giriniz: ");
        a = inp.nextDouble();
        System.out.print("2.kenarı griniz: ");
        b=inp.nextDouble();
        System.out.print("3.kenarı giriniz: ");
        c=inp.nextDouble();
        double u = (a+b+c)/2;
        double cevre= 2*u;
        System.out.println("Üçgenin çevresi: " +cevre);
        double alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: " +alan);

    }
}
