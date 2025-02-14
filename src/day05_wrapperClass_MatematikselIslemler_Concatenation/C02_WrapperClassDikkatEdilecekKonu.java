package day05_wrapperClass_MatematikselIslemler_Concatenation;

public class C02_WrapperClassDikkatEdilecekKonu {

    public static void main(String[] args) {


        int sayiInt = 23;
        double sayiDouble = 45.3;


        double a = sayiInt;
        int b = (int)sayiDouble;


        // auto widening ve explicit narrowing Wrapper Class'lar icin de gecerli midir?

        Short shrtWrap = 24;
        Integer intWrap = 34;

        // Wrapper Class'lar non-primitive data turleridir
        // Non-primitive data turlerinde casting sadece Parent-Child class'lar arasinda olur
        // Wrapper class'larin arasinda boyle bir iliski olmadigindan
        // Casting yapilamaz

//        Integer ab = shrtWrap;
//        Integer ac = (Integer)shrtWrap; // Inconvertible types; cannot cast 'Short' to 'Integer'
//        Short bc = intWrap;
//        Short bd = (Short)intWrap;


        // Eger illa da cast yapmaniz istenirse
        // intWrap variable'inin degerini Double bir degiskene atayin

        // once intWrap 'i primitive int bir variable'a atama yapariz
        int geciciInt = intWrap;

        // sonra gecici primitive int variable'a double variable'a cast ederiz
        double geciciDouble = geciciInt;

        // artik wrapper double variable'a atama yapabiliriz

        Double wrapDouble = geciciDouble;

        System.out.println("Double'a cast edilen sayi : " + wrapDouble); // 34.0




    }
}
