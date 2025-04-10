package day42_inheritance;

public class C06_Child extends C05_Parent{

    int childInt = 67;
    String childString = "Java bir tane";


    public static void main(String[] args) {

        /*
            Child class'da olusturulan bir obje
            OTOMATIK olarak parent class'daki TUM OZELLIKLERE sahip olur



         */


        C06_Child child1 = new C06_Child();
        System.out.println(child1.childInt);
        System.out.println(child1.childString);
        System.out.println(child1.parentInt);
        System.out.println(child1.parentStr);


    }


}
