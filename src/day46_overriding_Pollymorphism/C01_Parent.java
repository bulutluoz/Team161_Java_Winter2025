package day46_overriding_Pollymorphism;

public class C01_Parent {

   // 1- overriding icin method'larin
   //    isim ve signature'lari ayni olmalidir


   public static void method1(){
       // static method'larda overriding olmaz
       // parent ve child'da ayni isim ve signature'a sahip
       // iki method olusturulabilir
       // ama Java bunlari farkli iki method olarak kabul eder
       // overriding olmaz
   }


    private void method2(){
        // private method'larda overriding olmaz
        // parent ve child'da ayni isim ve signature'a sahip
        // iki method olusturulabilir
        // ama Java bunlari farkli iki method olarak kabul eder
        // overriding olmaz
    }


    public final void method3(){
        // final keyword nerede kullanilirsa kullanilsin
        // son degeri bu, bunu degistiremezsiniz demektir
        // method'u degistirmek overriding ile mumkun olacagi icin
        // "final keyword'e sahip method'lar override edilemez"
        // diyebiliriz
    }


    // method signature = isim + parametrelerin data turleri
    // acces modifier method signature'ina dahil degildir
    // AMMMAAA overriding'de etkilidir

    // child class'daki method'un access modifier'i
    // parent class'daki method'un access modifier'indan
    // daha kisitlayici OLAMAZ
    // ( child parent'i kisitlayamaz )
    // private ==> default acc mod. ==> protected ==> public

    void method4(){
       // default access modifier
    }




    public void method5(){

    }



    // return type method signature'ina dahil degildir
    // ammmmaa overriding'de return type da etkilidir

    // parent class'daki method'un return type'i
    // - void veya primitive ise,
    //   child class'daki method da ayni return type sahip olmalidir

    public int method6(){

       return 0;
    }




    public void method7(){

    }




    // parent class'daki method'un return type'i
    // non - primitive ise,
    // child class'daki method da
    // ya ayni return type'a
    // ya da o class'in child class'i olan bir return type'a
    // sahip olmalidir
    // buna Covariant denir


    public Integer method8(){

       return 0;
    }










    public Object method9(){

        return null;
    }







    public void method10(){

    }























}
