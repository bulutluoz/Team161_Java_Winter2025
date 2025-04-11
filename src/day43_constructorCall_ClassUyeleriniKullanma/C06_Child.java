package day43_constructorCall_ClassUyeleriniKullanma;

public class C06_Child extends C05_P {
    /*
        1- Child class'da bir obje olusturdugumuzda
           constructor'lar super(); mekanizmasi sayesinde
           extends kullanmayan ilk class'a kadar otomatik olarak gider

        2- extends kullanmayan class'a ulasildiginda
           obje olusturulur,
           ve her class'daki ilk calisan constructor
           o class'daki instance variable'lar ve degerlerinin
           birer kopyasini alip objeye yapistirir

        3- eger constructor variable'a atama yaparken
           o variable daha onceki parent'larda olusturulmussa
           o variable'i yeni olusturmaz, update eder

           boylece child class'a kadar variable'lara
           en GUNCEL degerler atanmis olur.

        4- Java extends keyword kullanan bir class'daki
           her constructor'in ilk satirinda
           Constructor Call olmasini ZORUNLU kilmistir

        5- Kodu yazan kisi ilk satira
           constructor Call koymazsa
           Java otomatik olarak super(); koyar

        6- Java'nin koydugu super();
           hangi constructor'in icinde olursa olsun
           parametresizdir.

        7- Kodu yazanlar super(ilgiliParametreler) yerine
           this(ilgiliParametreler) de kullanabilir
           super() ==> parent class'daki constructor
           this()  ==> icinde olunan class'daki constructor'lari cagirir



     */


    C06_Child(){
        super("Ali");
        System.out.println("C parametresiz constructor calisti");
    }

    C06_Child(String s){
        super(5);
        System.out.println("C String parametreli constructor calisti");
    }

    C06_Child(int a){
       // super();
        System.out.println("C int parametreli constructor calisti");
    }

    C06_Child(double a){
        // super(double a);
        // parent class'da
        // cagrilan constructor yoksa
        // Java CTE verir
    }


    public static void main(String[] args) {

        C06_Child child3 = new C06_Child("Ali");
        //GP int parametreli constructor calisti
        //GP String parametreli constructor calisti
        //P int parametreli constructor calisti
        //C String parametreli constructor calisti




        //C06_Child child2 = new C06_Child();
        //GP parametresiz constructor calisti
        //P parametresiz constructor calisti
        //P String parametreli constructor calisti
        //C parametresiz constructor calisti


        //C06_Child child1 = new C06_Child(4);
        //GP parametresiz constructor calisti
        //P parametresiz constructor calisti
        //C int parametreli constructor calisti
    }





}
