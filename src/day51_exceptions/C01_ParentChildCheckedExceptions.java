package day51_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ParentChildCheckedExceptions {



    public static void main(String[] args) {

        // day50 package'ndaki deneme.txt dosyasindaki
        // yazilari konsolda yazdirin

        // Java ile bilgisayarimizda var olan bir dosyaya erismek icin
        // dosya yolunu kullanarak File Input Stream olusturmaliyiz

        String dosyaYolu = "src/day50_exceptions/deneme.txt";

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(dosyaYolu);
            // fileInputStream objesini kullanarak
            // dosyadaki karakterleri consolda yazdirmak icin

            int k = 0;
            while ((k = fileInputStream.read()) != (-1)) {
                // Unhandled exception: java.io.IOException
                System.out.print((char) k);}

        } catch (FileNotFoundException e) {

            System.out.println("Dosya bulunamadi");

        } catch (IOException e) {

            System.out.println("Dosya okunamadi");

            }

        }




}
