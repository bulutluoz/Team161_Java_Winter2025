package day32_constructors;

public class C01_Car {

    int ilanNo ;
    String marka = "Marka atanmadi";
    String model = "Model atanmadi";
    int yil = 1900;
    int fiyat;


    C01_Car(String mrk, String mdl,int yl, int fyt, int iNo){

        marka = mrk;
        model = mdl ;
        yil = yl;
        fiyat = fyt;
        ilanNo = iNo;
    }

    /*
        Biz gorunur bir constructor olusturdugumuzda
        Java default constructor'i siler
        Bu durumda daha once
        default constructor ile olusturulan
        objeler CTE verir.

        CTE vermesinin onune gecmek icin
        bir class'da GORUNUR bir constructor olusturdugumuzda
        default constructor'in yerine
        PARAMETRESIZ bir constructor DA olustururuz

     */
    C01_Car(){

    }


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
