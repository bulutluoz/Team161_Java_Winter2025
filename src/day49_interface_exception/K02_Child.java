package day49_interface_exception;

import java.util.ArrayList;
import java.util.List;

public class K02_Child implements I01_Interface{

    /*

        Bir Interface'e sonradan bir method eklenirse
        o interface'i daha onceden implements eden TUM CLASS'lar
        yeniMethod()'u kendilerine uyarlamak zorunda kalirlar

        Proje buyukse ve interface'i cok fazla class implement ettiyse
        sonradan eklenen method KAOS olusturabilir

        Java8 ile developer'larin istegi uzerine
        Java bu kaos'u olusturmadan interface'lere method ekleyebilmek icin
        bir istisna getirmistir.


        static veya default keyword' kullanilarak
        interface icinde body'si olan
        yani child class'lar tarafindan uyarlanmak zorunda olmayan
        method'lar olusturulabilir

        bu iki keyword'un farki
        o method'lara erisim yontemindedir
     */

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        // static keyword kullanan istisnai method'lar
        // interfaceIsmi.methodismi() seklinde kullanilabilir

        I01_Interface.method8();
        // Bu method static keyword kullandigi icin,
        // interface icinde olmasina ragmen body'si vardir

        // default keyword kullanan istisnai method'lar ise obje uzerinden
        // objeIsmi.methodismi() seklinde kullanilabilir

        I01_Interface obj = new K02_Child();
        obj.method7();
        // bu method default keyword kullandigi icin,
        // child class'larin implement etmesi zorunlu degil

    }


    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

    @Override
    public String method4() {
        return null;
    }

    @Override
    public double method5() {
        return 0;
    }

    @Override
    public void yeniMethod() {

    }
}
