package day36_staticBlocks_passByValue;

public class C05_PassByValue {

    public static void main(String[] args) {

        int sayi = 4;

        System.out.println(sayiyiDegistir(sayi)); // 8

        System.out.println(sayi); // 4

        // sayinin kalici olarak degismesini isteseydik

        sayi = sayiyiDegistir(sayi);

        System.out.println("Main method'da sayinin son degeri : " + sayi); // 8

    }

    public static int sayiyiDegistir(int sayi){

        // sayi cift ise sayinin degerini 2 katina cikarin
        // sayi tek ise sayinin degerini 5 artirin
        // ve sayinin son halini dondurun

        if (sayi % 2 == 0){
            sayi = sayi*2 ;
        } else {
            sayi = sayi+5;
        }

        return sayi;

    }
}
