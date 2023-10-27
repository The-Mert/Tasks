package com.example.ders_2.odev2;

public class Odev2 {

    public int toplamCalisilanSaat,toplamMesaiSaati,toplamCalisilanGun;

    public Odev2(){
        System.out.println("Constructor çağırıldı.");
    }

    public Odev2(int toplamCalisilanGun) {
        this.toplamCalisilanGun = toplamCalisilanGun;
        this.toplamCalisilanSaat = toplamCalisilanGun*8;
        if(toplamCalisilanSaat > 150) this.toplamMesaiSaati = toplamCalisilanSaat - 150;

    }

    public double kilometerToMil(double kilometer){
            return kilometer*0.621;
    }

    public void dikdortgenAlan(double kisaKenar, double uzunKenar){
        double alan = kisaKenar * uzunKenar;
        System.out.println("Kısa kenarı " + kisaKenar +" cm, uzun kenarı " + uzunKenar + " cm olan  dikdörtgenin alanı: " +alan + " cm^2.");
    }

    public int faktoriyelHesaplama(int faktoriyelSayisi){
        int cevap = 1;
        for(int i = faktoriyelSayisi;i>0;i--){
            cevap *= i;
        }
        return cevap;
    }
    public void eHarfiSayisi(String kelime){
        int eSayisi = 0;
        kelime = kelime.toLowerCase();
        for(int i = 0 ;i<kelime.length();i++){
            if('e' == kelime.charAt(i)){
                eSayisi++;
            }
        }
        System.out.println("Toplam " + eSayisi + " tane 'e' harfi var.");
    }

    public void icAci(double kenarSayisi){
        double icAcilariToplami = (((kenarSayisi)-2)*180)/kenarSayisi;
        System.out.println("Kenar sayısı " + (int) kenarSayisi + " olan bir şekilin iç açıları toplamı " + icAcilariToplami*kenarSayisi + " derece bir iç açısı " + icAcilariToplami + " derece.");
    }

    public int maasHesabi(){
        toplamCalisilanSaat = toplamCalisilanGun*8;
        if (toplamCalisilanSaat>150){
            toplamMesaiSaati = toplamCalisilanSaat-150;
            return (toplamMesaiSaati*80) + (toplamCalisilanSaat*40);
        }else{
            return toplamCalisilanSaat*40;
        }

    }

    public int otoparkUcreti(int kullanilanSure){
        if(kullanilanSure>1){
            int artanSure = kullanilanSure-1;
            return artanSure*10+50;
        }else{
            return 50;
        }

    }
}
