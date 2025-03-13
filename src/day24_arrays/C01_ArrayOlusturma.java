package day24_arrays;

public class C01_ArrayOlusturma {

    public static void main(String[] args) {

        // array iki turlu olusturulabilir

        // 1- direkt degerler atanir
        //    bu durumda array atanan eleman sayisini length olarak kabul eder
        int[] arr1 = {1,4,5};

        // 2- default degerlere sahip bos bir array olusturup
        //    sonradan eleman atamasi yapabiliriz

        String[] arr2 = new String[4]; // [null, null, null, null]

        // arr tanimlarken [] koymazsak
        // Java bu variable'i array olarak kabul etmez
        // ve sadece 1 deger atamamizi bekler
        // String arr3 = {"Cennet","Samet","Eren"};

        String[] arr3 = {"Cennet","Samet","Eren"};

        // arr3'un data turu array'dir
        // String bu array'in icine konulacak elemanlarin data turudur
        // yani arr3 icinde String elemanlar bulunduran bir ARRAY'dir




    }
}
