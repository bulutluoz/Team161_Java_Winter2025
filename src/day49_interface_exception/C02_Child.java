package day49_interface_exception;

import java.util.ArrayList;
import java.util.List;

public class C02_Child implements I01_Interface{

    /*

        Bir Interface'e sonradan bir method eklenirse
        o interface'i daha onceden implements eden TUM CLASS'lar
        yeniMethod()'u kendilerine uyarlamak zorunda kalirlar

        Proje buyukse ve interface'i cok fazla class implement ettiyse
        sonradan eklenen method KAOS olusturabilir

        Java8 ile developer'larin istegi uzerine
        Java bu kaos'u olusturmadan interface'lere method ekleyebilmek icin
        bir istisna getirmistir.


     */

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
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
