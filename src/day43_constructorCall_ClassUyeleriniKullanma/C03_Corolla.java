package day43_constructorCall_ClassUyeleriniKullanma;

public class C03_Corolla extends C02_Toyota {
    C03_Corolla(){
        System.out.println("Corolla constructor calisti");
    }

    String model = "Corolla";
    String sanzuman = "vvti";
    String lastik = "Pirelli Turkiye";

    String aku = "Inci";
    String renk = "Renk belirtilmedi";
    String yakitTuru = "Yakit turu belirtilmedi";

    public static void main(String[] args) {

        C03_Corolla corolla1 = new C03_Corolla();
        System.out.println(corolla1.yakitTuru); // Yakit turu belirtilmedi
        System.out.println(corolla1.renk); // Renk belirtilmedi
        System.out.println(corolla1.aku); // Inci
        System.out.println(corolla1.lastik); // Pirelli Turkiye
        System.out.println(corolla1.sanzuman); // vvti
        System.out.println(corolla1.model); // Corolla

        System.out.println(corolla1.guvenlik); // TG1023
        System.out.println(corolla1.motor); // Toyota motor
        System.out.println(corolla1.marka); // Toyota

        System.out.println(corolla1.kasa); // Kasa belirtilmedi


    }

}
