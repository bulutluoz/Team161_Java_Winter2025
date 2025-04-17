package day46_overriding_Pollymorphism;

import java.util.List;

public class C02_Child extends C01_Parent{





    public static void method1(){

    }






    public  void method2(){

    }






    public void method3_(){

        // CTE verdigi icin ismi 3_ yaptik
    }















    protected void method4(){
        // parent class'daki method4
        // default access modifier'a sahip oldugundan
        // child class'daki method'un access modifier'i
        // default acc mod, protected, public
    }

    public void method5(){
        // parent class'daki method5
        // public modifier'a sahip oldugundan
        // child class'daki method'un access modifier'i
        // sadece public olabilir
    }







    public int method6(){
        // parent class'daki method6'nin
        // return type'i  int oldugundan
        // child class'daki method'un return type'i
        // sadece int olabilir
        return 10;
    }

    public void method7(){
        // parent class'daki method7'nin
        // return type'i  void oldugundan
        // child class'daki method'un return type'i
        // sadece void olabilir
    }








    public Integer method8(){

        // parent class'daki method8'nin
        // return type'i  Integer oldugundan
        // child class'daki method'un return type'i
        // Integer veya Integer'in child'i olan bir class olabilir
        // Integer'in bildigimiz bir child class'i olmadigindan
        // method8'in return type'i sadece Integer olabilir

        return 0;
    }



    public List<String> method9(){
        // parent class'daki method9'un
        // return type'i  Object oldugundan
        // child class'daki method'un return type'i
        // Object veya Object'in child'i olan
        // String, Integer, Lis<>, Short .....    olabilir

        return null;
    }


    @Override
    public void method10() {

        super.method10();

        // eger hem overridden hem de overriding method'un
        // birlikte calismasini istersek
        // child class'daki method'a super.methodismi() yazabiliriz
    }


}
