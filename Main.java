
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double yuz;   
            double sonuc;
            double guncel;
            
            System.out.println("KM'de Yakıt Tüketimi Hesaplama Ekranına Hoşgeldiniz...");
            System.out.print("Lütfen Aracınızın 100 Km'de Ortalama Yakıt Tüketimini Giriniz (Örn; 11,5): "); // Sürücü burada 100km'de kaç lt yakıt tüketeceğini girecek
   
            if (scanner.hasNextDouble()){
                yuz = scanner.nextDouble();
                System.out.print("Lütfen Güncel Yakıt Fiyatını Giriniz (Örn; 21,26): "); // Sürücü burada güncel yakıt fiyatını girecek
                   
                
                        if (scanner.hasNextDouble()){
                        guncel = scanner.nextDouble();
                        System.out.println("Hesaplama Yapılıyor Lütfen Bekleyiniz...!!!");
                        sonuc = (yuz / 100) * guncel;
                        Double D = sonuc;
                        float sonucf = D.floatValue(); // burada double sonuç float tipine çevrilecek
                        System.out.println("1 KM'de Tüketiminiz: " + sonucf + " TL");
                        }
                   
                        else {
                        System.out.println("!!!...Lütfen Bir Sayı Giriniz...!!!");
                        }
            }
            
            else {
                System.out.println("!!!...Lütfen Bir Sayı Giriniz...!!!");
            }
        }
        
 
    }         
 }