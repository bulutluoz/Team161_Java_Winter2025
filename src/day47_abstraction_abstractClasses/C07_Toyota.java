package day47_abstraction_abstractClasses;

public abstract class C07_Toyota extends C05_KuralciArabaClass {

    /*
        Abstract bir parent'in
        Abstract bir child'i olabilir

        Abstract Child'in amaci
        Parent'daki genel kurallari kendi child'lari icin uyarlama
        veya kendi child'lari icin yeni kurallar koyma olabilir

        ornegin; toyota class'i
        arac class'inda belirlenen genel kurallari
        tum toyota araclar icin UYARLAYABILIR
        veya tum toyota'larin sahip oldugu
        YENI KURALLAR ekleyebilir
     */

    public void motor(){
        System.out.println("Toyota araclar Toyota motor kullanir");
    }

    public void klima(){
        System.out.println("Toyota araclar cevreci klima kullanir");
    }

    public void marka(){
        System.out.println("Toyota Marka");
    }

    public abstract void guvelikStandardi();
    public abstract void fren();

}
