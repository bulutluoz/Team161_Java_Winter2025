package day33_parametreliConstructor;

public class C01_Araba {

    int ilanNo ;
    String marka = "Marka atanmadi";
    String model = "Model atanmadi";
    int yil = 1900;
    int fiyat;



    C01_Araba(String mrk , String mdl){
        marka = mrk;
        model = mdl;
    }
    // Biz gorunur bir constructor olusturunca
    // Java default constructor'i siler
    // daha onceden default constructor'i kullanan objelerin
    // CTE vermemesi icin
    // default constructor yerine
    // parametresiz constructor olusturmaliyiz

    C01_Araba(){

    }

    C01_Araba(int ilanNo, String marka , String model){

        // ilanNo = ilanNo; // Variable is already assigned to this value

        // esitligin sol tarafindaki varioable'lara
        // siz class level'daki variable'larsiniz DEMEMIZ GEREKIYOR
        ilanNo = ilanNo;
        marka = marka;
        model = model;

    }









    // bu class'dan olusturulan objelerin
    // sout icerisinde kullanilabilmesini
    // ve tum ozellikleri yazdirmasini istiyorsak toString() olusturmaliyiz

    @Override
    public String toString() {
        return "Ozellikler  : " +
                "ilanNo=" + ilanNo +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat ;
    }
}
