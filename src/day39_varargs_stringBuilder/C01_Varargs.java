package day39_varargs_stringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {
        /*
            Eger bir method icin kullanilacak argument sayisi farkli farkli olsa da
            method'un calismasini istiyorsak
            varargs (variety of arguments) kullanabiliriz

            varargs sadece parametre olarak kullanilmak uzere hazirlanmis
            bir array'dir

            kodlarimizin icinde bir varargs tanimlayip deger atamasi yapamayiz
            varargs sadece parametre olarak kullanabilecegimiz bir yapidir
         */

        toplamiYazdir(4,5); // Iki tamsayinin toplami : 9

        toplamiYazdir(4,5,6); // uc tamsayinin toplami : 15

        toplamiYazdir(1,2,3,4); // a ==>[1,2,3,4]  4 adet sayinin toplami : 10
        toplamiYazdir(1,2,3,4,5); // a ==>[1,2,3,4,5]  5 adet sayinin toplami : 15
        toplamiYazdir(1,2,3,4,5,6); // a ==>[1,2,3,4,5,6]  6 adet sayinin toplami : 21
        toplamiYazdir(1,2,3,4,5,6,7); // a ==>[1,2,3,4,5,6,7]  7 adet sayinin toplami : 28
        toplamiYazdir(1,2,3,4,5,6,7,8); // a ==>[1,2,3,4,5,6,7]  8 adet sayinin toplami : 36
        toplamiYazdir(2); // a ==>[2] 1 adet sayinin toplami : 2
        toplamiYazdir(); // a ==>[]  argument yollamazsaniz nasil toplayayim ?



    }

    public static void toplamiYazdir(int... a){
        int toplam = 0;

        for (int each:a){
            toplam+=each;
        }

        if (a.length == 0){
            System.out.println("argument yollamazsaniz nasil toplayayim ? ");
        } else
        System.out.println("Argument olarak gonderilen " + a.length + " adet sayinin toplami : " + toplam);

    }

    public static void toplamiYazdir(int a , int b){
        System.out.println("Iki tamsayinin toplami : " + (a+b));
    }

    public static void toplamiYazdir(int a , int b, int c){
        System.out.println("uc tamsayinin toplami : " + (a+b+c));
    }
}
