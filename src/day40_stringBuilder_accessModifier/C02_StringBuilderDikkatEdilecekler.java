package day40_stringBuilder_accessModifier;

public class C02_StringBuilderDikkatEdilecekler {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Java Candir");


        // StringBuilder Mutable oldugu icin
        // StringBuilder donduren method'larla yapilan degisiklikler kalici olur

        sb1.insert(1,"a");
        System.out.println(sb1); // Jaava Candir


        sb1.deleteCharAt(1);
        System.out.println(sb1); // Java Candir


        sb1.capacity();   // 11 dondurur, yazdirilmadigi icin konsolda gorunmez
        System.out.println(sb1.lastIndexOf("a")); // 6
        sb1.indexOf("n");  // 7 dondurur, yazdirilmadigi icin konsolda gorunmez
        sb1.substring(2); // va Candir dondurur, yazdirilmadigi icin konsolda gorunmez
        System.out.println(sb1.substring(2, 7)); // va Ca


        System.out.println("En sonda sb1 : " + sb1); // Java Candir



    }
}
