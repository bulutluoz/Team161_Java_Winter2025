package day32_constructors;

public class C01_Car {

    int ilanNo ;
    String marka = "Marka atanmadi";
    String model = "Model atanmadi";
    int yil = 1900;
    int fiyat;


    /*
        Bir class olusturdugumuzda
        baska class'larda bu class'dan obje olusturuldugunda
        objenin referansini degil
        TUM OZELLIKLERINI yazdirmasini isterseniz
        toString()'nu class'iniza uyarlamalisiniz
     */










    @Override
    public String toString() {
        return "Ozellikler ==> " +
                "ilanNo=" + ilanNo +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat ;
    }
}
