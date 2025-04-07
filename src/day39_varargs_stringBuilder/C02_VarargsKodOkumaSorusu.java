package day39_varargs_stringBuilder;

public class C02_VarargsKodOkumaSorusu {

    public static void main(String[] args) {

        islemYap(2,"Ali","Veli","Can"); // b[2] ==> Can      Can. length ==> 3
        islemYap(0,"Sinan"); // b={"Sinan"}    b[0] ==> Sinan      Sinan. length ==> 5

        islemYap(4); // b = {}    b[4]==>  ArrayIndexOutOfBoundsException

    }


    public static void islemYap(int a, String... b){

        // a= 2
        // b = { "Ali","Veli","Can" }

        System.out.println( b[a].length() ); // b[2] ==> Can      Can. length ==> 3

    }
}
