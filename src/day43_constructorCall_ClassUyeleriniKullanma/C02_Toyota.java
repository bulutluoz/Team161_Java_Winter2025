package day43_constructorCall_ClassUyeleriniKullanma;

public class C02_Toyota extends  C01_Car{

    /*
        1- child class'lar baslangic itibariyle
           parent class'daki tum ozelliklere sahiptir

        2- child class'lar
           parent class'daki ozellikleri
           kendilerine uyarlayabilir
           ve daha spesifik hale getirebilirler.

        3- Child class parent class'da olmayan
           ama tum child class objelerinde ortak olarak bulunan
           yeni ozellikler ekleyebilir
     */

    C02_Toyota(){
        System.out.println("Toyota constructor calisti");
    }

    String marka = "Toyota";
    String motor = "Toyota Motor";

    String lastik = "Pirelli";
    String guvenlik = "TG1023";

}
