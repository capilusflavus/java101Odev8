package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("Bir sayı giriniz  : ");
        a = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        b= scanner.nextInt();
        System.out.println("Bu işlemlerdem birini seçiniz ;\nToplamaysa 1'e basınız. \nÇıkarmaysa 2'ye Basınız.\nÇarpmaysa 3'e Basınız.\nBölmeyse 4'e Basınız. ");
        System.out.print("Yapmak istediğiniz işlem nedir : ");
        int islem = scanner.nextInt();
        switch (islem) {
            case 1:
                System.out.println("İşlem Sonuçunuz = " + (a + b) + "\nToplama İşlemi Yaptınız.");
                break;
            case 2:
                System.out.println("İşlem Sonuçunuz = " + (a - b) + "\nÇıkarma İşlemi Yaptınız.");
                break;
            case 3:
                System.out.println("İşlem Sonuçunuz = " + (a * b) + "\nÇarpma İşlemi Yaptınız.");
                break;
            // bu kısımı switch case ilede yapıyorum ama sarı soru işareti ile bu daha doğru dediği için böyle yaptım.
            case 4:
                if (b == 0) {
                    System.out.println("Bölme İşleminde Sıfır Giremezsiniz.");
                } else {
                    System.out.println("İşlem Sonuçunuz = " + (a / b) + ("\nBölme İşlemi Yaptınız."));
                }
                break;
            default:
                System.out.println("Yanlış Giriş Yaptınız Tekrar Deneyiniz..");
        }

    }
}