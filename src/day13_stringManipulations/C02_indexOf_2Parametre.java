package day13_stringManipulations;

public class C02_indexOf_2Parametre {

    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";


        // metin'de 2 adet Ali gectigi biliniyorsa
        // 2. Ali'nin index'ini bulunuz

        int ilkAliIndexi = str.indexOf("Ali");  // 0

        System.out.println("Ali'nin ilk kullanim index'i : " + ilkAliIndexi); // 0

        int ikinciAliIndexi = str.indexOf("Ali" , ilkAliIndexi+1);

        System.out.println("Ali'nin ikinci kullanim index'i : " + ikinciAliIndexi); // 16


        // str'da 3 adet "at" gectigi biliniyorsa
        // 3. "at" kelimesinin index'ini yazdirin

        int ilkAtIndexi = str.indexOf("at");
        int ikinciAtIndexi = str.indexOf("at",ilkAtIndexi+1);
        int ucuncuAtIndexi = str.indexOf("at",ikinciAtIndexi+1);

        System.out.println("at kelimesinin 3. kullanim index'i : " + ucuncuAtIndexi);


        // str'da top kelimesinin 1. , 2. ve 3. kullanimlarinin index'lerini yazdirin

        int ilkTopIndexi = str.indexOf("top");
        int ikinciTopIndexi = str.indexOf("top",ilkTopIndexi+1);
        int ucuncuTopIndexi = str.indexOf("top",ikinciTopIndexi+1);

        System.out.println("top kelimesinin 1. kullanim index'i : " + ilkTopIndexi); // 4
        System.out.println("top kelimesinin 2. kullanim index'i : " + ikinciTopIndexi); // -1
        System.out.println("top kelimesinin 3. kullanim index'i : " + ucuncuTopIndexi); // 4


    }
}
