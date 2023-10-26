package com.example.ders_2.odev2;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 odev = new Odev2();

        int sayi = 6;

        int kilometre = 18;

        System.out.println(kilometre + " kilometre = " + odev.kilometerToMil(kilometre) + " mil.");

        odev.dikdortgenAlan(20,30);  //2.Soru

        System.out.println( sayi + " sayısının faktoriyeli: " + odev.faktoriyelHesaplama(6)); // 3. Soru

        odev.eHarfiSayisi("MERHABA elif.");

        odev.icAci(3);

        odev.maasHesabi(40);
        System.out.println("Mesai saati ve ücreti: " + odev.toplamMesaiSaati +" " + odev.toplamMesaiSaati*80 + " TL.\nÇalışılan saat ve ücret: "+ odev.toplamCalisilanSaat+ " ," +odev.maasHesabi(40) + " TL.");

        System.out.println("Toplam otopark kullanım ücreti: "+odev.otoparkUcreti(4) + " TL.");
    }
}
