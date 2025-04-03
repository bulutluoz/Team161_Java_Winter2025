package day37_immutableClasses;

public class C02_StringeYeniDegerAtama {

    public static void main(String[] args) {

        String str = "Hava";


        str = "Tava";


        int[] arr = {3,4,5,6};
        // arr array'ine 5.eleman olarak 8 EKLEYEMEYIZ
        // ama yeni bir array olusturup
        // eski array'e yeni degeri atayabiliriz

        int[] yeniArr = {3,4,5,6,8};

        arr = yeniArr;
        // eski arabayi satip, yeni araba aldik diyorduk


    }
}
