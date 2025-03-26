package day33_parametreliConstructor;

public class C04 {

    /*
        Constructor ile method arasindaki farklar
        1- Constructor'larin return type'i olmaz
           method'lar MUTLAKA return type'a sahip olmalidir
        2- constructor'lar class ismi ile ayni isme sahip olur
           normalde method'lar class ismi ile ayni isme sahip olmaz
           (ayni isme sahip olursa CTE olusmaz)
        3- Constructor isimleri buyuk harfle baslar
           normalde method isimleri kucuk harfle baslar
           (buyuk harfle baslarsa CTE olusmaz)
     */

    /*
        isim(); syntax'i method call icin kullanilir
        eger bu class icerisinde herhangi bir yerde
        C04() gorursek, bu C04 ismindeki parametresiz method'u call eder

        class'da bu isimde method olmasa bile
        Java bunu Constructor call olarak algilamaz
        method call yapiyorsun ama bu isimde method yok diye CTE verir

        Eger bir class'daki bir constructor'in icinden
        baska bir constructor'in cagrilmasi gerekirse
        constructor'in ismi yazilmaz
        bunun yerine Java'nin ozel olarak tanimladigi
        this(ilgili parametreler) kullanilir


     */

    C04(){
        System.out.println("parametresiz constructor calisti");
    } // parametresiz constructor

    C04(int sayi){
        // burada parametresiz constructor'in calismasini istersek
        this(); // parametresiz constructor calisti

        C04(); // parametresiz method calisti
        C04("Kemal"); // String parametreli method calisti


    } // int parametreli constructor

    C04(String metin){
        System.out.println("String parametreli constructor calisti");

    } // String parametreli constructor

    public static void main(String[] args) {

        C04 obj = new C04(5);

    }

    public void merhaba(){
        /*
            bu bir method'dur
            - return type var
            - ismi de class ismi ile ayni degil
         */
    }

    void C04(){
        // return type var, constructor olamaz
        // normalde method'lar class ismi ile ayni isme sahip olmaz
        // intelliJ "Method name 'C04' is the same as its class name " diyerek bizi uyariyor
        // ama altini cizip CTE vermiyor
        System.out.println("parametresiz method calisti");


    } // parametresiz method

    void C04(String isim){
        System.out.println("String parametreli method calisti");
    } // parametreli method


}
