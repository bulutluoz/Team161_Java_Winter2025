package day43_constructorCall_ClassUyeleriniKullanma;

public class C08_Child extends C07_Parent{

    String str = "Child class";
    String t = "Hamza";
    String k = "Ahmet";

    public void method2(){
        System.out.println("Child method2");
    }
    public void method4(){
        System.out.println("Child method4");
    }

    public static void main(String[] args) {
        C08_Child obj = new C08_Child();
        obj.method1();
    }

    public void method1(){

        String str = "Child class method str";
        String t = "Cansu";
        String z = "Oguzhan";

        System.out.println(str); // Child class method str
        // buradan class level'daki str'i yazdirmak istersek
        System.out.println(this.str); // Child class
        // buradan parent class'daki str'i yazdirmak istersek
        System.out.println(super.str); // Java candir

        System.out.println(s); // Anil
        System.out.println(this.s); // Anil
        System.out.println(super.s); // Anil

        System.out.println(t); // Cansu
        System.out.println(this.t); // Hamza
        // System.out.println(super.t); // parent class'da olmadigi icin CTE


        System.out.println(z); // Oguzhan
        // System.out.println(this.z); // class level'da ve parent'da yok CTE
        // System.out.println(super.z); // parent class'da olmadigi icin CTE

        System.out.println(k); // Ahmet
        System.out.println(this.k); // Ahmet
        // System.out.println(super.k); // parent'da k yok CTE

        method2(); // Child method2
        this.method2(); // Child method2
        super.method2(); // Parent method2

        method4(); // Child method4
        this.method4(); // Child method4
        // super.method4(); // parent class'da method4() yok

        method3(); // Parent method3
        this.method3(); // Parent method3
        super.method3(); // Parent method3
    }
}
