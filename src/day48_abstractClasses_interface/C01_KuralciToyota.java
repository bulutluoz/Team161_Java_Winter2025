package day48_abstractClasses_interface;



public abstract class C01_KuralciToyota {


    // oncelikle child class'larin kendisine uyarlamasi zorunlu olan method'lari yazalim

    public abstract void motor();
    // abstract method'lar klasik method'lardan ziyade
    // standartlari belirleyen bir cumle gibidir
    // 8.satirdaki method'u soyle turkcelestirebiliriz :
    // C01 class'ini parent edinen her child class motor() bulundurmak zorundadir

    public abstract void teker();


    // child class'larin bulundurmasi mecbur olmayan method'lari
    // concrete (abstract olmayan) method olarak olusturabiliriz

    public void sunroof(){
        System.out.println("Toyota araclarda sunroof opsiyoneldir");
    }

    public void xenonFar(){
        System.out.println("Toyota araclarda xenon opsiyoneldir");
    }
}
