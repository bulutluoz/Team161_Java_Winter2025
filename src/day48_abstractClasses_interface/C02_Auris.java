package day48_abstractClasses_interface;

import java.util.ArrayList;
import java.util.List;

public class C02_Auris extends C01_KuralciToyota{


    @Override
    public void motor() {
        System.out.println("Auris motor");
    }

    @Override
    public void teker() {
        System.out.println("Auris teker");

    }


    public static void main(String[] args) {

        // C01_KuralciToyota toyota = new C01_KuralciToyota();
        // 'C01_KuralciToyota' is abstract; cannot be instantiated
        // Toyota class'i abstract oldugundan OBJE OLUSTURULAMAZ
        // Cunku boyle bir obje olusturulsa
        // Toyota class'indaki abstract motor() ve teker() method'lari
        // calisamayacagi icin sorun olusur
        // toyota.motor();
        // toyota.teker();
        // toyota.sunroof();
        // toyota.xenonFar();


        // List<String> liste = new List<>();
        // 'List' is abstract; cannot be instantiated

        List<String> liste = new ArrayList<>();
        // List abstract oldugundan esitligin saginda kullanamayiz
        // esitligin saginda List'in child'i olan ArrayList() kullandik


        C01_KuralciToyota toyota1 = new C02_Auris();
        toyota1.motor(); // Auris motor
        toyota1.teker(); // Auris teker
        toyota1.xenonFar(); // Toyota araclarda xenon opsiyoneldir
        toyota1.sunroof(); // Toyota araclarda sunroof opsiyoneldir

    }



}
