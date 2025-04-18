package day47_abstraction_abstractClasses;

public class C06_Opel extends C05_KuralciArabaClass{


    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }

    @Override
    public void aku() {

    }

    public static void main(String[] args) {

        C06_Opel opel1 = new C06_Opel();
        opel1.aku();
        opel1.motor();
        opel1.teker();

        opel1.klima();
        opel1.sunroof();
    }
}
