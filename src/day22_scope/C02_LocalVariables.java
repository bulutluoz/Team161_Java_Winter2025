package day22_scope;

public class C02_LocalVariables {

    // Tum method'lar kullanilabilecek bir variable olusturun
    static int sayi = 23;
    // tum method'larin kullanabilecegi variable'lari class level'da olusturabiliriz
    // class level : class'in icinde ama diger kod bloklarinin disinda


    public static void main(String[] args) {

        System.out.println(sayi);

        String str;
        // Local variable'lari
        // deger atamadan deklare edebilirsiniz
        // ancak deger atamadan KULLANAMAZSINIZ
        // System.out.println(str);
    }



    public static void method1(){

        System.out.println(sayi);
    }


    public void method2(){

        System.out.println(sayi);

    }


}
