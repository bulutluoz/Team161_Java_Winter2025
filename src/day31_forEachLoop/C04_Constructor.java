package day31_forEachLoop;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class C04_Constructor {

    String isim = "Ali";

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        ArrayList<String> isimler = new ArrayList<>();


        Random random = new Random();

        // System.out.println(isim);

           C04_Constructor     obj              =           new      C04_Constructor()     ;
        //    Class ismi    obje ismi    atama isareti    keyword       Constructor


        // Bir class'dan object olusturabilmek ve ilk degeri atamak (initialization) icin
        // MUTLAKA bir constructor calismalidir

        System.out.println(obj.isim);



    }
}
