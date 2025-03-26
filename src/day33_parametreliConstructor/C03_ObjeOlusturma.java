package day33_parametreliConstructor;

public class C03_ObjeOlusturma {

    public static void main(String[] args) {

        C01_Araba araba1 = new C01_Araba();
        System.out.println(araba1);
        // Ozellikler  : ilanNo=0, marka='Marka atanmadi', model='Model atanmadi', yil=1900, fiyat=0

        C01_Araba araba2 = new C01_Araba("Porche","910");
        System.out.println(araba2);
        // Ozellikler  : ilanNo=0, marka='Porche', model='910', yil=1900, fiyat=0


        C01_Araba araba3 = new C01_Araba(1010,"mini","country");
        System.out.println(araba3);
        // Ozellikler  : ilanNo=1010, marka='mini', model='country', yil=1900, fiyat=0


        C01_Araba araba4 = new C01_Araba(1011,"Tofas","Sahin",1990,130000);
        System.out.println(araba4);
        // Ozellikler  : ilanNo=1011, marka='Tofas', model='Sahin', yil=1990, fiyat=130000

    }
}
