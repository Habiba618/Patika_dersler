import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
//        Not Ortalaması Hesaplayan Program
//        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
//        Ödev
//        Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
//        Not : If ve Else kullanılmayacak...

   int mat, fiz, kim, tur, tar, muz;
   Scanner sc=new Scanner(System.in);
        System.out.print("Matematik puanınızı giriniz: ");
   mat = sc.nextInt();
        System.out.print("Fizik puanınızı giriniz: ");
        fiz = sc.nextInt();
        System.out.print("Kimya puanınızı giriniz: ");
        kim = sc.nextInt();
        System.out.print("Turkce puanınızı giriniz: ");
        tur = sc.nextInt();
        System.out.print("Tarih puanınızı giriniz: ");
        tar = sc.nextInt();
        System.out.print("Müzik puanınızı giriniz: ");
        muz = sc.nextInt();

        int toplam = mat+fiz+kim+tur+tar+muz;
        double ortalama = toplam/6;
        System.out.println("Ortalaman: "+ortalama);

        boolean ortalamBuyukMu = (ortalama > 60);
        String durum = ortalamBuyukMu ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);
    }


}
