package day48_abstractClasses_interface;

public class K04_ChildOf_I03 implements I03_Interface {

    // bir class'in bir interface'i parent edinmesi icin
    // extends degil implements keyword kullanilir

    public static void main(String[] args) {

        System.out.println(SAYI1); // 10

        // sayi1 = 65;
        // Cannot assign a value to final variable 'sayi1'

        // sayi4 = 45;
        // Cannot assign a value to final variable 'sayi4'


        // sayi5 = 45;
        // Cannot assign a value to final variable 'sayi5'


        // sayi6 = 45;
        // Cannot assign a value to final variable 'sayi6'


        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Math.PI); // 3.141592653589793
        System.out.println(Math.E); // 2.718281828459045

        // Java'da sabit degere sahip "public static final" variable isimleri
        // buyuk harfle yazilir
    }


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method5() {

    }
}
