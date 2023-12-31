package com.example.ders_2.odev2;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 odev = new Odev2();
        Odev2 constructorForPayment = new Odev2(30);

        double kilometre = 18;

        double mil = odev.kilometerToMil(kilometre);

        int faktoriyelSayisi = 8; //Bu değişken kullanıcıdan istenebilir.
        int faktoriyel = odev.faktoriyelHesaplama(faktoriyelSayisi);

        int maas = constructorForPayment.maasHesabi();
        int toplamMesaiSaati = constructorForPayment.toplamMesaiSaati;
        int toplamCalismaSaati = constructorForPayment.toplamCalisilanSaat;

        int otoparkUcreti = odev.otoparkUcreti(4);

        //Kilometre = mil.
        System.out.println(kilometre + " kilometre = " + mil + " mil.");

        //Dörtgen alanı.
        odev.dikdortgenAlan(20,30);

        //Faktöriyel hesabı.
        System.out.println( faktoriyelSayisi + " sayısının faktöriyeli= " + faktoriyel);

        //Toplam 'e' harfi sayısı.
        odev.eHarfiSayisi("MERHABA elif.");

        //Şekil iç açısı.
        odev.icAci(4);

        //Maaş göstergesi.
        System.out.println("Mesai saati ve ücreti: " + toplamMesaiSaati +" saat, " + toplamMesaiSaati*80 + " TL.\nÇalışılan saat ve ücret: "+ toplamCalismaSaati+ " saat," + maas + " TL.");

        //Otopark ücreti.
        System.out.println("Toplam otopark kullanım ücreti: "+ otoparkUcreti + " TL.");
    }
}
