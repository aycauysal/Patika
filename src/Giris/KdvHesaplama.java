package Giris;
import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliFiyat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");
        tutar = inp.nextDouble();
        kdvOran = (tutar >0 && tutar <1000) ? 0.18: (tutar>1000) ? 0.08 : 0;
        kdvTutar = tutar * kdvOran;
        kdvliFiyat = tutar + kdvTutar;

        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV'siz Fiyat: " + tutar);
    }
}
